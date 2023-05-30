package com.myshop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.myshop.dto.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;

	// 회원 목록
	@Override
	public List<MemberDTO> memberList() throws Exception {
		return sqlSession.selectList("member.memberList");
	}

	// 회원 수
	@Override
	public int memberCount() throws Exception {
		return sqlSession.selectOne("member.memberCount");
	}

	// 회원 정보 조회
	@Override
	public MemberDTO memberDetail(String id) throws Exception {
		return sqlSession.selectOne("member.memberDetail");
	}

	// 회원 로그인 : ctrl에서 처리
	@Override
	public MemberDTO memberSignIn(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.memberSignIn");
	}

	// 회원 로그인 : DAO에서 처리
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		MemberDTO member = sqlSession.selectOne("member.loginCheck", mdto);
		if(member.getId().equals(mdto.getId()) && member.getPw().equals(mdto.getPw())) {
			return member;
		} else {
			member = null;
		}
		return member;
	}

	// 회원 로그인 : Ajax에서 처리
	@Override
	public MemberDTO memberLogin(MemberDTO mdto) throws Exception {
		return sqlSession.selectOne("member.memberLogin", mdto);
	}

	// 회원가입
	@Override
	public void memberInsert(MemberDTO mdto) throws Exception {
		sqlSession.insert("member.memberInsert");
	}

	// 회원 저옵 변경
	@Override
	public void memberUpdate(MemberDTO mdto) throws Exception {
		sqlSession.update("member.memberUpdate");
	}

	// 회원 탈퇴
	@Override
	public void memberDelete(String id) throws Exception {
		sqlSession.delete("member.memberDelete");
	}
}