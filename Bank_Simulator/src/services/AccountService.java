package services;

import java.time.LocalDate;

import entities.Account;
import entities.AccountType;
import entities.CurrentAccount;
import entities.Customer;
import entities.SavingsAccount;
import repository.Bank;

public class AccountService {
	
	private Bank bank;
	
	public AccountService(Bank bank) {
		this.bank = bank;
	}
	
	public Account createCurrentAccount(Integer accountNumber, String accountHolder, Double accountBalance, AccountType accountType ,LocalDate dateOfCreation, Customer customer) {
		Account account = new CurrentAccount(
				accountNumber, 
				accountHolder, 
				accountBalance,
				accountType,
				LocalDate.now(), 
				customer);
		bank.addAccount(accountNumber, account);
		customer.addAccount(account);
		
		return account;
	}
	
	public void createSavingsAccount(Integer accountNumber, String accountHolder, Double accountBalance, AccountType accountType , LocalDate dateOfCreation,Customer customer, Double withdrawLimit) {
		Account account = new SavingsAccount(
				accountNumber, 
				accountHolder, 
				accountBalance,
				accountType,
				LocalDate.now(), 
				customer, 
				withdrawLimit);
		bank.addAccount(accountNumber, account);
		customer.addAccount(account);
	}
}
