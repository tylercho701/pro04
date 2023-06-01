package com.myshop.dto;

import lombok.Data;

@Data
public class CartDTO {
	private int cartid;
	private String productid;
	private int cartquantity;
	private String id;
}