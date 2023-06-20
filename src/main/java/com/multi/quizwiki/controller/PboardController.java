package com.multi.quizwiki.controller;

import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.UrlResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.multi.quizwiki.common.FileUploadLogicService;
import com.multi.quizwiki.entity.pboard.PboardEntity;
import com.multi.quizwiki.entity.pboard.PboardReplyEntity;
import com.multi.quizwiki.entity.problem.PrintFileEntity;
import com.multi.quizwiki.entity.problem.ProblemEntity;
import com.multi.quizwiki.service.PboardService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Controller
public class PboardController {
	
	PboardService pboardService;
	FileUploadLogicService fileUpload;
	
	public PboardController() {
		
	}
	
	@Autowired
	public PboardController(PboardService pboardService , FileUploadLogicService fileUpload) {
		this.pboardService = pboardService;
		this.fileUpload = fileUpload;
	}
	

	@GetMapping("/pboard/list")
	public String show_pboard_list(Model model, 
			int cate,
			@RequestParam(defaultValue = "1") int page,
			@RequestParam(defaultValue = "20") int size
			) {
		
		PageRequest pageReq = PageRequest.of(page-1, size, Sort.by("pboardRegDate").descending());
		
		Page<PboardEntity> pboardPage = pboardService.pboard_findByCate(cate, pageReq);
		
		int totalPage = pboardPage.getTotalPages();
		
		model.addAttribute("pages",util.CalcUtil.makePagingSeq(page, 5, totalPage));
		model.addAttribute("currentPage",page);
		model.addAttribute("totalPage",totalPage);
		model.addAttribute("pboardList",pboardPage);
		
		Timestamp today = Timestamp.valueOf(LocalDateTime.of(LocalDate.now(), LocalTime.MIN));
		model.addAttribute("today",today);
		return "thymeleaf/pboard/pboard_list";
	}
	
	
	@GetMapping("/pboard/write")
	public String show_pboard_write(Model model) {
		model.addAttribute("problemCateList",pboardService.problemCate_findAll());
		model.addAttribute("state","w");
		return "thymeleaf/pboard/pboard_write";
	}
	@GetMapping("/pboard/edit")
	public String show_pboard_edit(Model model, String no) {
		model.addAttribute("problemCateList",pboardService.problemCate_findAll());
		model.addAttribute("pboard",pboardService.pboard_findById(no));
		model.addAttribute("state","e");
		return "thymeleaf/pboard/pboard_write";
	}
	
	@GetMapping("/pboard/read")
	public String show_pboard_read(Model model , String no) {
		
		PboardEntity pboard = pboardService.pboard_findById(no);
		model.addAttribute("pboard",pboard);
		model.addAttribute("cate",pboard.getPboardCateId());
		return "thymeleaf/pboard/pboard_read";
	}
	
	@GetMapping("/pboard/cbt")
	public String show_cbt(String no , Model model) {
		PboardEntity pboard = pboardService.pboard_findById(no);
		model.addAttribute("title",pboard.getPboardTitle());
		model.addAttribute("problemList",pboard.getProblemList());
		return "thymeleaf/pboard/cbt";
	}
	 
	
	
	@PostMapping(value="/pboard/write")
	@ResponseBody
	public String pboard_write(
		@RequestPart(name= "sendData") String sendData, 
		@RequestPart(name = "printfile", required = false) List<MultipartFile> printfileList) throws JsonMappingException, JsonProcessingException{
		
		PboardParseStructure pps = new PboardParseStructure(sendData);
		
		pboardService.pboard_insert(pps.getPboard(), pps.getProblemList(), 
				pps.getProblemChoiseList() ,printfileList, pps.getPrintfileArr());
		
		return pps.getPboard().getPboardId();
	}
	
	@PostMapping(value="/pboard/edit")
	@ResponseBody
	public String pboard_edit(
		@RequestPart(name= "sendData") String sendData, 
		@RequestPart(name = "printfile", required = false) List<MultipartFile> printfileList) throws JsonMappingException, JsonProcessingException{

		PboardParseStructure pps = new PboardParseStructure(sendData);
		
		pboardService.pboard_edit(pps.getPboard(), pps.getProblemList(), 
				pps.getProblemChoiseList() ,printfileList, pps.getPrintfileArr());
		
		return pps.getPboard().getPboardId();
	}
	
	private class PboardParseStructure{
		PboardEntity pboard;
		List<ProblemEntity> problemList;
		List<List<String>> problemChoiseList;
		List<Integer> printfileArr;
		
		private PboardParseStructure(String sendData) throws JsonMappingException, JsonProcessingException {
			ObjectMapper mapper = new ObjectMapper();
			Map<String,String> map = mapper.readValue(sendData, Map.class);
			this.pboard =  mapper.convertValue(map.get("pboard"), PboardEntity.class);
			this.problemList = mapper.convertValue(map.get("problem"), new TypeReference<List<ProblemEntity>>() {});
			this.problemChoiseList = mapper.convertValue(map.get("problemChoiseList"), new TypeReference<List<List<String>>>() {});
			this.printfileArr = mapper.convertValue(map.get("printfileArr"), new TypeReference<List<Integer>>() {});
		}
		
		private PboardEntity getPboard() {
			return this.pboard;
		}
		private List<ProblemEntity> getProblemList() {
			return this.problemList;
		}
		private List<List<String>> getProblemChoiseList() {
			return this.problemChoiseList;
		}
		private List<Integer> getPrintfileArr() {
			return this.printfileArr;
		}
		
	}
	
	
	@PostMapping(value="/pboard/reply/write")
	public String pboard_reply_write(PboardReplyEntity pboardReply , int cate) {
		pboardService.reply_insert(pboardReply);
		
		return "redirect:/pboard/read?no="+pboardReply.getPboardId()+"&cate="+cate;
	}
	
	
	@PostMapping(value="/pboard/find")
	@ResponseBody
	public PboardEntity pboard_get(String no) {
		return pboardService.pboard_findById(no);
	}
	
	@RequestMapping("/printfile/find/{problemId}")
	public ResponseEntity<UrlResource> printfile_fild(@PathVariable String problemId) throws MalformedURLException{
		PrintFileEntity printfile = pboardService.printfile_findByProblemId(problemId);
		UrlResource resource = new UrlResource("file:"+fileUpload.getUploadpath(printfile.getPrintfileStore()));
		
		//String encoded = UriUtils.encode(printfile.getPrintfileOrigin(),"UTF-8");
		//String contentType = "attachment; filename=\"" + encoded +"\"";
		
		return ResponseEntity.ok()
				.contentType(MediaType.IMAGE_JPEG)
				.body(resource);
	}
}
