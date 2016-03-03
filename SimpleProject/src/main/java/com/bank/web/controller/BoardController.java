package com.bank.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bank.web.domain.BoardVO;
import com.bank.web.serviceImpl.BoardServiceImpl;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	BoardVO board;
	@Autowired
	BoardServiceImpl service;

	// 로그인 후 게시판 보기
	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public String boardList(Model model) {

		System.out.println("보드보드");
		BoardVO[] boardList = service.selectBoard();
		if (boardList == null) {
			System.out.println("게시판글이 없습니다.");
		} else {
			System.out.println("여기들어왔니~?");

			model.addAttribute("boardList", boardList);
		}

		return "board/boardList";
	}

	// 게시판 글 작성 폼
	@RequestMapping(value = "/boardInsertForm", method = RequestMethod.GET)
	public String boardInsertForm(Model model) {
		return "board/boardInsertForm";
	}
}
