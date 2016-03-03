package com.bank.web.service;

import com.bank.web.domain.BoardVO;

public interface BoardService {
	/*	// Database 에서 CRUD
	// create
	// read
	// update
	// delete
	public AccountVO getAccount(String userid);
	
	// 2. 입금
	public String deposit(int money);
	
	// 3. 출금
	public String withdraw(int money);
	
	// 4. 잔액조회
	public String search();*/
	
	public BoardVO[] selectBoard();	//연식
	public int insertBoard(String id, String title, String context);	//연식
	public BoardVO selectDetail(int index);	//연식
}
