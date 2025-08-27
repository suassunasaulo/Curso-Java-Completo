package exercicioscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	/**
	 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
	 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar
	 * 
	 * CÓDIGO | ESPECIFICAÇÃO | PREÇO ------------------------------------- 1 |
	 * Cachorro Quente | R$ 4.00 2 | X-Salada | R$ 4.50 3 | X-Bacon | R$ 5.00 4 |
	 * Torrada simples | R$ 2.00 5 | Refrigerante | R$ 1.50
	 * 
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double total;

		System.out.println("Digite o código do ítem");
		codigo = sc.nextInt();

		System.out.println("Digite a quantidade");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			total = quantidade * 4;
			System.out.printf("Total: R$ %.2f%n", total);
		}

		else if (codigo == 2) {
			total = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}

		else if (codigo == 3) {
			total = quantidade * 5;
			System.out.printf("Total: R$ %.2f%n", total);
		}

		else if (codigo == 4) {
			total = quantidade * 2;
			System.out.printf("Total: R$ %.2f%n", total);
		}

		else if (codigo == 5) {
			total = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%n", total);
		}

		else {
			System.out.println("OPÇÃO INVÁLIDA");
		}

		sc.close();

	}

}
