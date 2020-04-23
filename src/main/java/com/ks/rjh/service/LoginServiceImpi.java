package com.ks.rjh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ks.rjh.dao.LoginDao;

//내용부
@Service
public class LoginServiceImpi implements LoginService {
	
	@Autowired
	LoginDao logindao;

	@Override
	// id, password 시발점 : 
	// 화면1 -> 컨트롤러2 ->  서비스3 -> 다오4 
	public int checkLogin(String id, String password) {
		
		int count = logindao.findUser(id, password);
		
		return count;
	}

}