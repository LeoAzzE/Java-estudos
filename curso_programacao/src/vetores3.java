import java.util.Scanner;

public class vetores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double media = 0, menor = 0;
		String nomes = null;
		
		System.out.print("Quantas pessoas serão digitadas?");
		int storage = sc.nextInt();
		
		String name[] = new String[storage];
		int age[] = new int[storage];
		double height[] = new double[storage];
		
		for (int i = 0; i < storage; i++) {
			System.out.printf("Dados da %d pessoa:\n", i + 1);
			System.out.print("Name: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			height[i] = sc.nextDouble();
		}
		for (int i = 0; i < storage; i++) {
			media += height[i];
		}
			media = media/storage;
			System.out.println();

		for (int i = 0; i < storage; i++) {
			if (age[i] < 16) {
				menor++;
			}
		}
		menor = (menor/storage) * 100;
		
		System.out.printf("Altura média: %.2f " ,media);
		System.out.println();
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%",menor);
		System.out.println();
		
		for (int i = 0; i < storage; i++) {
			if (age[i] < 16) {
	        	System.out.printf("%s\n", name[i]);
	        }
		}
	}
}
