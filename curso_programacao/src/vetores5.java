import java.util.Scanner;
public class vetores5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maior = 0;
		int posMaior = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int storage = sc.nextInt();
		
		int vect[] = new int[storage];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero");
			vect[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vect.length; i++) {
			vect[0] = maior;
			if (vect[i] > maior) {
				maior = vect[i];
				posMaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR= %d " , maior);
		System.out.printf("POSIÇÃO DO MAIOR = %d " , posMaior);
		sc.close();	
	}
}

