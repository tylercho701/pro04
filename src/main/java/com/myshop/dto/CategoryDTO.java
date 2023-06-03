package com.myshop.dto;

import lombok.Data;

public class CategoryDTO {
	private String categoryid;
	private String categroup;
	private String catename;
	public String getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategroup() {
		return categroup;
	}
	public void setCategroup(String categroup) {
		this.categroup = categroup;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
}