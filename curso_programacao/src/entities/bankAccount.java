package entities;

public class bankAccount {
	private int number;
	private String holder;
	private double balance;
	 
	public bankAccount(int number, String holder, double iniDep) {
		this.number = number;
		this.holder = holder;
		deposit(iniDep);
	}
	
	public bankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount +5;
	}
	
	public String toString() {
		return number
		+ ", " + "holder: " + holder
		+ ", " + "balance"
		+ ": " + "$ " + balance;
		
		
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
}
