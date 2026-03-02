package services;

import java.time.LocalDate;

import entities.Account;

public interface TransactionService {
	
	void transfer(Account from, Account to, Double amount);
	void proccessTransaction(Double transactionValue, String transactionDescription, Account buyer,Account seller, LocalDate transactionDate);
	
}
