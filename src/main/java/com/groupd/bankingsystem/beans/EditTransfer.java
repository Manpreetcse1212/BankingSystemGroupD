/**
 * 
 */
package com.groupd.bankingsystem.beans;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author hp world
 *
 */
public class EditTransfer {

	@NotNull(message = "Amount Required")
	@Min(value = 1, message="Amount Required")
	private Float amount;
	
	@NotNull(message = "Account Number Required")
	@Size(min = 1, message="Account Number Required")
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
