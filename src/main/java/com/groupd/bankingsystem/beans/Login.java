package com.groupd.bankingsystem.beans;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal bean class for personal_details table
 */

public class Login {

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String username;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String password;

	private int userId;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String customerName;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String fatherName;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String gender;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String email;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String address;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String postalcode;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String province;

	@Min(value = 5, message = "required")
	@Max(value = 20, message = "required")
	@NotNull(message = "required field")
	private int accountno;

	private float balance;

	@Size(min = 5, message = "required")
	@Size(max = 20, message = "required")
	@NotNull(message = "required field")
	private String accounttype;

	private int accountid;

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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public int getAccountid() {
		return accountid;
	}

	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}

	@Override
	public String toString() {
		return "Login [username=" + username + ", password=" + password + ", userId=" + userId + ", customerName="
				+ customerName + ", fatherName=" + fatherName + ", gender=" + gender + ", email=" + email + ", address="
				+ address + ", postalcode=" + postalcode + ", province=" + province + ", accountno=" + accountno
				+ ", balance=" + balance + ", accounttype=" + accounttype + ", accountid=" + accountid + "]";
	}

}
