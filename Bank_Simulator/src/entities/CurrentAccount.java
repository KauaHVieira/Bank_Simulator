package entities;

import java.time.LocalDate;

public class CurrentAccount extends Account implements Comparable<CurrentAccount> {

	public CurrentAccount(Integer accountNumber, String accountHolder, Double accountBalance, LocalDate dateOfCreation,Customer customer) {
		super(accountNumber, accountHolder, accountBalance, dateOfCreation, customer);
	}

	@Override
	public int compareTo(CurrentAccount account) {
		return account.getAccountHolder().compareTo(account.getAccountHolder());
	}
	
	

}
