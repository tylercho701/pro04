package com.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myshop.dao.ReviewDAO;
import com.myshop.dto.ReviewDTO;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	ReviewDAO rdao;

	// 리뷰 전체 리스트 조회
	@Override
	public List<ReviewDTO> reviewList() throws Exception {
		List<ReviewDTO> rList = rdao.reviewList();
		return rList;
	}

	// 사용자 기준 리뷰 조회
	@Override
	public List<ReviewDTO> reviewListById(ReviewDTO rdto) throws Exception {
		List<ReviewDTO> rList = rdao.reviewListById(rdto);
		return rList;
	}

	// 상품 기준 리뷰 조회
	@Override
	public List<ReviewDTO> reviewListByProduct(ReviewDTO rdto) throws Exception {
		List<ReviewDTO> rList = rdao.reviewListByProduct(rdto);
		return rList;
	}

	// 리뷰 상세 조회
	@Override
	public ReviewDTO reviewDetail(ReviewDTO rdto) throws Exception {
		rdao.reviewReadCnt(rdto);
		ReviewDTO rDetail = rdao.reviewDetail(rdto);
		return rDetail;
	}

	// 리뷰 조회 시 readcnt + 1
	@Override
	public void reviewReadCnt(ReviewDTO rdto) throws Exception {
		rdao.reviewReadCnt(rdto);
	}

	// 리뷰 작성
	@Override
	public void reviewInsert(ReviewDTO rdto) throws Exception {
		rdao.reviewInsert(rdto);
	}

	// 리뷰 수정
	@Override
	public void reviewUpdate(ReviewDTO rdto) throws Exception {
		rdao.reviewUpdate(rdto);
	}

	// 리뷰 삭제
	@Override
	public void reviewDelete(ReviewDTO rdto) throws Exception {
		rdao.reviewDelete(rdto);
	}
}