package com.groupd.bankingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

import com.groupd.bankingsystem.beans.Login;
import com.groupd.bankingsystem.beans.LoginForm;
import com.groupd.bankingsystem.dao.LoginDao;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal This controller is used to hand post and get
 * methods for registering and showing users
 */

// Controller for registration and login
@Controller
@SessionAttributes("user_id")
public class LoginController {

	@Autowired
	LoginDao logindao;// will inject dao from xml file

	@RequestMapping("/")
	public String loginPage(@ModelAttribute("login") LoginForm form) {
		return "viewlogin";
	}

	@RequestMapping("/register")
	public String registerPage(@ModelAttribute("login") Login login) {
		return "register";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String goToIndexPage(Model model) {
		return "index";
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String login(@Valid @ModelAttribute("login") LoginForm login, BindingResult br, Model model) {
		if (br.hasErrors()) {
			return "viewlogin";
		} else {
			Login user = logindao.user_exists(login);
			if (user != null) {
				model.addAttribute("user_id", user.getUserId());
				return "redirect:/index";// will redirect to view login request mapping
			} else {
				return "redirect:/";
			}
		}

	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String register(@Valid @ModelAttribute("login") Login login, BindingResult br) {

		if (br.hasErrors()) {
			return "register";
		} else {

			logindao.saveUser(login);
			if (br.hasErrors()) {
				return "viewlogin";
			} else {
				return "redirect:/";
			}
		}

	}

}
