package exerciciosintrodutorios;
import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double raio,area;
		
		System.out.println("Digite o valor do raio do círculo");
		raio = sc.nextDouble();
		
		area = 3.14159 * (Math.pow(raio,2));
		System.out.printf("A = %.4f\n",area);
		
		sc.close();

	}

}
