package com.bank.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class AccountController {
	/*
	@Autowired
	AccountServiceImpl accountService;

	// 내 계좌페이지 이동
	@RequestMapping(value = "/myAccount/{userid}", method = RequestMethod.GET)
	public String myAccount(@PathVariable("userid") String userid, Model model) {

		AccountVO acc = new AccountVO();
		acc = accountService.getAccount(userid);
		if (acc == null) {
			System.out.println("계좌정보가 없습니다.");
		} else {
			System.out.println("내 계좌정보 : " + acc.getAccountNo());
			System.out.println("내 계좌 잔액 : " + acc.getMoney());
			System.out.println("내 계좌 비번 : " + acc.getPassword());
			System.out.println("내 통장" + acc.getTitle());
			model.addAttribute("acc", acc);
			model.addAttribute("id", userid);
		}
	
		return "account/myAccount";
	}

	// 계좌 개설하기
	@RequestMapping(value = "/openAccount", method = RequestMethod.GET)
	public String openAccount(Model model, HttpSession session) {

		return "account/myAccount";
	}

	// 입금하기
	@RequestMapping(value = "/deposit", method = RequestMethod.GET)
	public String deposit(Model model, HttpSession session) {

		return "account/myAccount";
	}

	// 출금하기
	@RequestMapping(value = "/withdraw", method = RequestMethod.GET)
	public String withdraw(Model model, HttpSession session) {

		return "account/myAccount";
	}

	// 계좌해지
	@RequestMapping(value = "/removeAccount", method = RequestMethod.GET)
	public String removeAccount(Model model, HttpSession session) {

		return "account/myAccount";
	}*/
}
