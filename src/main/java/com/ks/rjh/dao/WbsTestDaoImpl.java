package com.ks.rjh.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ks.rjh.entity.User_Info;
import com.ks.rjh.entity.wbs_2020;
import com.ks.rjh.entity.workplaceinfo;

@Repository
public class WbsTestDaoImpl implements WbsTestDao{
	
	@Autowired
	Connection conn;
	
	@Override
	public List<User_Info> user_infoC(String u_no){
		
		EntityManager em = conn.getConnection();
		List<User_Info> user_info = em.createNamedQuery("User_Info.*", User_Info.class).
				setParameter("u_no", u_no).getResultList();
		
		return user_info;
		
	}
	@Override
	public List<wbs_2020> wbs_2020C(String u_no){
		
		EntityManager em = conn.getConnection();
		List<wbs_2020> wbs_2020 = em.createNamedQuery("wbs_2020.*", wbs_2020.class).
				setParameter("u_no", u_no).getResultList();
		
		return wbs_2020;
		
	}
	@Override
	public List<workplaceinfo> workplaceinfoC(String u_no) {
		
		EntityManager em = conn.getConnection();
		List<workplaceinfo> workplace = em.createNamedQuery("workplaceinfo.*", workplaceinfo.class).
				setParameter("u_no", u_no).getResultList();
		
		return workplace;
	}

}
