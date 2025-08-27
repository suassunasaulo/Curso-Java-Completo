package exerciciosintrodutorios;
import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,soma;
		
		System.out.println("Digite um número");
		n1 = sc.nextInt();
		System.out.println("Digite outro número");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		System.out.println("SOMA = " + soma);
		
		sc.close();

	}

}
