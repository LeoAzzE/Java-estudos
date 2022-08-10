package main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import entities.Product;
import entities.importedProduct;
import entities.usedProduct;
public class application {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		
		for (int i = 1; i <= number; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.println("Common, used or imported (c/u/i)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (answer == 'c') {
				Product p = new Product(name, price);
				list.add(p);
			}
			
			if (answer == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				importedProduct ip = new importedProduct(name,price,customsFee);
				list.add(ip);
			}
			
			if (answer == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				usedProduct up = new usedProduct(name,price,date);
				list.add(up);
			}
		}
		
			System.out.println();
			System.out.println("PRICE TAGS:");
			for (Product prod : list) {
				System.out.println(prod.priceTag());
		}
		sc.close();
	}

}
