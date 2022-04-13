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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.groupd.bankingsystem.beans.EditTransfer;
import com.groupd.bankingsystem.beans.Fund;
import com.groupd.bankingsystem.beans.Interac;
import com.groupd.bankingsystem.beans.Transfer;
import com.groupd.bankingsystem.dao.TransferDao;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal This controller is used to hand post and get
 * methods for registering and showing users
 */
// this controller is used for add funds, withdraw funds, transfer funds, interac e-transfer
@Controller
@SessionAttributes("account_id")
public class TransferController {
	@Autowired
	TransferDao transferdao;

	@RequestMapping(value = "/viewtransfer/{user_id}", method = RequestMethod.GET)
	public String viewtransfer(Model model, @PathVariable int user_id) {
		List<Transfer> trans = transferdao.check_account(user_id);
		model.addAttribute("transfers", trans);
		System.out.println(trans.size());
		return "viewtransfer";
	}

	/* It updates model object. */
	@RequestMapping(value = "/transferfund/{account_id}", method = RequestMethod.GET)
	public String edittransfer(@ModelAttribute("transfer") EditTransfer transfer, @PathVariable int account_id,
			Model model) {
		model.addAttribute("account_id", account_id);
		return "editransfer";
	}

	@RequestMapping(value = "/doTransfer", method = RequestMethod.POST)
	public String doTransfer(@Valid @ModelAttribute("transfer") EditTransfer transfer, BindingResult br,
			HttpSession session) {
		if (br.hasErrors()) {
			return "editransfer";
		} else {
			transferdao.TransferBalance(transfer);
			int user_id = (Integer) session.getAttribute("user_id");
			return "redirect:/viewtransfer/" + user_id;
		}
	}

	@RequestMapping("/addfunds")
	public String visitAddFunds(Model model, HttpSession httpSession, @ModelAttribute("command") Fund fund) {
		int user_id = (Integer) httpSession.getAttribute("user_id");
		List<Transfer> transfers = transferdao.check_account(user_id);

		HashMap<Integer, String> account_types = new HashMap<Integer, String>();
		for (Transfer transfer : transfers) {
			account_types.put(transfer.getAccount_id(), transfer.getAccount_type());
		}

		model.addAttribute("account_types", account_types);

		return "addfund";
	}

	@RequestMapping(value = "/doAddFund", method = RequestMethod.POST)
	public String doAddFund(@Valid @ModelAttribute("command") Fund fund, BindingResult br, HttpSession httpSession) {

		if (br.hasErrors()) {
			return "addFund";
		} else {
			transferdao.AddFundToAccount(fund, (Integer) httpSession.getAttribute("user_id"));
			return "redirect:/index";
		}
	}

	@RequestMapping("/withdrawfunds")
	public String visitWithdrawFunds(Model model, HttpSession httpSession, @ModelAttribute("command") Fund fund) {
		int user_id = (Integer) httpSession.getAttribute("user_id");
		List<Transfer> transfers = transferdao.check_account(user_id);

		HashMap<Integer, String> account_types = new HashMap<Integer, String>();
		for (Transfer transfer : transfers) {
			account_types.put(transfer.getAccount_id(), transfer.getAccount_type());
		}

		model.addAttribute("account_types", account_types);

		return "withdrawfund";
	}

	@RequestMapping(value = "/doWithdrawFund", method = RequestMethod.POST)
	public String doWithdrawFund(@Valid @ModelAttribute("command") Fund fund, BindingResult br,
			HttpSession httpSession) {
		if (br.hasErrors()) {
			return "withdrawFund";
		} else {
			transferdao.WithdrawFundToAccount(fund, (Integer) httpSession.getAttribute("user_id"));
			return "redirect:/index";
		}
	}

	@RequestMapping("/interactransfer")
	public String visitInteracTransfer(Model model, HttpSession httpSession,
			@ModelAttribute("command") Interac interac) {
		int user_id = (Integer) httpSession.getAttribute("user_id");
		List<Transfer> transfers = transferdao.check_account(user_id);

		HashMap<Integer, String> account_types = new HashMap<Integer, String>();
		for (Transfer transfer : transfers) {
			account_types.put(transfer.getAccount_id(), transfer.getAccount_type());
		}

		model.addAttribute("account_types", account_types);

		return "interac";
	}

	@RequestMapping(value = "/doInterac", method = RequestMethod.POST)
	public String doInterac(@Valid @ModelAttribute("command") Interac interac, BindingResult br) {
		if (br.hasErrors()) {
			return "interac";
		} else {
			transferdao.InteracTransferBalance(interac);
			return "redirect:/index";
		}
	}
}
