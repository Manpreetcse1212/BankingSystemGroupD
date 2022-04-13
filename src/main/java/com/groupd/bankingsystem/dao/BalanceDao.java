package com.groupd.bankingsystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.groupd.bankingsystem.beans.Balance;
import com.groupd.bankingsystem.beans.Login;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal DAO class for Login table
 */

public class BalanceDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	// Method used to check the current balance
	public List<Balance> check_balance(int user_id) {

		List<Balance> bal = template.query("select * from account_details where userid=" + user_id + " ",
				new RowMapper<Balance>() {
					public Balance mapRow(ResultSet rs, int row) throws SQLException {
						Balance e = new Balance();
						e.setAccount_no(rs.getInt(1));
						e.setBalance(rs.getFloat(2));
						e.setAccount_type(rs.getString(3));
						e.setUserId(rs.getInt(4));
						e.setAccount_id(rs.getInt(5));
						return e;
					}
				});

		return bal;

	}

}