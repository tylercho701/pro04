package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.CartDAO;
import com.myshop.dto.CartDTO;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CartDAO cdao;
	
	// 장바구니 전체 목록 조회
	@Override
	public List<CartDTO> cartList() throws Exception {
		List<CartDTO> cartList = cdao.cartList();
		return cartList;
	}

	// 사용자 기준 장바구니 리스트 조회
	@Override
	public List<CartDTO> cartListById(CartDTO cdto) throws Exception {
		List<CartDTO> cartList = cdao.cartListById(cdto);
		return cartList;
	}

	// 장바구니 추가
	@Override
	public void cartInsert(CartDTO cdto) throws Exception {
		cdao.cartInsert(cdto);
	}

	// 장바구니에 담은 상품의 수량 수정만 변경 가능
	@Override
	public void cartUpdate(CartDTO cdto) throws Exception {
		cdao.cartUpdate(cdto);
	}

	// 장바구니 삭제
	@Override
	public void cartDelete(CartDTO cdto) throws Exception {
		cdao.cartDelete(cdto);
	}
}