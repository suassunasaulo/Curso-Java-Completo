package exercicioscondicionais;

import java.util.Scanner;

public class Exercicio2 {
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um número");
		numero = sc.nextInt();
		
		if(numero %2 == 0) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
