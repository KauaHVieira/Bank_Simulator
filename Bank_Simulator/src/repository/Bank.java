package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.Account;
import entities.Transaction;

public class Bank {
	
	private Map<Integer, Account> accounts = new HashMap<>();
	
	private List<Transaction> transactions = new ArrayList<>();
	
	public void addAccount(Integer accountNumber, Account account) {
		accounts.put(accountNumber, account);
	}
}
