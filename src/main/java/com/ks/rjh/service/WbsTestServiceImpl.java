package com.ks.rjh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ks.rjh.dao.WbsTestDao;
import com.ks.rjh.entity.User_Info;
import com.ks.rjh.entity.wbs_2020;
import com.ks.rjh.entity.workplaceinfo;

@Service
@Repository
public class WbsTestServiceImpl implements WbsTestService{

	@Autowired
	WbsTestDao wbstestdao;
	
	@Override
	public List<User_Info> user_info(String u_no) {
		
		User_Info user_info = new User_Info();
		user_info.setU_no(u_no);
		
		
		return wbstestdao.user_infoC(u_no);
	}

	@Override
	public List<wbs_2020> wbs_2020(String u_no) {
		
		wbs_2020 wbs_2020 = new wbs_2020();
		wbs_2020.setU_no(u_no);
		
		
		return wbstestdao.wbs_2020C(u_no);
	}

	@Override
	public List<workplaceinfo> workplaceinfo(String u_no) {
		
		workplaceinfo workplaceinfo = new workplaceinfo();
		workplaceinfo.setU_no(u_no);
		
		
		return wbstestdao.workplaceinfoC(u_no);
	}

}
