package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.CategoryDTO;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 카테고리 리스트 전체 조회
	@Override
	public List<CategoryDTO> categoryList() throws Exception {
		return sqlSession.selectList("category.categoryList");
	}
	
	// 카테고리 그룹 기준 리스트
	@Override
	public List<CategoryDTO> categoryListByGroup(CategoryDTO cdto) throws Exception {
		return sqlSession.selectList("category.categoryListByGroup");
	}
	
	// 카테고리 상세
	@Override
	public CategoryDTO categoryDetail(CategoryDTO cdto) throws Exception {
		return sqlSession.selectOne("category.categoryDetail");
	}
	
	// 신규 카테고리 등록
	@Override
	public void categoryInsert(CategoryDTO cdto) throws Exception {
		sqlSession.insert("category.categoryInsert");
	}
	
	// 카테고리이름 변경 (categoryid나 categroup 수정 불가 / 삭제 후 다시 등록)
	@Override
	public void categoryUpdate(CategoryDTO cdto) throws Exception {
		sqlSession.update("category.categoryUpdate");
	}
	
	// 카테고리 삭제
	@Override
	public void categoryDelete(CategoryDTO cdto) throws Exception {
		sqlSession.delete("category.categoryDelete");
	}
}