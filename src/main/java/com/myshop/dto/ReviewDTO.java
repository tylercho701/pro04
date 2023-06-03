package com.myshop.dto;

import lombok.Data;

public class ReviewDTO {
	private int reviewid;
	private String id;
	private String purchaseid;
	private String reviewedat;
	private String reviewtitle;
	private String reviewcontent;
	private String img;
	private int reviewpoint;
	private int readcnt;
	public int getReviewid() {
		return reviewid;
	}
	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPurchaseid() {
		return purchaseid;
	}
	public void setPurchaseid(String purchaseid) {
		this.purchaseid = purchaseid;
	}
	public String getReviewedat() {
		return reviewedat;
	}
	public void setReviewedat(String reviewedat) {
		this.reviewedat = reviewedat;
	}
	public String getReviewtitle() {
		return reviewtitle;
	}
	public void setReviewtitle(String reviewtitle) {
		this.reviewtitle = reviewtitle;
	}
	public String getReviewcontent() {
		return reviewcontent;
	}
	public void setReviewcontent(String reviewcontent) {
		this.reviewcontent = reviewcontent;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getReviewpoint() {
		return reviewpoint;
	}
	public void setReviewpoint(int reviewpoint) {
		this.reviewpoint = reviewpoint;
	}
	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
}