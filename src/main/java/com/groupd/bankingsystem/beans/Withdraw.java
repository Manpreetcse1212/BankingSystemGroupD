package com.groupd.bankingsystem.beans;

import javax.validation.constraints.NotNull;
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

public class Withdraw {
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Username;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Password;

	public String getUserName() {
		return Username;
	}

	public void setUserName(String Username) {
		this.Username=Username;
	}
	
	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password=Password;
	}
	

}
