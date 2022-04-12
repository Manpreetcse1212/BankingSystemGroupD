package com.groupd.bankingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

import com.groupd.bankingsystem.beans.Login;
import com.groupd.bankingsystem.dao.LoginDao;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal This controller is used to hand post and get
 * methods for registering and showing users
 */

@Controller
@SessionAttributes("user_id")
public class LoginController {

	@Autowired
	LoginDao logindao;// will inject dao from xml file

	@RequestMapping("/")
	public String loginPage() {
		return "viewlogin";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String goToIndexPage(Model model) {
		return "index";
	}

	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public String login(Model model, @RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password) {
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		Login user = logindao.user_exists(login);
		if (user != null) {
			model.addAttribute("user_id", user.getUserId());
			return "redirect:/index";// will redirect to view login request mapping
		} else {
			return "redirect:/";
		}
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String register(@Valid @RequestParam(name = "username") String username,
			@RequestParam(name = "password") String password, @RequestParam(name = "customername") String customername,
			@RequestParam(name = "fathername") String fathername, @RequestParam(name = "gender") String gender,
			@RequestParam(name = "email") String email, @RequestParam(name = "address") String address,
			@RequestParam(name = "postalcode") String postalcode, @RequestParam(name = "province") String province,
			@RequestParam(name = "accountno") int accountno, BindingResult br) {
		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);
		login.setCustomerName(customername);
		login.setFatherName(fathername);
		login.setEmail(email);
		login.setGender(gender);
		login.setAddress(address);
		login.setPostalcode(postalcode);
		login.setProvince(province);
		login.setAccountno(accountno);
		logindao.saveUser(login);
		if(br.hasErrors())
		{
			return "viewlogin";
		}
		else
		{
			return "redirect:/";
		}
		
	}

}
