package services;

import java.time.LocalDate;

import entities.Account;
import entities.Transaction;
import repository.Bank;

public class TransactionServiceImp implements TransactionService{
	
	private Transaction transaction;
	private Bank bank;
	
	
	public TransactionServiceImp(Bank bank) {
		this.bank = bank;
	}

	public void transfer(Account from, Account to, Double amount) {
		from.withdraw(amount);
		to.deposit(amount);
	}
	
	public void proccessTransaction(Double transactionValue, String transactionDescription, Account buyer,Account seller, LocalDate transactionDate) {
		transaction = new Transaction(transactionValue, transactionDescription, buyer, seller, LocalDate.now());
		bank.addTransaction(transaction);
	}
		
}
