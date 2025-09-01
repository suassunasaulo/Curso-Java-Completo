package exerciciosfor;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite o número de testes");
		N=sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println("Digite o primeiro número");
			double x = sc.nextDouble();
			
			System.out.println("Digite o segundo número");
			double y = sc.nextDouble();
			
			if(y==0) {
				System.out.println("divisao impossivel");
			}
			
			else {
				double divisao = x/y;
				System.out.printf("%.1f%n",divisao);
			}
		}
		
		sc.close();
	}

}
