package services;

import java.time.LocalDate;

import entities.Account;
import entities.CurrentAccount;
import entities.Customer;
import entities.SavingsAccount;
import repository.Bank;

public class AccountService {
	
	private Bank bank;
	
	public Account createCurrentAccount(Integer accountNumber, String accountHolder, Double accountBalance, LocalDate dateOfCreation, Customer customer) {
		Account account = new CurrentAccount(
				accountNumber, 
				accountHolder, 
				accountBalance, 
				LocalDate.now(), 
				customer);
		bank.addAccount(accountNumber, account);
		customer.addAccount(account);
		
		return account;
	}
	
	public void CreateSavingsAccount(Integer accountNumber, String accountHolder, Double accountBalance, LocalDate dateOfCreation,Customer customer, Double withdrawLimit) {
		Account account = new SavingsAccount(
				accountNumber, 
				accountHolder, 
				accountBalance, 
				LocalDate.now(), 
				customer, 
				withdrawLimit);
		bank.addAccount(accountNumber, account);
		customer.addAccount(account);
	}
}
