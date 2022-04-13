/**
 * 
 */
package com.groupd.bankingsystem.beans;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal bean class for personal_details table
 */
public class LoginForm {

	@NotNull(message = "Required")
	@Size(min = 1, message = "Required")
	private String username;

	@NotNull(message = "Required")
	@Size(min = 1, message = "Required")
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password + "]";
	}

}
