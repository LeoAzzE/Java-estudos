import java.util.Scanner;

public class vetores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int negativos = 0;
		System.out.print("Quantos numeros voce vai digitar?");
		
		int key = sc.nextInt();
		
		int[] vetor = new int[key];
		
		for(int i=0; i < vetor.length; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();	
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
	
		for(int x = 0; x < vetor.length; x++) {
			if (vetor[x] < 0) {
				System.out.printf("%d\n", vetor[x]);						
			} 
		}
			sc.close();
		}
	}			

