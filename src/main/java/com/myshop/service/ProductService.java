package com.myshop.service;

import java.util.List;

import com.myshop.dto.ProductDTO;

public interface ProductService {
	public List<ProductDTO> productList() throws Exception;
	public List<ProductDTO> productListByCategoryId(ProductDTO pdto) throws Exception;
	public ProductDTO productDetail(ProductDTO pdto) throws Exception;
	public void productInsert(ProductDTO pdto) throws Exception;
	public void productUpdate(ProductDTO pdto) throws Exception;
	public void productInstock(ProductDTO pdto) throws Exception;
	public void purchaseReleaseStock(ProductDTO pdto) throws Exception;
}