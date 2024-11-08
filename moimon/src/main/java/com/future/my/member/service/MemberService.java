package com.future.my.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.my.member.dao.IMemberDAO;
import com.future.my.member.vo.InterestVO;

@Service
public class MemberService {
	
	@Autowired
	IMemberDAO memDao;
	
	public ArrayList<InterestVO> getInterestList(){
		
		return memDao.getInterestList();
	}

}
