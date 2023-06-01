package com.myshop.service;

import java.util.List;

import com.myshop.dto.ReviewDTO;

public interface ReviewService {
	public List<ReviewDTO> reviewList() throws Exception;
	public List<ReviewDTO> reviewListById(ReviewDTO rdto) throws Exception;
	public List<ReviewDTO> reviewListByProduct(ReviewDTO rdto) throws Exception;
	public ReviewDTO reviewDetail(ReviewDTO rdto) throws Exception;
	public void reviewReadCnt(ReviewDTO rdto) throws Exception;
	public void reviewInsert(ReviewDTO rdto) throws Exception;
	public void reviewUpdate(ReviewDTO rdto) throws Exception;
	public void reviewDelete(ReviewDTO rdto) throws Exception;
}