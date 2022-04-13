package com.groupd.bankingsystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.groupd.bankingsystem.beans.Login;
import com.groupd.bankingsystem.beans.LoginForm;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal DAO class for Login table
 */

public class LoginDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

//	method used to check whether the user exists or not 
	public Login user_exists(LoginForm login) {
		String sql = "select * from personal_details where username=? and password=?";

		List<Login> users = template.query("select username, password, userid from personal_details where username='"
				+ login.getUsername() + "' and password='" + login.getPassword() + "'", new RowMapper<Login>() {
					public Login mapRow(ResultSet rs, int row) throws SQLException {
						Login e = new Login();
						e.setUsername(rs.getString(1));
						e.setPassword(rs.getString(2));
						e.setUserId(rs.getInt(3));
						return e;
					}
				});
		if (users.size() > 0) {

			return users.get(0);
		} else {
			return null;
		}

	}

//	for Adding users
	public void saveUser(Login login) {

		String sql = "insert into personal_details (Customer_name,Father_name,Gender,Email,Address,Postal_code,Province,Account_no,username,password) values"
				+ "('" + login.getCustomerName() + "','" + login.getFatherName() + "','" + login.getGender() + "','"
				+ login.getEmail() + "','" + login.getAddress() + "','" + login.getPostalcode() + "','"
				+ login.getProvince() + "'," + login.getAccountno() + ",'" + login.getUsername() + "','"
				+ login.getPassword() + "')";

		template.update(sql);

		String sql_fetch = "select userid, Account_no from personal_details where username='" + login.getUsername()
				+ "'";
		Login login_new = template.queryForObject(sql_fetch, new RowMapper<Login>() {
			@Override
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Login login = new Login();
				login.setUserId(rs.getInt(1));
				return login;
			}
		});

		String sql_chequing = "insert into account_details (Account_No,balance,Account_type,userid) values" + "('"
				+ login.getAccountno() + "'," + 0 + ",'Chequing'," + login_new.getUserId() + ")";

		template.update(sql_chequing);

		String sql_saving = "insert into account_details (Account_No,balance,Account_type,userid) values" + "('"
				+ login.getAccountno() + "'," + 0 + ",'Saving'," + login_new.getUserId() + ")";

		template.update(sql_saving);
	}

	public int getUserBasedOnEmailAddress(String email) {
		String sql_fetch = "select userid from personal_details where Email='" + email + "'";
		Login login = template.queryForObject(sql_fetch, new RowMapper<Login>() {
			@Override
			public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Login login = new Login();
				login.setUserId(rs.getInt(1));
				return login;
			}
		});
		return login.getUserId();
	}
}