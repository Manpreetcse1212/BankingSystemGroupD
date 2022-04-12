/**
 * 
 */
package com.groupd.bankingsystem.beans;

/**
 * @author hp world
 *
 */
public class Transaction {
	private int fromUserId;
	private int toUserId;
	private String date;
	private String type;
	private int transaction_id;
	private float amount;
	private int from_Acc_Id;
	private int to_Acc_Id;

	public int getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(int fromUserId) {
		this.fromUserId = fromUserId;
	}

	public int getToUserId() {
		return toUserId;
	}

	public void setToUserId(int toUserId) {
		this.toUserId = toUserId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getFrom_Acc_Id() {
		return from_Acc_Id;
	}

	public void setFrom_Acc_Id(int from_Acc_Id) {
		this.from_Acc_Id = from_Acc_Id;
	}

	public int getTo_Acc_Id() {
		return to_Acc_Id;
	}

	public void setTo_Acc_Id(int to_Acc_Id) {
		this.to_Acc_Id = to_Acc_Id;
	}

}
