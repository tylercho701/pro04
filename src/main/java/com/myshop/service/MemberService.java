package com.myshop.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myshop.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public int memberCount() throws Exception;
	public MemberDTO memberDetail(String id) throws Exception;
	public MemberDTO memberSignIn(MemberDTO mdto) throws Exception;
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception;
	public boolean memberLogin(HttpServletRequest req) throws Exception;
	public void memberInsert(MemberDTO mdto) throws Exception;
	public void memberUpdate(MemberDTO mdto) throws Exception;
	public void memberDelete(String id) throws Exception;
}