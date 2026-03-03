package entities;

import java.time.LocalDate;

public class Transaction {
	
	private Double transactionValue;
	private String transactionDescription;
	private Account payer;
	private Account receiver;
	private LocalDate transactionDate;
	
	
	
	public Transaction(Double transactionValue, String transactionDescription, Account payer, Account receiver,LocalDate transactionDate) {
		this.transactionValue = transactionValue;
		this.transactionDescription = transactionDescription;
		this.payer = payer;
		this.receiver = receiver;
		this.transactionDate = transactionDate;
	}

	public Double getTransactionValue() {return transactionValue;}

	public String getTransactionDescription() {return transactionDescription;}

	public void setTransactionDescription(String transactionDescription) {this.transactionDescription = transactionDescription;}

	public Account getPayer() {return payer;}

	public Account getReceiver() {return receiver;}

	public LocalDate getTransactionDate() {return transactionDate;}

	public void setTransactionDate(LocalDate transactionDate) {this.transactionDate = transactionDate;}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Transaction Value: " + String.format("%.2f", transactionValue) + "\n");
		sb.append("Transaction Description: " + transactionDescription + "\n");
		sb.append("Transaction Payer: " +  payer.getAccountHolder() + "\n");
		sb.append("Transaction Receiver: " + receiver.getAccountHolder() + "\n");
		sb.append("Trransaction Date: " + transactionDate);
		return sb.toString();
	}
	
	
}
