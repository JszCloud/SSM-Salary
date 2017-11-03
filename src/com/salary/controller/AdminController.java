package com.salary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.salary.pojo.Admin;
import com.salary.service.AdminService;

@Controller
@RequestMapping("")
public class AdminController {
	/*注解Service*/
	@Autowired
	AdminService adminService;
	/*@RequestMapping 注解访问action  括号中写的是url action
	 * ModelAndView  视图
	 * */
	@RequestMapping("listCategory")
	public ModelAndView listCategory(){ 
		ModelAndView mav = new ModelAndView();
		
		List<Admin> cs= adminService.selectByExample();
		for (int i = 0; i < 5; i++) {
			System.out.println(cs);
		}
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
	
}
