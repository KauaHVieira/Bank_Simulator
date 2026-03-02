package entities;

import java.time.LocalDate;

public abstract class Account {
	
	private Integer accountNumber;
	private String accountHolder;
	private Double accountBalance;
	private LocalDate dateOfCreation;
	
	private Customer customer;
	
	public Account(Integer accountNumber, String accountHolder, Double accountBalance, LocalDate dateOfCreation ,Customer customer) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.dateOfCreation = dateOfCreation;
		this.customer = customer;
	}


	public Integer getAccountNumber() { return accountNumber; }

	public void setAccountNumber(Integer accountNumber) { this.accountNumber = accountNumber; }

	public String getAccountHolder() { return accountHolder; }

	public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }

	public Double getAccountBalance() { return accountBalance; }

	public Customer getCustomer() { return customer; }

	public LocalDate getDateOfCreation() { return dateOfCreation; }

	public void setDateOfCreation(LocalDate dateOfCreation) { this.dateOfCreation = dateOfCreation; }
	
	public void withdraw(Double amount) {
		accountBalance -= amount;
	}
	
	public Double income(Double amount, Double fees) {
		return amount * fees;
	}
	
	public void deposit(Double amount) {
		accountBalance += amount;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account Number: " + accountNumber + "\n");
		sb.append("Account Holder: " + accountHolder + "\n");
		sb.append("Account Balance: " + accountBalance + "\n");
		sb.append("Date of Creation: " + dateOfCreation + "\n");
		return sb.toString();
		}
}
	
