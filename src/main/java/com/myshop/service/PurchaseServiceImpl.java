package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.PurchaseDAO;
import com.myshop.dto.PurchaseDTO;

@Service
public class PurchaseServiceImpl implements PurchaseService {
	
	@Autowired
	PurchaseDAO pdao;

	// 구매 리스트
	@Override
	public List<PurchaseDTO> purchaseList() throws Exception {
		List<PurchaseDTO> pList = pdao.purchaseList();
		return pList;
	}

	// 개인별 구매 리스트
	@Override
	public List<PurchaseDTO> purchaseListById(PurchaseDTO pdto) throws Exception {
		List<PurchaseDTO> pList = pdao.purchaseListById(pdto);
		return pList;
	}

	// 구매하기 / 배송 상태 : 배송 전
	@Override
	public void purchaseInsert(PurchaseDTO pdto) throws Exception {
		pdao.purchaseInsert(pdto);
	}

	// 구매 후 배송 정보 입력 / 배송 상태 : 배송 중
	@Override
	public void purchaseInProgress(PurchaseDTO pdto) throws Exception {
		pdao.purchaseInProgress(pdto);
	}

	// 구매 후 관리자가 처리 / 배송 상태 : 배송 완료
	@Override
	public void purchaseDoneExpress(PurchaseDTO pdto) throws Exception {
		pdao.purchaseDoneExpress(pdto);
	}

	// 배송 중 혹은 배송 완료 상태에서 사용자가 반품 접수 / 배송 상태 : 반품 접수
	@Override
	public void purchaseRequestReturnFromMember(PurchaseDTO pdto) throws Exception {
		pdao.purchaseRequestReturnFromMember(pdto);
	}

	// 반품 접수 후 관리자가 처리 / 배송 상태 : 반품 완료
	@Override
	public void purchaseRequestDoneReturn(PurchaseDTO pdto) throws Exception {
		pdao.purchaseRequestDoneReturn(pdto);
	}
}