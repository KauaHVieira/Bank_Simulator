package entities;

import java.time.LocalDate;

public class Transaction {
	
	private Double transactionValue;
	private String transactionDescription;
	private Integer buyerNumber;
	private Integer sellerNumber;
	private LocalDate transactionDate;
	
	public Transaction(Double transactionValue, String transactionDescription, Integer buyerNumber,Integer sellerNumber, LocalDate transactionDate) {
		this.transactionValue = transactionValue;
		this.transactionDescription = transactionDescription;
		this.buyerNumber = buyerNumber;
		this.sellerNumber = sellerNumber;
		this.transactionDate = transactionDate;
	}

	public Double getTransactionValue() {return transactionValue;}

	public String getTransactionDescription() {return transactionDescription;}

	public void setTransactionDescription(String transactionDescription) {this.transactionDescription = transactionDescription;}

	public Integer getBuyerNumber() {return buyerNumber;}

	public Integer getSellerNumber() {return sellerNumber;}

	public LocalDate getTransactionDate() {return transactionDate;}

	public void setTransactionDate(LocalDate transactionDate) {this.transactionDate = transactionDate;}
	
	
	
	
}
