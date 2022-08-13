package Program;
import java.util.Scanner;

import entities.Account;
import entities.exceptions.DomainException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account(number,holder,balance,withdrawLimit);
		
		System.out.println("Enter amount for withdraw:");
		double withdrawAmount = sc.nextDouble();
		
		try {
			account.withdraw(withdrawAmount);
			System.out.println("New balance: " + account.getBalance());
		}
		
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}
}
