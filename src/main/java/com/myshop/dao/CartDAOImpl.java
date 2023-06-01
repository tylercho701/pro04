package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.CartDTO;

@Repository
public class CartDAOImpl implements CartDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	// 전체 장바구니 목록
	@Override
	public List<CartDTO> cartList() throws Exception {
		return sqlSession.selectList("cart.cartList");
	}
	
	// 아이디 기준 장바구니 조회
	@Override
	public List<CartDTO> cartListById(CartDTO cdto) throws Exception {
		return sqlSession.selectList("cart.cartListById");
	}
	
	// 장바구니 추가
	@Override
	public void cartInsert(CartDTO cdto) throws Exception {
		sqlSession.insert("cart.cartInsert");
	}
	
	// 장바구니 변경 (수량만 조절 가능)
	@Override
	public void cartUpdate(CartDTO cdto) throws Exception {
		sqlSession.update("cart.cartUpdate");
	}
	
	// 장바구니 삭제
	@Override
	public void cartDelete(CartDTO cdto) throws Exception {
		sqlSession.delete("cart.cartDelete");
	}
	
}