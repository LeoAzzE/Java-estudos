import java.util.Scanner;

import entities.employee;

import java.util.ArrayList;
import java.util.List;
public class exercicioList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered ?");
		int resp = sc.nextInt();
		
		List<employee> lista = new ArrayList<>();
		
		for (int i=0; i < resp; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1)+":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			employee emp = new employee(id, name, salary);
			
			lista.add(emp);
		}
		System.out.print("Enter the employee id that will have salary increase :");
		int idsalary = sc.nextInt();
		Integer pos = position(lista, idsalary);
		if (pos == null) {
			System.out.println("This id does not exist");
		}
		else {
			System.out.print("Enter the percentage");
			double percent = sc.nextDouble();
			lista.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees");
		for (employee emp: lista) {
			System.out.println(emp);
		}
		
		sc.close();
	}
	
	public static Integer position(List<employee> list, int id) {
		for (int i=0; i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return -1;
	}
}
