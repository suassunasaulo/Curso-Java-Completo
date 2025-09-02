package exerciciosfor;

import java.util.Scanner;

public class Divisores {
/*
 * Ler um número inteiro N e calcular todos os seus divisores. 

 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		System.out.println("Digite um número");
		N = sc.nextInt();
		
		for (int i = 1; i<=N; i++) {
			if(N%i==0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
