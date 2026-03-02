package entities;

import java.time.LocalDate;

public class Transaction {
	
	private Double transactionValue;
	private String transactionDescription;
	private Account buyer;
	private Account seller;
	private LocalDate transactionDate;
	
	
	
	public Transaction(Double transactionValue, String transactionDescription, Account buyer, Account seller,LocalDate transactionDate) {
		this.transactionValue = transactionValue;
		this.transactionDescription = transactionDescription;
		this.buyer = buyer;
		this.seller = seller;
		this.transactionDate = transactionDate;
	}

	public Double getTransactionValue() {return transactionValue;}

	public String getTransactionDescription() {return transactionDescription;}

	public void setTransactionDescription(String transactionDescription) {this.transactionDescription = transactionDescription;}

	public Account getBuyer() {return buyer;}

	public Account getSeller() {return seller;}

	public LocalDate getTransactionDate() {return transactionDate;}

	public void setTransactionDate(LocalDate transactionDate) {this.transactionDate = transactionDate;}
	
	
	
	
}
