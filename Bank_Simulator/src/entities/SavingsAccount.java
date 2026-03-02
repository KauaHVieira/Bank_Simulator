package entities;

import java.time.LocalDate;

import exceptions.WithdrawLimitException;

public class SavingsAccount extends Account{
	
	private Double withdrawLimit;

	public SavingsAccount(Integer accountNumber, String accountHolder, Double accountBalance, LocalDate dateOfCreation,Customer customer, Double withdrawLimit) {
		super(accountNumber, accountHolder, accountBalance, dateOfCreation, customer);
		this.withdrawLimit = withdrawLimit;
	}
	
	@Override
	public void withdraw(Double amount) {
		if (amount >= withdrawLimit) {
			throw new WithdrawLimitException("The amount exceeds the withdraw limit!");
		}
		
		super.withdraw(amount);
	}
	
	@Override
	public Double income(Double amount, Double fees) {
		return amount * fees;
	}

}
