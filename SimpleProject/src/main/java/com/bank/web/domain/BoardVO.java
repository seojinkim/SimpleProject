package com.bank.web.domain;

import org.springframework.stereotype.Component;

@Component
public class BoardVO {
	private int idx;
	private String id;
	private String title;
	private String context;

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "BoardVO [idx=" + idx + ", id=" + id + ", title=" + title + ", context=" + context + "]";
	}

}
