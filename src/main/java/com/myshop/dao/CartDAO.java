package com.myshop.dao;

import java.util.List;

import com.myshop.dto.CartDTO;

public interface CartDAO {
	public List<CartDTO> cartList() throws Exception;
	public List<CartDTO> cartListById(CartDTO cdto) throws Exception;
	public void cartInsert(CartDTO cdto) throws Exception;
	public void cartUpdate(CartDTO cdto) throws Exception;
	public void cartDelete(CartDTO cdto) throws Exception;
}