package application;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.AccountType;
import entities.Customer;
import entities.Transaction;
import repository.Bank;
import services.AccountService;
import services.CustomerService;
import services.TransactionService;
import services.TransactionServiceImp;

public class Program {

	public static void main(String[] arg) {

		Bank bank = new Bank();

		AccountService accountService = new AccountService(bank);
		TransactionService transactionService = new TransactionServiceImp(bank);

		CustomerService customerService = new CustomerService();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int opt = 0;

		while (opt != 7) {
			System.out.println("===================================");
			System.out.println("1 - Create Account");
			System.out.println("2 - Withdraw");
			System.out.println("3 - Deposit");
			System.out.println("4 - Transfer");
			System.out.println("5 - Show Accounts");
			System.out.println("6 - Show Transactions");
			System.out.println("7 - Leave");
			System.out.println("===================================");
			System.out.print("Choose an option: ");
			opt = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (opt) {
			case 1:
				System.out.print("Enter the type of account(Current/Savings): ");
				String type_acc = sc.nextLine().trim().toUpperCase();
				
				System.out.println("Enter the Customer data: ");
				System.out.print("Customer Name: ");
				String name = sc.nextLine();
				System.out.print("Customer Email: ");
				String email = sc.nextLine();
				
				System.out.println("Enter the account data: ");
				System.out.print("Account Number: ");
				int acc_num = sc.nextInt();
				sc.nextLine();
				System.out.print("Account holder: ");
				String holder = sc.nextLine();
				System.out.print("Account initial Balance: ");
				double acc_balance = sc.nextDouble();
				
				Customer customer = customerService.createCustomer(name, email);
				
				if (type_acc.equals("SAVINGS")) {
					System.out.println("Type the withdraw Limit: ");
					double withdraw_limit = sc.nextDouble();
					accountService.createSavingsAccount(
							acc_num, 
							holder, 
							acc_balance,
							AccountType.valueOf(type_acc), 
							LocalDate.now(), 
							customer, 
							withdraw_limit
					);
				} else {
					accountService.createCurrentAccount(acc_num, 
							holder, 
							acc_balance, 
							AccountType.valueOf(type_acc), 
							LocalDate.now(), 
							customer
					);
				}
				
				System.out.println();
				System.out.println("Account created successfully");
				System.out.println();
				break;
			case 2:
				System.out.print("Enter the Account number you wish to withdraw: ");
				acc_num = sc.nextInt();
				Account account = bank.findAccount(acc_num);
				System.out.print("Enter the amount to be withdrawed: ");
				Double amount = sc.nextDouble();
				account.withdraw(amount);
				System.out.println("Value withdrawed successfully");
				break;
			case 3:
				System.out.print("Enter the Account number you wish to deposit: ");
				acc_num = sc.nextInt();
				account = bank.findAccount(acc_num);
				System.out.print("Enter the amount to be deposited: ");
				amount = sc.nextDouble();
				account.deposit(amount);
				System.out.println("Value deposited successfully");
				break;
			case 4:
				System.out.print("Enter the Transference description: ");
				String description = sc.nextLine();
				
				System.out.print("Enter the Account number you wish to be the payer: ");
				acc_num = sc.nextInt();
				Account payer_account = bank.findAccount(acc_num);
				
				System.out.print("Enter the Account number you wish to be the receiver: ");
				acc_num = sc.nextInt();
				Account receiver_account = bank.findAccount(acc_num);
				
				System.out.print("Enter the amount to be transferred: ");
				amount = sc.nextDouble();
				transactionService.transfer(
						payer_account, 
						receiver_account, 
						amount
				);
				transactionService.proccessTransaction(
						amount, 
						description, 
						payer_account, 
						receiver_account, 
						LocalDate.now()
				);
				System.out.println("The Transference was a success!");
				break;
			case 5:
				System.out.println("ACCOUNTS: ");
				for (Account acc : bank.getAllAccounts()) {
					System.out.println(acc);
				}
				break;
			case 6:
				System.out.println("TRANSACTIONS: ");
				for (Transaction tr : bank.getAllTransactions()) {
					System.out.println(tr);
				}
				break;
			}
		}

	}
}
