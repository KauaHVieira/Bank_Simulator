package services;

import java.time.LocalDate;

import entities.Account;
import entities.Transaction;
import exceptions.InexistentAccountException;
import repository.Bank;

public class TransactionServiceImp implements TransactionService{
	
	private Transaction transaction;
	private Bank bank;
	
	
	public TransactionServiceImp(Bank bank) {
		this.bank = bank;
	}

	public void transfer(Account from, Account to, Double amount) {
		if(from == null || to == null) {
			throw new InexistentAccountException("Account not found!");
		}
		from.withdraw(amount);
		to.deposit(amount);
	}
	
	public void proccessTransaction(Double transactionValue, String transactionDescription, Account payer, Account receiver, LocalDate transactionDate) {
		transaction = new Transaction(transactionValue, transactionDescription, payer, receiver, transactionDate);
		bank.addTransaction(transaction);
	}
		
}
