package com.dana.hos.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dana.hos.admin.repo.AdminDAO;
import com.dana.hos.admin.service.AdminService;
import com.dana.hos.hopital.module.EventDTO;
import com.dana.hos.member.module.MemberDTO;

@Service
public class AdminServiceImp implements AdminService {

	@Autowired
	AdminDAO dao;

	public AdminServiceImp() {

	}

	public void setDao(AdminDAO dao) {
		this.dao = dao;
	}

	// 병원 정보 리스트 받기
	@Override
	public List<MemberDTO> Hos_Join_Info() {
		List<MemberDTO> hsList = dao.Join_Hos_list();
		return hsList;
	}

	// 병원 가입 승인
	@Override
	public void Hos_Join(MemberDTO dto) {
		dao.Join_HosMethod(dto);
	}

	// 병원 이벤트 리스트
	@Override
	public List<EventDTO> EventListProcess() {
		List<EventDTO> e_List = dao.Event_Hos_list();
		return e_List;
	}

	// 병원 이벤트 리스트
	@Override
	public List<EventDTO> EventTypeProcess(EventDTO aedto) {
		List<EventDTO> etype_List = dao.Event_Type_list(aedto);
		return etype_List;
	}

}
