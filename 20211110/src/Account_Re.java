
public class Account_Re {
	String accountNum;
	String owner;
	int balance;
	
	public Account_Re() {}
	public Account_Re(String accountNum, String owner, int balance) {
		this.accountNum=accountNum;
		this.owner=owner;
		this.balance=balance;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum=accountNum;
	}
	public String getAccountNum() {
		return this.accountNum;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public String getOwner() {
		return this.owner;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return this.balance;
	}
	
	
}

