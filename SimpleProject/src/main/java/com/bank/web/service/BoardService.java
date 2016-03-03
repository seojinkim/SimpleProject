package com.bank.web.service;

import com.bank.web.domain.BoardVO;

public interface BoardService {

	public BoardVO[] selectBoard(); // 연식

	public int insertBoard(String id, String title, String context); // 연식

	public BoardVO selectDetail(int index); // 연식

	public int updateBoard(String title, String context, int index);

	public int deleteBoard(int index);

	public String selectUserWritten(int index, String id);
}
