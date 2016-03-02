package com.bank.web.domain;

import org.springframework.stereotype.Component;

@Component
public class MemberVO {
	private String userid;
	private String password;
	private String name;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", password=" + password + ", name=" + name + "]";
	}

}
