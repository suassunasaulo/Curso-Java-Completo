package exerciciosswhitchcase;

import java.util.Scanner;

public class Semana {
/*
 * Escreva um programa que leia um número inteiro de 1 a 7 e use um 
 * switch case para imprimir o dia da semana correspondente:
1 → Domingo

2 → Segunda-feira

3 → Terça-feira

4 → Quarta-feira

5 → Quinta-feira

6 → Sexta-feira

7 → Sábado

Se o número não estiver entre 1 e 7, exiba "Dia inválido".
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dia;
		
		System.out.println("Digite um número de 1 a 7:");
		dia = sc.nextInt();
		
		switch (dia) {
		
		case 1:
			System.out.println("Domingo");
			break;
			
		case 2:
			System.out.println("Segunda-feira");
			break;
			
		case 3:
			System.out.println("Terça-feira");
			break;
			
		case 4:
			System.out.println("Quarta-feira");
			break;
			
		case 5:
			System.out.println("Quinta-feira");
			break;
			
		case 6:
			System.out.println("Sexta-feira");
			break;
			
		case 7:
			System.out.println("Sábado");
			break;
			
			default:
				System.out.println("Dia inválido");
		}
		
		sc.close();

	}

}
