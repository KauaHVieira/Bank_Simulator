package repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Account;
import entities.Transaction;
import exceptions.InexistentAccountException;

public class Bank {
	
	private Map<Integer, Account> accounts = new HashMap<>();
	
	private List<Transaction> transactions = new ArrayList<>();
	
	public void addAccount(Integer accountNumber, Account account) {
		accounts.put(accountNumber, account);
	}
	
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	
	public Collection<Account> getAllAccounts() {
	    return Collections.unmodifiableCollection(accounts.values());
	}
	
	public Collection<Transaction> getAllTransactions() {
		return Collections.unmodifiableList(transactions);
	}
	
	public Account findAccount(Integer accountNumber) {
		
		Account account = accounts.get(accountNumber);
		
		if(account == null) {
			throw new InexistentAccountException("Account not found");
		}
		
		return account;
		
	}
}
