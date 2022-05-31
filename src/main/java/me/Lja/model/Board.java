package me.Lja.model;

import java.time.LocalDateTime;

public class Board {
	Long bno;
	String content;
	String writer;
	LocalDateTime regDate;
	LocalDateTime updateDate;
	
	public Board(Long bno, String content, String writer, LocalDateTime regDate, LocalDateTime updateDate) {
		this.bno = bno;
		this.content = content;
		this.writer = writer;
		this.regDate = regDate;
		this.updateDate = updateDate;
	}

	public Long getBno() {
		return bno;
	}

	public void setBno(Long bno) {
		this.bno = bno;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", content=" + content + ", writer=" + writer + ", regDate=" + regDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	public Board() {}
}
