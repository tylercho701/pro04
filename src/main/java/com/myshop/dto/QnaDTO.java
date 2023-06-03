package com.myshop.dto;

public class QnaDTO {
	private int qnaid;
	private String qnatitle;
	private String qnacontent;
	private int qnatype;
	private int qnagroupid;
	private String askedat;
	private String askedby;
	private int readcnt;
	public int getQnaid() {
		return qnaid;
	}
	public void setQnaid(int qnaid) {
		this.qnaid = qnaid;
	}
	public String getQnatitle() {
		return qnatitle;
	}
	public void setQnatitle(String qnatitle) {
		this.qnatitle = qnatitle;
	}
	public String getQnacontent() {
		return qnacontent;
	}
	public void setQnacontent(String qnacontent) {
		this.qnacontent = qnacontent;
	}
	public int getQnatype() {
		return qnatype;
	}
	public void setQnatype(int qnatype) {
		this.qnatype = qnatype;
	}
	public int getQnagroupid() {
		return qnagroupid;
	}
	public void setQnagroupid(int qnagroupid) {
		this.qnagroupid = qnagroupid;
	}
	public String getAskedat() {
		return askedat;
	}
	public void setAskedat(String askedat) {
		this.askedat = askedat;
	}
	public String getAskedby() {
		return askedby;
	}
	public void setAskedby(String askedby) {
		this.askedby = askedby;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
}