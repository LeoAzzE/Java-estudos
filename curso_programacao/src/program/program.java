package program;
import java.util.Scanner;
import entities.rectangle;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		rectangle retangulo = new rectangle();
		
		System.out.println("Digite a altura do retangulo");
		retangulo.height = sc.nextDouble();
		System.out.println("Digite a largura do retangulo");
		retangulo.width = sc.nextDouble();
		
		
		System.out.println("AREA =" + retangulo.area());
		System.out.println("perimetro =" + retangulo.perimeter());
		System.out.println("diagonal =" + retangulo.diag());
		
		sc.close();
	}

}
