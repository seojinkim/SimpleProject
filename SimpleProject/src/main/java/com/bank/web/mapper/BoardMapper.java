package com.bank.web.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.bank.web.domain.BoardVO;

@Repository
public interface BoardMapper {

	public BoardVO[] selectBoard();	//연식

	public BoardVO[] selectBoardByTitle(String title);	//검색

	public int insertBoard(@Param("id") String id,  @Param("title") String title, @Param("context") String context);	//연식

	public int updateBoard(String title, String context, int index);	//민호

	public int deleteBoard(int index);	//민호

	public String selectUserWritten(int index, String id);	//민호

	public BoardVO selectDetail(int index);	//연식
}