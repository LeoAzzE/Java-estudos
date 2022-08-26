package main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.data;
public class Program {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		List<data> list = new ArrayList<>();
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try (BufferedReader buf = new BufferedReader(new FileReader(path))) {
			String line = buf.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new data(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = buf.readLine();
			}
	
					List<String> email = list.stream()
								.filter(s -> s.getSalary() > salary)
								.map(e -> e.getEmail())
								.sorted()
								.collect(Collectors.toList());
				
				System.out.println("Email of people whose salary is more than 2000.00: ");
				email.forEach(System.out::println);
				
				double sum = list.stream()
							.filter(n -> n.getName().charAt(0) == 'M')
							.map(sal -> sal.getSalary())
							.reduce(0.0, (x , y) -> x + y);
				
				System.out.print("Sum of salary of people whose name starts with 'M' : "
						+ String.format("%.2f", sum));
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
