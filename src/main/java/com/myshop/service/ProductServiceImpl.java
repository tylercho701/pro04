package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.ProductDAO;
import com.myshop.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDAO pdao;

	// 상품 전체 리스트 조회
	@Override
	public List<ProductDTO> productList() throws Exception {
		List<ProductDTO> pList = pdao.productList();
		return pList;
	}

	// categroup 기준 상품 리스트 조회
	@Override
	public List<ProductDTO> productListByCategoryId(ProductDTO pdto) throws Exception {
		List<ProductDTO> pList = pdao.productListByCategoryId(pdto);
		return pList;
	}

	// 상품 페이지 상세
	@Override
	public ProductDTO productDetail(ProductDTO pdto) throws Exception {
		ProductDTO pDetail = pdao.productDetail(pdto);
		return pDetail;
	}

	// 상품 페이지 등록
	@Override
	public void productInsert(ProductDTO pdto) throws Exception {
		pdao.productInsert(pdto);
	}

	// 상품 정보 수정
	@Override
	public void productUpdate(ProductDTO pdto) throws Exception {
		pdao.productUpdate(pdto);
	}

	// 재고 추가 등록
	@Override
	public void productInstock(ProductDTO pdto) throws Exception {
		pdao.productInstock(pdto);;
	}

	// 상품 구매되면 구매한 수량만큼 재고 차감
	@Override
	public void purchaseReleaseStock(ProductDTO pdto) throws Exception {
		pdao.purchaseReleaseStock(pdto);
	}
}