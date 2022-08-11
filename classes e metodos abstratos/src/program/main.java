package program;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.tax;
import entities.PF;
import entities.PJ;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<tax> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.print("Tax payer #" +i + "data: ");
			System.out.print("PF or PF (F / J)? ");
			char p = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Annual income: ");
			double income = sc.nextDouble();
			
			if (p == 'F') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				PF pf = new PF(name, income, health);
				list.add(pf);
			}
			
			if (p == 'J') {
				System.out.print("Number of employee: ");
				int emp = sc.nextInt();
				PJ pj = new PJ(name, income, emp);
				list.add(pj);
			}
		}
			System.out.println();
			
			System.out.println("TAXES PAID: ");
				for(tax taxa : list) {
					System.out.println(taxa.getName() + ": $ " +
							taxa.Tax());
				}
			System.out.println();
			double sum = 0;
			
			for (tax tx : list) {
				sum += tx.Tax();
			}
			System.out.println("TOTAL TAXES: $ " + sum);
			
		sc.close();
	}

}
