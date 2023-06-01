package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.CategoryDAO;
import com.myshop.dto.CategoryDTO;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO cdao;

	// 카테고리 목록 전체 조회
	@Override
	public List<CategoryDTO> categoryList() throws Exception {
		List<CategoryDTO> cateList = cdao.categoryList();
		return cateList;
	}

	// 카테그룹 기준 카테고리 리스트 조회
	@Override
	public List<CategoryDTO> categoryListByGroup(CategoryDTO cdto) throws Exception {
		List<CategoryDTO> cateList = cdao.categoryListByGroup(cdto);
		return cateList;
	}

	// 특정 카테고리 상세 조회
	@Override
	public CategoryDTO categoryDetail(CategoryDTO cdto) throws Exception {
		CategoryDTO cateDetail = cdao.categoryDetail(cdto);
		return cateDetail;
	}

	// 카테고리 추가
	@Override
	public void categoryInsert(CategoryDTO cdto) throws Exception {
		cdao.categoryInsert(cdto);
	}

	// catename만 수정 가능
	@Override
	public void categoryUpdate(CategoryDTO cdto) throws Exception {
		cdao.categoryUpdate(cdto);
	}

	// 카테 삭제
	@Override
	public void categoryDelete(CategoryDTO cdto) throws Exception {
		cdao.categoryDelete(cdto);
	}
}