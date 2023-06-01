package com.myshop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myshop.dto.ReviewDTO;

@Repository
public class ReviewDAOImpl implements ReviewDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 리뷰 전체 리스트
	@Override
	public List<ReviewDTO> reviewList() throws Exception {
		return sqlSession.selectList("review.reviewList");
	}
	
	// 작성자 기준 리뷰 전체 리스트
	@Override
	public List<ReviewDTO> reviewListById(ReviewDTO rdto) throws Exception {
		return sqlSession.selectList("review.reviewListById");
	}
	
	// 상품 기준 리뷰 리스트
	@Override
	public List<ReviewDTO> reviewListByProduct(ReviewDTO rdto) throws Exception {
		return sqlSession.selectList("review.reviewListByProduct");
	}

	// 리뷰 상세 조회
	@Override
	public ReviewDTO reviewDetail(ReviewDTO rdto) throws Exception {
		return sqlSession.selectOne("review.reviewDetail");
	}
	
	// 리뷰 상세 로드 시 readcnt + 1
	@Override
	public void reviewReadCnt(ReviewDTO rdto) throws Exception {
		sqlSession.update("review.reviewReadCnt");
	}
	
	// 리뷰 등록
	@Override
	public void reviewInsert(ReviewDTO rdto) throws Exception {
		sqlSession.insert("review.reviewInsert");
	}
	
	// 리뷰 수정
	@Override
	public void reviewUpdate(ReviewDTO rdto) throws Exception {
		sqlSession.update("review.reviewUpdate");
	}
	
	// 리뷰 삭제
	@Override
	public void reviewDelete(ReviewDTO rdto) throws Exception {
		sqlSession.delete("review.reviewDelete");
	}
}