package com.bank.web.mapper;

import org.springframework.stereotype.Repository;

import com.bank.web.domain.MemberVO;

@Repository
public interface MemberMapper {

	public MemberVO selectMember(String id, String password);

	public int insertMember(String id, String password, String name);

	public int updateMember(String password, String name);

	public int deleteMember(String id);

}
