package com.myshop.service;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.myshop.dao.MemberDAO;
import com.myshop.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO mdao;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;

	// 회원 목록
	@Override
	public List<MemberDTO> memberList() throws Exception {
		List<MemberDTO> memberDTO = mdao.memberList();
		return memberDTO;
	}

	// 회원 수
	@Override
	public int memberCount() throws Exception {
		return mdao.memberCount();
	}

	// 회원 정보 상세
	@Override
	public MemberDTO memberDetail(String id) throws Exception {
		return mdao.memberDetail(id);
	}

	// 회원 로그인 : ctrl에서 처리
	@Override
	public MemberDTO memberSignIn(MemberDTO mdto) throws Exception {
		mdao.memberSignIn(mdto);
		return null;
	}

	// 회원 로그인 : DAO에서 처리
	@Override
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception {
		return mdao.loginCheck(mdto);
	}

	// 회원 로그인 : Ajax에서 service로 처리
	@Override
	public boolean memberLogin(HttpServletRequest req) throws Exception {
		boolean loginSuccess = false;
		MemberDTO mdto = new MemberDTO();
		mdto.setId(req.getParameter("id"));
		mdto.setPw(req.getParameter("pw"));
		HttpSession session = req.getSession();
		MemberDTO login = mdao.memberLogin(mdto);
		loginSuccess = pwdEncoder.matches(mdto.getPw(), login.getPw());
		if(loginSuccess && login!= null) {
			session.setAttribute("member", login);
			session.setAttribute("sid", mdto.getId());
			loginSuccess = true;
		}
		return loginSuccess;
	}

	@Override
	public void memberInsert(MemberDTO mdto) throws Exception {
		mdao.memberInsert(mdto);
	}

	@Override
	public void memberUpdate(MemberDTO mdto) throws Exception {
		mdao.memberUpdate(mdto);
	}

	@Override
	public void memberDelete(String id) throws Exception {
		mdao.memberDelete(id);
	}
}