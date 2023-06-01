package com.myshop.service;

import java.util.List;

import com.myshop.dto.PurchaseDTO;

public interface PurchaseService {
	public List<PurchaseDTO> purchaseList() throws Exception;
	public List<PurchaseDTO> purchaseListById(PurchaseDTO pdto) throws Exception;
	public void purchaseInsert(PurchaseDTO pdto) throws Exception;
	public void purchaseInProgress(PurchaseDTO pdto) throws Exception;
	public void purchaseDoneExpress(PurchaseDTO pdto) throws Exception;
	public void purchaseRequestReturnFromMember(PurchaseDTO pdto) throws Exception;
	public void purchaseRequestDoneReturn(PurchaseDTO pdto) throws Exception;
}