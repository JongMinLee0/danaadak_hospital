package com.dana.hos.myinfo.repo.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dana.hos.member.module.MemberDTO;
import com.dana.hos.myinfo.repo.MyinfoDAO;
import com.dana.hos.reserve.module.ReserveDTO;

@Repository
public class MyinfoDaoImp implements MyinfoDAO{
	
	@Autowired
	private SqlSession sqlSession;
	public MyinfoDaoImp() {
	
	}
	//내정보 수정
	@Override
	public void updateMyinfoMethod(MemberDTO dto) {
		sqlSession.update("myinfo.myinfoUpdate", dto);
		
	}
	//내정보 확인 
	@Override
	public MemberDTO updateUsername(String username) {
		return sqlSession.selectOne("myinfo.selectUserById", username);
	}
	
	//내 예약 정보 확인
	@Override
	public List<ReserveDTO> myresList(String username) {
		return sqlSession.selectList("myinfo.myresList", username);
	}
	
}//end MyinfoDaoImp