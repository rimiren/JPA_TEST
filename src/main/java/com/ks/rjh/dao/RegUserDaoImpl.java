package com.ks.rjh.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ks.rjh.entity.User_Info;

@Repository
public class RegUserDaoImpl implements RegUserDao{

	@Autowired
	Connection conn;
	
	@Override
	public int insertUserInfo(User_Info userinfo) {
		
		EntityManager em = conn.getConnection();
		
		em.getTransaction().begin();
		em.persist(userinfo);
		em.getTransaction().commit();
		return 0;
	}

}
