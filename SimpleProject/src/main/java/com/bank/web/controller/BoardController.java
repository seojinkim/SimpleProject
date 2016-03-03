package com.bank.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String BoardList(Model model) {

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
	public String BoardInsertForm(Model model) {
		return "board/boardInsertForm";
	}

	/*// 게시판 글 작성
	@RequestMapping(value = "/boardInsert", method = RequestMethod.GET)
	public String BoardInsert(@RequestParam("title") String title, @RequestParam("context") String context,
			HttpSession session, Model model) {

		MemberVO temp = new MemberVO();
		temp = (MemberVO) session.getAttribute("member");
		
		board.setId(temp.getId());
		board.setTitle(title);
		board.setContext(context);

		if (board == null) {
			System.out.println("내용이 없습니다.");
		} else {
			System.out.println("여기들어왔니~?");

			model.addAttribute("boardList", boardList);
		}

		return "board/boardList";
	}
*/
	/*
	 * @Autowired AccountServiceImpl accountService;
	 * 
	 * // 내 계좌페이지 이동
	 * 
	 * @RequestMapping(value = "/myAccount/{userid}", method =
	 * RequestMethod.GET) public String myAccount(@PathVariable("userid") String
	 * userid, Model model) {
	 * 
	 * AccountVO acc = new AccountVO(); acc = accountService.getAccount(userid);
	 * if (acc == null) { System.out.println("계좌정보가 없습니다."); } else {
	 * System.out.println("내 계좌정보 : " + acc.getAccountNo()); System.out.println(
	 * "내 계좌 잔액 : " + acc.getMoney()); System.out.println("내 계좌 비번 : " +
	 * acc.getPassword()); System.out.println("내 통장" + acc.getTitle());
	 * model.addAttribute("acc", acc); model.addAttribute("id", userid); }
	 * 
	 * return "account/myAccount"; }
	 * 
	 * // 계좌 개설하기
	 * 
	 * @RequestMapping(value = "/openAccount", method = RequestMethod.GET)
	 * public String openAccount(Model model, HttpSession session) {
	 * 
	 * return "account/myAccount"; }
	 * 
	 * // 입금하기
	 * 
	 * @RequestMapping(value = "/deposit", method = RequestMethod.GET) public
	 * String deposit(Model model, HttpSession session) {
	 * 
	 * return "account/myAccount"; }
	 * 
	 * // 출금하기
	 * 
	 * @RequestMapping(value = "/withdraw", method = RequestMethod.GET) public
	 * String withdraw(Model model, HttpSession session) {
	 * 
	 * return "account/myAccount"; }
	 * 
	 * // 계좌해지
	 * 
	 * @RequestMapping(value = "/removeAccount", method = RequestMethod.GET)
	 * public String removeAccount(Model model, HttpSession session) {
	 * 
	 * return "account/myAccount"; }
	 */
}
