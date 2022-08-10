import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] matriz = new int[m][n];
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		System.out.println("Insert a number inside the matrix");
		int matrixNumber = sc.nextInt();
		
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c++) {
				if (matriz[l][c] == matrixNumber) {
					System.out.println("POSITION: " + l + "," + c);
					System.out.println("LEFT: " + matriz[l][c - 1]);
					System.out.println("RIGHT: " + matriz[l][c + 1]);
					System.out.println("DOWN: " + matriz[l + 1][c]);
					
				}
			}
		}
		sc.close();
	}
}
