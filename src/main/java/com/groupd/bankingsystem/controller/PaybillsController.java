package com.groupd.bankingsystem.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.groupd.bankingsystem.beans.Paybills;
import com.groupd.bankingsystem.beans.Transfer;
import com.groupd.bankingsystem.dao.PaybillsDao;
import com.groupd.bankingsystem.dao.TransferDao;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal This controller is used to hand post and get
 * methods for registering and showing users
 */

@Controller
public class PaybillsController {

	@Autowired
	PaybillsDao paybillsDao;

	@Autowired
	TransferDao transferDao;

	@RequestMapping("/paybills")
	public String visitPayBills(@ModelAttribute("command") Paybills paybills, HttpSession httpSession, Model model) {
		int user_id = (Integer) httpSession.getAttribute("user_id");
		List<Transfer> transfers = transferDao.check_account(user_id);

		HashMap<Integer, String> account_types = new HashMap<Integer, String>();
		for (Transfer transfer : transfers) {
			account_types.put(transfer.getAccount_id(), transfer.getAccount_type());
		}

		model.addAttribute("account_types", account_types);
		return "billpayment";
	}

	@RequestMapping(value = "/doPayBills", method = RequestMethod.POST)
	public String doPayBills(@Valid @ModelAttribute("command") Paybills paybills, BindingResult br) {
		if (br.hasErrors()) {
			return "billpayment";
		} else {
			paybillsDao.payBillsToBiller(paybills);
			return "redirect:/index";
		}
	}
}
