import java.util.Scanner;

public class vetores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double aux = 0;
		double media = 0;
		System.out.print("Quantos numeros voce vai digitar ?");
		int storage = sc.nextInt();
		
		int vect[] = new int[storage];
		
		for (int i=0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite um numero:");
			vect[i] = sc.nextInt();
		}
		System.out.print("VALORES = ");
		for (int i=0; i < vect.length; i++) {
			System.out.printf("%d ", vect[i]);
		}
		System.out.println();
		for (int i=0; i < vect.length; i++) {
			aux += vect[i];
		}
		System.out.printf("SOMA = %.2f\n", aux);
		media = (aux / vect.length);
		
		System.out.printf("MEDIA = %.2f\n", media);
	}

}
