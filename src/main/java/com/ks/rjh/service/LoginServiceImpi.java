package com.ks.rjh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.rjh.dao.LoginDao;

@Service
public class LoginServiceImpi implements LoginService {
	
	@Autowired
	LoginDao logindao;

	@Override
	public int checkLogin(String id, String password) {
		
		int count = logindao.findUser(id, password);
		
		return count;
	}

}