package com.groupd.bankingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.groupd.bankingsystem.beans.Balance;
import com.groupd.bankingsystem.dao.BalanceDao;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal This controller is used to hand post and get
 * methods for registering and showing users
 */

@Controller
public class BalanceController {

	@Autowired
	BalanceDao balancedao;

//	@RequestMapping(value="/viewbalance", method=RequestMethod.GET)
//	public String balance(@ModelAttribute("balance") Balance balance)
//	{
//		balancedao.check_balance(balance);
//		return "redirect:/viewbalance";
//	}

	@RequestMapping(value = "/viewbalance/{user_id}", method = RequestMethod.GET)
	public String viewbalance(Model model, @PathVariable int user_id) {
		List<Balance> balances = balancedao.check_balance(user_id);
		model.addAttribute("balances", balances);     
		return "viewbalance";
	}

}
