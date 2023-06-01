package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.PurchaseDTO;

@Repository
public class PurchaseDAOImpl implements PurchaseDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 주문 전체 목록
	@Override
	public List<PurchaseDTO> purchaseList() throws Exception {
		return sqlSession.selectList("purchase.purchaseList");
	}
	
	// 주문자 기준 주문 목록 조회
	@Override
	public List<PurchaseDTO> purchaseListById(PurchaseDTO pdto) throws Exception {
		return sqlSession.selectList("purchase.purchaseListById");
	}
	
	// 주문하기
	@Override
	public void purchaseInsert(PurchaseDTO pdto) throws Exception {
		sqlSession.insert("purchase.purchaseInsert");
	}
	
	// 주문 후 배송 정보 입력 시 배송 시작
	@Override
	public void purchaseInProgress(PurchaseDTO pdto) throws Exception {
		sqlSession.update("purchase.purchaseInProgress");
	}
	
	// 배송 완료
	@Override
	public void purchaseDoneExpress(PurchaseDTO pdto) throws Exception {
		sqlSession.update("purchase.purchaseDoneExpress");
	}
	
	// 반품 접수 시
	@Override
	public void purchaseRequestReturnFromMember(PurchaseDTO pdto) throws Exception {
		sqlSession.update("purchase.purchaseRequestReturnFromMember");
	}
	
	// 반품 완료
	@Override
	public void purchaseRequestDoneReturn(PurchaseDTO pdto) throws Exception {
		sqlSession.update("purchase.purchaseDoneReturn");
	}
}