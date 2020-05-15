package com.ks.rjh.service;

import java.util.List;

import com.ks.rjh.entity.User_Info;
import com.ks.rjh.entity.wbs_2020;
import com.ks.rjh.entity.workplaceinfo;

public interface WbsTestService {
	
	public List<User_Info> user_info(String u_no);
	
	public List<wbs_2020> wbs_2020(String u_no);
	
	public List<workplaceinfo> workplaceinfo(String u_no);

}
