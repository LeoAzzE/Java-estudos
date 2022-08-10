package program;
import java.util.Scanner;
import entities.currencyConverter;

public class currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price ?");
		double price = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double buy = sc.nextDouble();
		
		double calc = currencyConverter.dollarTotal(price, buy);
		System.out.println();
		System.out.printf("Amount to be paid in reais: %.2fn", calc);
		
	}
}
