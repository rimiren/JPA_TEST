package com.ks.rjh.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ks.rjh.entity.User_Info;
import com.ks.rjh.entity.wbs_2020;
import com.ks.rjh.entity.workplaceinfo;
import com.ks.rjh.service.WbsTestService;

@Controller
public class WbsTestController {
	
	@Autowired
	WbsTestService wbstestservice;
	
	@RequestMapping("/wbs_test")
	public ModelAndView wbs_test(String u_no) {
		

		
		ModelAndView mv = new ModelAndView("wbs_test");
		
		List<User_Info> userlist = wbstestservice.user_info(u_no);
		List<wbs_2020> wbs2020 = wbstestservice.wbs_2020(u_no);
		List<workplaceinfo> workplace = wbstestservice.workplaceinfo(u_no);
		
		mv.addObject("userlist", userlist);
		mv.addObject("wbs2020", wbs2020);
		mv.addObject("workplace", workplace);
		
		return mv;
		
	}

}
