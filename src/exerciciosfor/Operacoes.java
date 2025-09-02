package exerciciosfor;

import java.util.Scanner;

public class Operacoes {
/*
 * Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,primeiro,segundo,terceiro;
		
		System.out.println("Digite um número");
		N=sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			primeiro = i;
			segundo = i*i;
			terceiro = i*i*i;
			
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();

	}

}
