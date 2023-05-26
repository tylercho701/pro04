package com.myshop.dto;

import lombok.Data;

@Data
public class NoticeDTO {
	public int no;
	public String title;
	public String content;
	public String author;
	public String regdate;
	public int readcnt;
}