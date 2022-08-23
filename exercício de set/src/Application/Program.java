package Application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.students;

public class Program {

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Set<students> study = new HashSet<>();
	
	System.out.print("How many students for course A ?");
	int studentA = sc.nextInt();
	
	for (int i = 0; i < studentA; i++) {
		int matriculaA = sc.nextInt();
		study.add(new students(matriculaA));
	}
	
	System.out.print("How many students for course B ?");
	int studentB = sc.nextInt();
	
	for (int i = 0; i < studentB; i++) {
		int matriculaB = sc.nextInt();
		study.add(new students(matriculaB));
		}
	
	System.out.print("How many students for course C ?");
	int studentC = sc.nextInt();
	
	for (int i = 0; i < studentC; i++) {
		int matriculaC = sc.nextInt();
		study.add(new students(matriculaC));
		}
	System.out.println();
	System.out.println("Total students: " + study.size());
	
	sc.close();
	}

}
