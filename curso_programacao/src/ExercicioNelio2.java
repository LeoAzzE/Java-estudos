import java.util.Scanner;
public class ExercicioNelio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		/*EXercício 1
		int number;		
		System.out.println("Digite um numero inteiro");
		number = sc.nextInt();
		
		if (number < 0) {
			System.out.println("NEGATIVO");
			}
		if (number > 0) {
			System.out.println("POSITIVO");
			}
		if (number == 0) {
			System.out.println("NÃO NEGATIVO");
		} */
		
		
		/* Exercicio 2
		int number;
		System.out.println("Digite um numero inteiro");
		number = sc.nextInt();
		
		if (number/2 == 0) {
			System.out.println("PAR");
		}
		else if (number/2 != 0) {
			System.out.println("IMPAR");
		}
		else {
			System.out.println("PAR");
		} */
		
		/*Exercicio 3
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		
		if (number2 % number1 == 0 || number1 % number2 == 0) {
			System.out.println("É MULTIPLO");
		}
	
		sc.close();
		*/
		
		/*Exercício 4
		int hora1 , hora2, result, result2;
		
		hora1 = sc.nextInt();
		hora2 = sc.nextInt();
		result = hora2-hora1;
		result2 = 24 - hora1 + hora2;
		
		if (hora2 > hora1) {
			System.out.println("O JOGO DUROU" + result + "horas");
		}
		if (hora1 > hora2) {
			System.out.println("O JOGO DUROU" + result2 + "horas");
		}
		
		else {
			System.out.print("O JOGO DUROU 24horas");
		}	*/
		
		int n;
		int x = 1;
		
		n = sc.nextInt();
		for (int i = n; i > 0 && i <= n; i--) {
			x = x * i;
			System.out.println(" " + x);
			
		};	
			
		sc.close();
	}

}
