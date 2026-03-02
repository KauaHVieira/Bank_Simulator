package application;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
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
			System.out.println();
			switch (opt) {
			case 1:

				System.out.println("Enter the type of account(Current/Saving): ");
				System.out.print("(c/s): ");
				char type_acc = sc.next().charAt(0);
				sc.nextLine();
				System.out.println("Enter the account data: ");
				System.out.print("Customer Name: ");
				String name = sc.nextLine();
				System.out.print("Customer Email: ");
				String email = sc.nextLine();
				System.out.print("Account Number: ");
				int acc_num = sc.nextInt();
				System.out.print("Account holder: ");
				String holder = sc.nextLine();
				sc.nextLine();
				System.out.print("Account initial Balance: ");
				double acc_balance = sc.nextDouble();

				if (type_acc == 's') {
					System.out.println("Type the withdrawLimit: ");
					double withdraw_limit = sc.nextDouble();
					accountService.createSavingsAccount(acc_num, holder, acc_balance, LocalDate.now(),
							customerService.createCustomer(name, email), withdraw_limit);
				} else {
					accountService.createCurrentAccount(acc_num, holder, acc_balance, LocalDate.now(),
					customerService.createCustomer(name, email));
				}
				System.out.println();
				System.out.println("Account created successfully");
				System.out.println();
				break;
			case 2:

			case 3:

			case 4:

			case 5:
				System.out.println("ACCOUNTS: ");
				for (Account acc : bank.getAllAccounts()) {
					System.out.println(acc);
				}
			case 6:

			}
		}

	}
}
