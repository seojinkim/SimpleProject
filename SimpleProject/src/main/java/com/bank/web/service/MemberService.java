package com.bank.web.service;

import com.bank.web.domain.MemberVO;

public interface MemberService {
	public int join(MemberVO member);
	public MemberVO login(MemberVO member);
	public String existCheck(String userid);
	public int updateMember(MemberVO member);
	public int remove(String id);
	/*
	
	public MemberVO searchById(String id);
	
	public List<MemberVO> searchByName(String name);
	

	
	public int countAll();
	
	public int searchCountByName(String name);
	

	

	
	*/
}
