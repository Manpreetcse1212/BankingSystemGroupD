package com.groupd.bankingsystem.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Date: 15.03.2022
 * Group D 
 * Member1: Manpreet kaur
 * Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel
 * Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal 
 * bean class for account_details table
 */

public class Transfer {
	
	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private int account_no;

	private float balance;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String account_type;
	
	@Size(min = 1, message = "required")
	private float amount;

	private int userId;

	private int account_id;

	public int getAccount_no() {
		return account_no;
	}

	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	


}
