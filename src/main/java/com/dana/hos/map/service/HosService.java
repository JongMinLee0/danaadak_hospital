package com.dana.hos.map.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dana.hos.map.module.HosDTO;

@Service
public interface HosService {
	public List<HosDTO> hosf_listProcess(
			int pageNo, int pageSize,
			String keyword);
	
	public int hosf_countAllProcess(String data);
}
