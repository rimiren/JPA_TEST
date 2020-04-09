package com.ksc.rjh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	DataSource ds;
	@RequestMapping("login")
	public ModelAndView login() throws ClassNotFoundException, SQLException {
		ModelAndView mv = new ModelAndView();
		
		Connection conn;
		PreparedStatement ps = null;
		ResultSet rs;
		
		conn = ds.getConnection();
		
		System.out.println(conn);
		String sql = "select now()";
		
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		
		while(rs.next()) {
			String time = rs.getString("now(");
			System.out.println(time);
		}
		
		
		mv.setViewName("login");
		
		return mv;
	}
	
	@RequestMapping("login1")
	public String login1() {
		return "login";
	}
}