package com.myshop.dto;

import lombok.Data;

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
	public int getPruchaseid() {
		return pruchaseid;
	}
	public void setPruchaseid(int pruchaseid) {
		this.pruchaseid = pruchaseid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPurchasedat() {
		return purchasedat;
	}
	public void setPurchasedat(String purchasedat) {
		this.purchasedat = purchasedat;
	}
	public String getExid() {
		return exid;
	}
	public void setExid(String exid) {
		this.exid = exid;
	}
	public String getExcode() {
		return excode;
	}
	public void setExcode(String excode) {
		this.excode = excode;
	}
	public String getExstatus() {
		return exstatus;
	}
	public void setExstatus(String exstatus) {
		this.exstatus = exstatus;
	}
	public String getPurchasetype() {
		return purchasetype;
	}
	public void setPurchasetype(String purchasetype) {
		this.purchasetype = purchasetype;
	}
	public int getPurchasecode() {
		return purchasecode;
	}
	public void setPurchasecode(int purchasecode) {
		this.purchasecode = purchasecode;
	}
	public int getPurchaseprice() {
		return purchaseprice;
	}
	public void setPurchaseprice(int purchaseprice) {
		this.purchaseprice = purchaseprice;
	}
}