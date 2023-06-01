package com.myshop.dto;

import lombok.Data;

@Data
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
}