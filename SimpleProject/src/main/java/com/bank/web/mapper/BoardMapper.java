package com.bank.web.mapper;

import org.springframework.stereotype.Repository;

import com.bank.web.domain.BoardVO;

@Repository
public interface BoardMapper {

	public BoardVO[] selectBoard();	//연식

	public BoardVO[] selectBoardByTitle(String title);	//검색

	public int insertBoard(String id, String title, String context);	//연식

	public int updateBoard(String title, String context);	//민호

	public int deleteMember(String index);	//민호

	public String selectUserWritten(String index, String id);	//민호
	
}