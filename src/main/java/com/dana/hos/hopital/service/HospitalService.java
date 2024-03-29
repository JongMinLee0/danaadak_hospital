package com.dana.hos.hopital.service;

import java.util.List;

import com.dana.hos.hopital.module.EventDTO;
import com.dana.hos.hopital.module.HospitalDTO;
import com.dana.hos.member.module.MemberDTO;
import com.dana.hos.reserve.module.ReserveDTO;

public interface HospitalService {
	
	public List<ReserveDTO> bookListProcess(MemberDTO dto);
	public List<ReserveDTO> contentProcess(int rno);
	public void updateProcess(ReserveDTO dto);
	public void eventInsertProcess(EventDTO dto);
	public List<EventDTO> eventListProcess(EventDTO dto);
	public String nameselctProcess(String hos_id);
}
