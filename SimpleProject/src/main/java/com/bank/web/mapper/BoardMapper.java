package com.bank.web.mapper;

import org.springframework.stereotype.Repository;

import com.bank.web.domain.BoardVO;

@Repository
public interface BoardMapper {

	public BoardVO[] selectBoard();

	public BoardVO[] selectBoardByTitle(String title);

	public int insertBoard(String id, String title, String context);

	public int updateBoard(String title, String context);

	public int deleteMember(String index);

	public String selectUserWritten(String index, String id);

}