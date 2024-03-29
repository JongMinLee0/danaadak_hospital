package com.dana.hos.member.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dana.hos.map.module.HosDTO;
import com.dana.hos.member.module.MemberDTO;
import com.dana.hos.member.repo.MemberDAO;
import com.dana.hos.member.service.MemberService;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	MemberDAO memberDAO;
	
	public MemberServiceImp() {
		
	}
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public void joinProcess(MemberDTO dto) {
		memberDAO.joinMedthod(dto);
	}

	@Override
	public void hosjoinProcess(MemberDTO dto) {
		memberDAO.hosjoinMedthod(dto);
	}
	
	@Override
	public MemberDTO userInfoProcess(String username) {
		return memberDAO.getUserInfo(username);
	}

	@Override
	public int kakaoChkProcess(String kakao_id) {
		return memberDAO.kakaoChkMethod(kakao_id);
	}

	@Override
	public MemberDTO kakaoLoginProcess(String kakao_id) {
		return memberDAO.kakaoLoginMethod(kakao_id);
	}

	@Override
	public List<HosDTO> findHospitalProcess(String keyword) {
		return memberDAO.findHospitalMethod(keyword);
	}

	@Override
	public int usernameChkProcess(String username) {
		return memberDAO.userNameChkMethod(username);
	}

	@Override
	public int hospitalChkProcess(String hos_id) {
		return memberDAO.hosIdChkMethod(hos_id);
	}

	@Override
	public MemberDTO findIdProcess(MemberDTO dto) {
		return memberDAO.findIdMethod(dto);
	}
	
	@Override
	public int findPwProcess(MemberDTO dto) {
		return memberDAO.findPwMethod(dto);
	}

	@Override
	public void changePw(MemberDTO dto) {
		memberDAO.changePw(dto);
	}


}
