package com.myshop.service;

import java.util.List;

import com.myshop.dto.CategoryDTO;

public interface CategoryService {
	public List<CategoryDTO> categoryList() throws Exception;
	public List<CategoryDTO> categoryListByGroup(CategoryDTO cdto) throws Exception;
	public CategoryDTO categoryDetail(CategoryDTO cdto) throws Exception;
	public void categoryInsert(CategoryDTO cdto) throws Exception;
	public void categoryUpdate(CategoryDTO cdto) throws Exception;
	public void categoryDelete(CategoryDTO cdto) throws Exception;
}