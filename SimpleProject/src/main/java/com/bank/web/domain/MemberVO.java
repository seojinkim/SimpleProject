package com.bank.web.domain;

import org.springframework.stereotype.Component;

@Component
public class MemberVO {
	private String id;
	private String password;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "MemberVO [아이디" + getId() + ", 비밀번호=" + getPassword() + ", 이름=" + getName() + "]";
	}

}
