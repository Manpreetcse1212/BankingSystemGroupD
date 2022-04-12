package com.groupd.bankingsystem.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.groupd.bankingsystem.beans.EditTransfer;
import com.groupd.bankingsystem.beans.Fund;
import com.groupd.bankingsystem.beans.Interac;
import com.groupd.bankingsystem.beans.Transfer;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal DAO class for Login table
 */

public class TransferDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Autowired
	LoginDao loginDao;

	public List<Transfer> check_account(int user_id) {

		List<Transfer> transfer = template.query("select * from account_details where userid=" + user_id + " ",
				new RowMapper<Transfer>() {
					@Override
					public Transfer mapRow(ResultSet rs, int row) throws SQLException {
						Transfer e = new Transfer();
						e.setAccount_no(rs.getInt(1));
						e.setBalance(rs.getFloat(2));
						e.setAccount_type(rs.getString(3));
						e.setUserId(rs.getInt(4));
						e.setAccount_id(rs.getInt(5));
						return e;
					}
				});
		return transfer;
	}

	public Transfer get_account_details(int account_id) {

		List<Transfer> transfer = template.query("select * from account_details where account_id=" + account_id + " ",
				new RowMapper<Transfer>() {
					@Override
					public Transfer mapRow(ResultSet rs, int row) throws SQLException {
						Transfer e = new Transfer();
						e.setAccount_no(rs.getInt(1));
						e.setBalance(rs.getFloat(2));
						e.setAccount_type(rs.getString(3));
						e.setUserId(rs.getInt(4));
						e.setAccount_id(rs.getInt(5));
						return e;
					}
				});
		return transfer.get(0);
	}

	public Transfer get_account_details(int Account_No, String account_type) {

		List<Transfer> transfer = template.query("select * from account_details where Account_no=" + Account_No
				+ " and Account_type = '" + account_type + "' ", new RowMapper<Transfer>() {
					@Override
					public Transfer mapRow(ResultSet rs, int row) throws SQLException {
						Transfer e = new Transfer();
						e.setAccount_no(rs.getInt(1));
						e.setBalance(rs.getFloat(2));
						e.setAccount_type(rs.getString(3));
						e.setUserId(rs.getInt(4));
						e.setAccount_id(rs.getInt(5));
						return e;
					}
				});
		return transfer.get(0);
	}

	public Transfer get_account_details_with_user_id(int user_id, String account_type) {

		List<Transfer> transfer = template.query("select * from account_details where userid=" + user_id + " and "
				+ "Account_type = '" + account_type + "' ", new RowMapper<Transfer>() {
					@Override
					public Transfer mapRow(ResultSet rs, int row) throws SQLException {
						Transfer e = new Transfer();
						e.setAccount_no(rs.getInt(1));
						e.setBalance(rs.getFloat(2));
						e.setAccount_type(rs.getString(3));
						e.setUserId(rs.getInt(4));
						e.setAccount_id(rs.getInt(5));
						return e;
					}
				});
		return transfer.get(0);
	}

	public void TransferBalance(EditTransfer p) { // This method updates the account_details table

		Transfer account_details_1 = get_account_details(p.getAccount_id());
		Transfer account_details_2 = get_account_details(Integer.parseInt(p.getAccount_no()), "Chequing");

		float balance_account_1 = account_details_1.getBalance() - p.getAmount();
		float balance_account_2 = account_details_2.getBalance() + p.getAmount();

		String sql = "update account_details set  balance=" + balance_account_1 + " where account_id="
				+ p.getAccount_id() + "";
		template.update(sql);

		sql = "update account_details set  balance=" + balance_account_2 + " where account_id="
				+ account_details_2.getAccount_id() + "";
		template.update(sql);

		sql = "insert into transaction_details (FromUserId, ToUserId, date, type, amount, "
				+ "From_Acc_Id, To_Acc_Id) VALUES (" + account_details_1.getUserId() + "," + " "
				+ account_details_2.getUserId() + ", SYSDATE(), 'TRANS', " + p.getAmount() + ", "
				+ account_details_1.getAccount_id() + ", " + account_details_2.getAccount_id() + ");";
		template.update(sql);

	}

	public void AddFundToAccount(Fund fund, int userId) {

		Transfer account_details = get_account_details(fund.getAccount_id());
		float balance_account = account_details.getBalance() + fund.getAmount();

		String sql = "update account_details set  balance=" + balance_account + " where account_id="
				+ fund.getAccount_id() + "";
		template.update(sql);

		sql = "insert into transaction_details (FromUserId, ToUserId, date, type, amount, "
				+ "From_Acc_Id, To_Acc_Id) VALUES (" + userId + "," + " " + userId + ", SYSDATE(), 'DEPO', "
				+ fund.getAmount() + ", " + fund.getAccount_id() + ", " + fund.getAccount_id() + ");";
		template.update(sql);
	}

	public void WithdrawFundToAccount(Fund fund, int userId) {

		Transfer account_details = get_account_details(fund.getAccount_id());
		float balance_account = account_details.getBalance() - fund.getAmount();

		String sql = "update account_details set  balance=" + balance_account + " where account_id="
				+ fund.getAccount_id() + "";
		template.update(sql);
		sql = "insert into transaction_details (FromUserId, ToUserId, date, type, amount, "
				+ "From_Acc_Id, To_Acc_Id) VALUES (" + userId + "," + " " + userId + ", SYSDATE(), 'WITH', "
				+ fund.getAmount() + ", " + fund.getAccount_id() + ", " + fund.getAccount_id() + ");";
		template.update(sql);
	}

	public void InteracTransferBalance(Interac interac) { // This method updates the account_details table

		Transfer account_details_1 = get_account_details(interac.getAccount_id());
		Transfer account_details_2 = get_account_details_with_user_id(
				loginDao.getUserBasedOnEmailAddress(interac.getEmail()), "Chequing");

		float balance_account_1 = account_details_1.getBalance() - interac.getAmount();
		float balance_account_2 = account_details_2.getBalance() + interac.getAmount();

		String sql = "update account_details set  balance=" + balance_account_1 + " where account_id="
				+ interac.getAccount_id() + "";
		template.update(sql);

		sql = "update account_details set  balance=" + balance_account_2 + " where account_id="
				+ account_details_2.getAccount_id() + "";
		template.update(sql);

		sql = "insert into transaction_details (FromUserId, ToUserId, date, type, amount, "
				+ "From_Acc_Id, To_Acc_Id) VALUES (" + account_details_1.getUserId() + "," + " "
				+ account_details_2.getUserId() + ", SYSDATE(), 'INTERAC', " + interac.getAmount() + ", "
				+ account_details_1.getAccount_id() + ", " + account_details_2.getAccount_id() + ");";
		template.update(sql);

	}

}