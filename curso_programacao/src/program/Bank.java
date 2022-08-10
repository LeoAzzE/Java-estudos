package program;
import java.util.Scanner;
import entities.bankAccount;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		bankAccount banco;
		System.out.print("Enter Account number: ");
		int number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		System.out.println();
			if(answer == 'y') {
				System.out.print("Enter initial deposit value: ");
				double iniDep = sc.nextDouble();
				banco = new bankAccount(number, holder, iniDep);			
			}
			
			else {
				banco = new bankAccount(number, holder);
			}
		System.out.println();
		System.out.println("Account Data:");	
		System.out.println("Account:" + banco.toString());
		
		System.out.println("Enter a deposit value:");
		double value = sc.nextDouble();
		banco.deposit(value);
		System.out.println();
		System.out.print("Updated account data:");
		System.out.println();
		System.out.println("Account:" + banco.toString());
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		banco.withdraw(withdraw);
		System.out.println();
		System.out.print("Updated account data:");
		System.out.println("Account:" + banco.toString());
		
		sc.close();
	}

}
