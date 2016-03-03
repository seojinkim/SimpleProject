package com.bank.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bank.web.domain.MemberVO;
import com.bank.web.mapper.MemberMapper;
import com.bank.web.serviceImpl.MemberServiceImpl;

@Controller
@SessionAttributes("member")
@RequestMapping("/member")
public class MemberController {
	@Autowired
	MemberVO member;
	@Autowired
	MemberServiceImpl service;

	@RequestMapping(value = "/loginForm")
	public String loginForm(Model model) {

		return "member/loginForm";
	}

	@RequestMapping(value = "/login")
	public String login(@RequestParam("id") String id, @RequestParam("password") String password, HttpSession session,
			Model model) {
		System.out.println("넘어온 아이디" + id);
		System.out.println("넘어온 패스워드" + password);
		MemberVO member = new MemberVO();
		String existId = service.existCheck(id);
		String message = "", page = "";
		if (existId == null) {
			message = "아이디가 존재하지 않습니다.";
			page = "member/loginForm";
		} else {
			member.setId(id);
			member.setPassword(password);
			member = service.login(member);
			if (member == null) {
				message = "비밀번호가 일치하지 않습니다.";
				page = "member/loginForm";
			} else {

				message = member.getName();
				session.setAttribute("member", member);
				model.addAttribute("message", message);
				page = "redirect:/board/boardList";
				System.out.println("로그인 후 message : " + message);
			}

		}
		return page;

	}

	@RequestMapping(value = "/joinForm")
	public String joinForm(Model model) {

		return "member/joinForm";
	}

	@RequestMapping(value = "/join")
	public String join(@RequestParam("id") String id, @RequestParam("password") String password,
			@RequestParam("name") String name, Model model) {

		member.setId(id);
		member.setName(name);
		member.setPassword(password);

		System.out.println(member.toString());
		int result = service.join(member);
		if (result == 0) {
			System.out.println("회원가입 실패");

		} else if (result == 1) {
			System.out.println("회원가입 성공");
		}

		// model.addAttribute("message","회원가입이 완료");
		return "member/loginForm";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model, SessionStatus status) {
		status.setComplete();
		System.out.println("로그아웃!");
		return "member/loginForm";
	}

	@RequestMapping(value = "/updateForm", method = RequestMethod.GET)
	public String updateForm() {
		return "member/updateForm";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@RequestParam("password") String password, @RequestParam("name") String name,
			HttpSession session, Model model) {

		MemberVO temp = new MemberVO();
		temp = (MemberVO) session.getAttribute("member");
		System.out.println("화면에서 넘어온 비번 " + password);
		System.out.println("화면에서 넘어온 이름 " + name);

		member.setId(temp.getId());
		member.setPassword(password);
		member.setName(name);
		int result = service.updateMember(member);
		String page = "member/detail";
		if (result == 1) {
			System.out.println("회원 수정 성공");
			temp.setPassword(password);
			temp.setName(name);

			session.setAttribute("member", temp);
			page = "redirect:/board/boardList";
		} else {
			System.out.println("회원 수정 실패");
			page = "member/updateForm";
		}

		return page;
	}

	@RequestMapping(value = "/withdrawal/{id}", method = RequestMethod.GET)
	public String remove(
			@PathVariable("id") String id, 
			HttpSession session, 
			SessionStatus status) {
		System.out.println("삭제 파라미터 아이디 " + id);
		int result = service.remove(id);
		String page = "";
		if (result == 1) {
			System.out.println("회원 삭제 성공");
			status.setComplete();
			page = "redirect:/member/loginForm";
		} else {
			System.out.println("회원 삭제 실패");
			page = "redirect:/member/updateForm";
		}

		return page;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * @RequestMapping(value = "/detail", method = RequestMethod.GET) public
	 * String detail() { return "member/detail"; }
	 * 
	 * 
	 * 
	 * 
	 */
}
