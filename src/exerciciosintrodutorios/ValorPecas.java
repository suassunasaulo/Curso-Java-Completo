package exerciciosintrodutorios;
import java.util.Locale;
import java.util.Scanner;

public class ValorPecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeropecas1,numeropecas2;
		double valorpeca1,valorpeca2,total;		
		
		System.out.println("Digite o número de peças 1 adquirida");
		numeropecas1 = sc.nextInt();
		
		System.out.println("Digite o valor unitário de cada peça 1 adquirida");
		valorpeca1 = sc.nextDouble();
		
		System.out.println("Digite o número de peças 2 adquirida");
		numeropecas2 = sc.nextInt();
		
		System.out.println("Digite o valor unitário de cada peça 2 adquirida");
		valorpeca2 = sc.nextDouble();
		
		total = (numeropecas1 * valorpeca1) + (numeropecas2 * valorpeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
		sc.close();

	}

}
