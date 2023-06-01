package com.myshop.dto;

import lombok.Data;

@Data
public class PurchaseDTO {
	private int pruchaseid;
	private int productid;
	private int quantity;
	private String id;
	private String purchasedat;
	private String exid;
	private String excode;
	private String exstatus;
	private String purchasetype;
	private int purchasecode;
	private int purchaseprice;
}