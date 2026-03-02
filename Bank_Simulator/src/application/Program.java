package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] arg) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int opt = 0;
		
		while(opt != 0) {
			System.out.print("===================================");
			System.out.print("1 - Create Account");
			System.out.print("2 - Withdraw");
			System.out.print("3 - Deposit");
			System.out.print("4 - Transfer");
			System.out.print("5 - Show Accounts");
			System.out.print("6 - Show Transactions");
			System.out.print("0 - Leave");
			System.out.println("===================================");
			
			switch(opt) {
			case 1:
				System.out.println("Enter the account data: ");
				System.out.print("Customer Name: ");
				String name = sc.nextLine();
				System.out.println("Customer Email");
				String email = sc.nextLine();
				System.out.print("Account Number: ");
				int acc_num = sc.nextInt();
				
			case 2:
			
			case 3:
				
			case 4:
				
			case 5:
				
			case 6:
				
				
			
			}
		}
		
	}
}
