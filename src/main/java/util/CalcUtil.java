package util;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CalcUtil {
	
	public static Map<String,Object> makeParamMap(String memberId, Integer problemCateId, Boolean solvRight, Date minDate,
			Date maxDate){
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("memberId",memberId);
		paramMap.put("categoryId", problemCateId);
		paramMap.put("solvRight", solvRight);
		paramMap.put("minDate", minDate);
		paramMap.put("maxDate", maxDate);
		
		return paramMap;
	}
	
	public static void addPageParam(Map<String,Object> map, int size , int page) {
		int startIndex = (page-1)*size;
		map.put("startLimit", startIndex);
		map.put("sizeLimit", size);
	}
	
	public static List<Integer> makePagingSeq(int n, int size , int max){
		List<Integer> seq = new ArrayList<Integer>();
		int pageIndex = (n-1)/size;
		int start = pageIndex*size;
		for(int i= start+1; i<= start+size; i++) {
			if(i> max) break;
			seq.add(i);
		}
		
		return seq;
	}
	
	public static int getTotalPage(int count , int size) {
		return (int)Math.ceil(count/size)+1;
	}
	
	public static boolean loginCheck(HttpServletRequest req) {
//		HttpSession session = req.getSession(false);
//		Object user = null;
//		
//		if(session != null) {
//			user = session.getAttribute("user");
//		}
//		
//		return (user!=null);
		
		return true;
	}
	
	
	public static <T> JsonNode getJsonStringAsResForm(T obj, String msg) {
		ObjectMapper mapper = new ObjectMapper();
		String data = "error";
	    try {
	    	data = mapper.writeValueAsString(obj);
	    }catch(JsonProcessingException e){
	    	e.printStackTrace();
	    }
	    
	    JsonNode jnode = mapper.createObjectNode()
                .put("data", data)
                .put("msg", msg);
	    return jnode;
	}
}
