package com.multi.quizwiki.service;

import com.multi.quizwiki.dto.MemberDTO;

public interface MemberService {
	
	//로그인
	MemberDTO login(MemberDTO loginUser);
	
	//아이디 중복
	int idCheck(MemberDTO member_id) throws Exception;
	
	//회원가입
	void register(MemberDTO user) throws Exception;
	
	//sms
	public void certifiedPhoneNumber(String telnum, String numStr);
	
}
