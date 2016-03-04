package com.bank.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import com.bank.web.domain.BoardVO;
import com.bank.web.domain.MemberVO;
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

		BoardVO[] boardList = service.selectBoard();
		if (boardList == null) {
			System.out.println("게시판글이 없습니다.");
		} else {
			model.addAttribute("boardList", boardList);
		}
		return "board/boardList";
	}

	// 게시판 글 작성 폼
	@RequestMapping(value = "/boardInsertForm", method = RequestMethod.GET)
	public String boardInsertForm(Model model) {
		System.out.println("여기는??");
		return "board/boardInsertForm";
	}

	// 게시판 글 작성
	@RequestMapping(value = "/boardInsert", method = RequestMethod.POST)
	public String boardInsert(@RequestParam("title") String title, @RequestParam("context") String context,
			HttpSession session, Model model) {
		System.out.println("여기도??");
		MemberVO temp = new MemberVO();
		temp = (MemberVO) session.getAttribute("member");

		System.out.println(title + " " + context + " " + temp.getId());

		int result = service.insertBoard(temp.getId(), title, context);
		String page = "";
		if (result == 1) {
			page = "redirect:/board/boardList";
		} else {
			System.out.println("글 작성 실패");
			// page = "member/updateForm";
		}

		return page;
	}

	/*
	 * // 게시판 글 읽기
	 * 
	 * @RequestMapping(value = "/boardDetailForm", method = RequestMethod.GET)
	 * public String boardDetailForm(Model model) {
	 * System.out.println("야호~~~~11"); return "board/boardDetail"; }
	 */
	// 게시판 글 읽기
	@RequestMapping(value = "/boardDetail", method = RequestMethod.GET)
	public String boardDetail(HttpServletRequest request, Model model) {
		System.out.println("야호~~~~");

		board = service.selectDetail(Integer.parseInt(request.getParameter("idx")));
		System.out.println("오잉?"+board);
		model.addAttribute("board", board);
		return "board/boardDetail";
	}

	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String updateForm(HttpServletRequest request, HttpSession session, Model model) {
		board = service.selectDetail(Integer.parseInt(request.getParameter("idx")));
		model.addAttribute("board", board);
		System.out.println("김서짆ㅎ" + board);
		return "board/boardUpdateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(HttpServletRequest request, HttpSession session, Model model) {

		/*BoardVO temp = new BoardVO();
		temp = (BoardVO) session.getAttribute("board");*/
		
		//board.setContext(context);
		int result = service.updateBoard(request.getParameter("title"), request.getParameter("context"), Integer.parseInt(request.getParameter("idx")));// service의
															// updateboard호출
		board = service.selectDetail(Integer.parseInt(request.getParameter("idx")));
		
		String page = "";
		if (result == 1) {
			/*temp.setContext(context);
			session.setAttribute("board", temp);*/
			model.addAttribute("board", board);
			page = "board/boardDetail";
		} else {
			System.out.println("글 수정 실패");
			page = "board/updateForm";
		}
		return page;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String remove(HttpServletRequest request) {
		int result = service.deleteBoard(Integer.parseInt(request.getParameter("idx")));
		String page = "";
		if (result == 1) {
			System.out.println("글 삭제 성공");
			page = "redirect:/board/boardList";
		} else {
			System.out.println("글 삭제 실패 ");
			page = "board/boardDetail";
		}
		return page;
	}

	/*
	 * @RequestMapping(value = "/update", method = RequestMethod.GET) public
	 * String selectUserWritten(@RequestParam("id") String id, HttpSession
	 * session, Model model) { String userid=member.getUserid();
	 * 
	 * if (userid==id) { service.selectUserWritten(index, userid); return
	 * "board/detail"; } else { return "board/detail"; }
	 */
}
