package services;

import java.time.LocalDate;

import entities.Account;
import entities.CurrentAccount;
import entities.Customer;
import repository.Bank;

public class CreateAccountService {
	
	private Bank bank;
	
	public void createCurrentAccount(Integer accountNumber, String accountHolder, Double accountBalance, LocalDate dateOfCreation, Customer customer) {
		Account account = new CurrentAccount(accountNumber, accountHolder, accountBalance, dateOfCreation, customer);
		bank.addAccount(accountNumber, account);
		customer.addAccount(account);
	}
	
}
