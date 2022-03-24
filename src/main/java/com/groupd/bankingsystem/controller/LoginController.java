package com.groupd.bankingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupd.bankingsystem.beans.Login;
import com.groupd.bankingsystem.dao.LoginDao;

/**
 * Date: 15.03.2022 Group D 
 * Member1: Manpreet kaur 
 * Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel 
 * Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal 
 * This controller is used to hand post and get
 * methods for registering and showing users
 */

@Controller
public class LoginController {

	@Autowired
	LoginDao logindao;// will inject dao from xml file

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String login(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		Login login = new Login();
		login.setUserName(username);
		login.setPassword(password);
		if (logindao.user_exists(login)) {
			return "index";// will redirect to view login request mapping
		} else {
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String register(@RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		Login login = new Login();
		login.setUserName(username);
		login.setPassword(password);
		logindao.saveUser(login);
		return "redirect:/";
	}

}
