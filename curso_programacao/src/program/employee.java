package program;
import java.util.Scanner;
import entities.emplo;

public class employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		emplo funcionario = new emplo();
		
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		System.out.println("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee:" + funcionario.ToString());
		System.out.println("Which percentage to increase salary?");
		Double percentage = sc.nextDouble();
		funcionario.increaseSalary(percentage);
		System.out.println("Updated data:" + funcionario.ToString());
		sc.close();	
	}
}
