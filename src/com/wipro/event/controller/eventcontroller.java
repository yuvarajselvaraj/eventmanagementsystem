package com.wipro.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wipro.event.service.eventservice;
import com.wipro.event.model.login;

@Controller
public class eventcontroller {
	@Autowired
	private eventservice eventservice;
@RequestMapping(value="/")
public String dostart()
{
	return "index";
}
@RequestMapping(value = "/register", method = RequestMethod.POST)
public String doRegister(Model model, @ModelAttribute("loginbean") login loginbean) {
	if (loginbean != null ) {
		return eventservice.doregister(loginbean);
	} else {
		
		return "error";
	}
}
@RequestMapping(value="register1")
public String dostart1()
{
	return "register";
}

}
