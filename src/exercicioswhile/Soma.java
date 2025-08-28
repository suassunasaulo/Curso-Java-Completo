package exercicioswhile;

import java.util.Scanner;

public class Soma {
/*
 * Fazer um programa que lê números
inteiros até que um zero seja lido. Ao
final mostra a soma dos números lidos.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma = 0;
		
		System.out.println("Digite um número");
		x=sc.nextInt();
		
		while (x!=0) {
			System.out.println("Digite um número");
			soma = soma + x;
			x=sc.nextInt();
		}
		
		System.out.println("Resultado da soma dos números digitados: "+soma);
		
		sc.close();

	}

}
