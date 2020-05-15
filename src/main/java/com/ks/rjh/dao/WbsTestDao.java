package com.ks.rjh.dao;

import java.util.List;

import com.ks.rjh.entity.User_Info;
import com.ks.rjh.entity.wbs_2020;
import com.ks.rjh.entity.workplaceinfo;;

public interface WbsTestDao {
	
	public List<User_Info> user_infoC(String u_no);
	
	public List<wbs_2020> wbs_2020C(String u_no);
	
	public List<workplaceinfo> workplaceinfoC(String u_no);

}
