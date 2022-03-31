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

import com.groupd.bankingsystem.beans.Transfer;
import com.groupd.bankingsystem.dao.TransferDao;

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
public class TransferController {
	@Autowired
	TransferDao transferdao;
	

//	@RequestMapping(value = "/edittransfer/{user_id}")
//	public String edit(@PathVariable int userid, Model m) {
//		Transfer transfer = transferdao.gettransferById(userid);
//		m.addAttribute("command", transfer);
//		return "transfereditform";
//	}

	/* It updates model object. */
	@RequestMapping(value = "/editsavetransfer", method = RequestMethod.GET)
	public String editsave(@ModelAttribute("transfer") Transfer transfer) {
		transferdao.TransferBalance(transfer);
		return "redirect:/view";
	}

	
}
