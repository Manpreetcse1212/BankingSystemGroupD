package com.groupd.bankingsystem.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.groupd.bankingsystem.beans.Paybills;
import com.groupd.bankingsystem.beans.Transfer;

/**
 * Date: 15.03.2022 Group D Member1: Manpreet kaur Member2: Manpreet Kaur
 * Member3: Bhumikaben Manubhai Patel Member4: Ashikkumar Nareshbhai Patel
 * Member5: Hardeep Kaur Chahal DAO class for Login table
 */

public class PaybillsDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Autowired
	TransferDao transferDao;
// method used for paying bills
	public void payBillsToBiller(Paybills payBills, int user_id) {
		Transfer account_details = transferDao.get_account_details(payBills.getAccount_id());
		float balance_account = account_details.getBalance() - payBills.getAmount();

		String sql = "update account_details set  balance=" + balance_account + " where account_id="
				+ payBills.getAccount_id() + "";
		template.update(sql);

		sql = "insert into bill_payment (payee_name, Account_no, amount) VALUES ('" + payBills.getPayee_name() + "' , "
				+ payBills.getAccount_no() + ", " + payBills.getAmount() + ");";
		template.update(sql);

		sql = "insert into transaction_details (FromUserId, ToUserId, date, type, amount, "
				+ "From_Acc_Id, To_Acc_Id) VALUES (" + user_id + "," + " " + user_id + ", SYSDATE(), 'BILL-PAY', "
				+ payBills.getAmount() + ", " + account_details.getAccount_id() + ", " + account_details.getAccount_id()
				+ ");";
		template.update(sql);
	}

}