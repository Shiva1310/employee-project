package com.employee.controller;
import com.employee.model.Employee;

import java.util.Optional;

import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.dao.Userdao;


@Controller
public class Usercontroller {
	@Autowired
	Userdao userdao;
	@RequestMapping("index")
	public String user() {
		return "index.jsp";
		}
	
		@RequestMapping("addUser")
		public String addUser(Employee user) {
			userdao.save(user);
			return "index.jsp";
	}
@RequestMapping("getUser")
public ModelAndView getUser(@RequestParam int id) {
ModelAndView mav=new ModelAndView("showUser.jsp");
Employee user=userdao.findById(id).orElseThrow();
	mav.addObject(user);
	return mav;
	}

@RequestMapping("updateUser")
public ModelAndView updateUser(Optional<Employee> user, Integer id) {
ModelAndView mav=new ModelAndView("updateUser.jsp");
 user=Optional.ofNullable(userdao.findById(id).orElse(user.get()));
userdao.delete(user.get());
	mav.addObject(user);
	return mav;}
}