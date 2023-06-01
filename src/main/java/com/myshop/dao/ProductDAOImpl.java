package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 상품 전체 리스트
	@Override
	public List<ProductDTO> productList() throws Exception {
		return sqlSession.selectList("product.productList");
	}
	
	// 카테고리 아이디 기준 상품 리스트
	@Override
	public List<ProductDTO> productListByCategoryId(ProductDTO pdto) throws Exception {
		return sqlSession.selectList("product.productListByCategory");
	}
	
	// 상품 상세 정보
	@Override
	public ProductDTO productDetail(ProductDTO pdto) throws Exception {
		return sqlSession.selectOne("product.productDetail");
	}
	
	// 상품 등록
	@Override
	public void productInsert(ProductDTO pdto) throws Exception {
		sqlSession.insert("product.productInsert");
	}
	
	// 상품 정보 수정
	@Override
	public void productUpdate(ProductDTO pdto) throws Exception {
		sqlSession.update("product.productUpdate");
	}
	
	// 재고 등록
	@Override
	public void productInstock(ProductDTO pdto) throws Exception {
		sqlSession.update("product.productInstock");
	}
	
	// 상품 구매 시 재고 반영
	@Override
	public void purchaseReleaseStock(ProductDTO pdto) throws Exception {
		sqlSession.update("product.purchaseReleaseStock");
	}
}