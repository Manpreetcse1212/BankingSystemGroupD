package com.groupd.bankingsystem.beans;

import javax.validation.constraints.NotNull;

import java.sql.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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
 * bean class for Book table
 */

public class Transfer {
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private int Accountno;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String From;

	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String To;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private Date date;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String TransactionType;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private int id;

	public int getAccountno() {
		return Accountno;
	}

	public void setAccountno(int accountno) {
		Accountno = accountno;
	}

	public String getFrom() {
		return From;
	}

	public void setFrom(String from) {
		From = from;
	}

	public String getTo() {
		return To;
	}

	public void setTo(String to) {
		To = to;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTransactionType() {
		return TransactionType;
	}

	public void setTransactionType(String transactionType) {
		TransactionType = transactionType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}




}
