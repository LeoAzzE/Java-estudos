import java.util.Scanner;
public class vetores4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int contador = 0;
	System.out.print("Quantos numeros voce vai digitar ?");
	int storage = sc.nextInt();
	
	int vect[] = new int[storage];
	
	for (int i = 0; i < vect.length; i++) {
		System.out.print("Digite um numero: ");
		vect[i] = sc.nextInt();
		if (vect[i] % 2 == 0) {
			contador++;			
		}		
	}
	System.out.println("PARES: ");
	for (int i = 0; i < vect.length; i++) {
		if (vect[i] % 2 == 0) {
			System.out.printf("%d  " , vect[i]);	
		}		
	}
	
	System.out.println();
	System.out.println("Quantidade de pares = "+ contador);
	}

}
