package exerciciosfor;

import java.util.Scanner;

public class NumerosImpares {
	
	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite um valor entre 1 e 1000");
		x=sc.nextInt();
		
		while(x<1 || x>1000) {
			
			System.out.println("Valor inválido. Digite novamente");
			x=sc.nextInt();
		}
		
		for(int i=1;i<=x;i++) {
			if (i % 2 != 0) {
		        System.out.println(i);
			}
		}
		sc.close();

	}

}
