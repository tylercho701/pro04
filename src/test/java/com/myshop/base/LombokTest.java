package com.myshop.base;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myshop.dto.SampleDTO;

public class LombokTest {
	//mybatis 정보 불러오기
	private static final Logger logger = LoggerFactory.getLogger(LombokTest.class);
	
	@Test
	public void test() {
		SampleDTO sample = new SampleDTO();
		sample.setField1("조교행");
		sample.setField2(100);
		sample.setField3(174.3);
		logger.info(sample.toString());
	}
}
