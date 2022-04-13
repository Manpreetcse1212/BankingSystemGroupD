/**
 * 
 */
package com.groupd.bankingsystem.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal bean class for account_details table
 */
public class EditTransfer {

	@NotNull(message = "Required")
	@Min(value = 1, message="Required")
	private Float amount;
	
	@NotNull(message = "Required")
	@Size(min = 1, message="Required")
	private String account_no;
	private int account_id;

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

}
