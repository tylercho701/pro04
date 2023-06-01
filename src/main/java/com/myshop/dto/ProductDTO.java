package com.myshop.dto;

import lombok.Data;

@Data
public class ProductDTO {
	private int productid;
	private String productname;
	private int productamount;
	private String pic1;
	private String pic2;
	private String pic3;
	private String categoryid;
	private int stock;
}