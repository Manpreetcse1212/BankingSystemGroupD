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

public class Login {
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Username;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Password;
	
	
	private int userId;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String customerName;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String fatherName;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Gender;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Email;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Address;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Postalcode;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Province;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private int Accountno;
	
	private float balance;
	
	@Size(min=5,message="required")
	@Size(max=20,message="required")
	@NotNull(message="required field")
	private String Accounttype;
	
	private int Accountid;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
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
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPostalcode() {
		return Postalcode;
	}

	public void setPostalcode(String postalcode) {
		Postalcode = postalcode;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public int getAccountno() {
		return Accountno;
	}

	public void setAccountno(int accountno) {
		Accountno = accountno;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getAccounttype() {
		return Accounttype;
	}

	public void setAccounttype(String accounttype) {
		Accounttype = accounttype;
	}

	public int getAccountid() {
		return Accountid;
	}

	public void setAccountid(int accountid) {
		Accountid = accountid;
	}
	
	
	
}
