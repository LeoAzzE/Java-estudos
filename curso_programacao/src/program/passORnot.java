package program;
import java.util.Scanner;
import entities.student;

public class passORnot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	String aluno;
	student estudante = new student();
	
	System.out.println("Name: ");
	estudante.name = sc.nextLine();
	System.out.println("Grade A: ");
	estudante.gradeA = sc.nextDouble();
	System.out.println("Grade B: ");
	estudante.gradeB = sc.nextDouble();
	System.out.println("Grade C: ");
	estudante.gradeC = sc.nextDouble();
	
	System.out.println("FINAL GRADE = " + estudante.sumGrade());
	
		if (estudante.sumGrade() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", estudante.missing());
		}
		else {
			System.out.println("PASS");
		}
	} 

}
