package com.bank.web.mapper;

import org.springframework.stereotype.Repository;

import com.bank.web.domain.MemberVO;

@Repository
public interface MemberMapper {

	//public MemberVO selectMember(String id, String password);
	public MemberVO selectMember(MemberVO member);
	//public int insertMember(String id, String password, String name);
	public int insertMember(MemberVO member);
	
	public int updateMember(String password, String name);

	public int deleteMember(String id);
	public String selectId(String userid);
	public int updateMember(MemberVO member);

	

}
