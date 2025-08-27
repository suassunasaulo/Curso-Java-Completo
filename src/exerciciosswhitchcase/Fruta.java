package exerciciosswhitchcase;

import java.util.Scanner;

public class Fruta {
	/*
	 * Faça um programa que leia o nome de uma fruta (como "maçã", "banana",
	 * "laranja", "uva" ou "melancia") e use um switch case para imprimir a cor da
	 * fruta.
	 * 
	 * Exemplo:
	 * 
	 * "maçã" → "Vermelha"
	 * 
	 * "banana" → "Amarela"
	 * 
	 * "laranja" → "Laranja"
	 * 
	 * "uva" → "Roxa"
	 * 
	 * "melancia" → "Verde por fora, vermelha por dentro"
	 * 
	 * Se a fruta não estiver na lista, exiba "Fruta desconhecida".
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fruta;
		
		System.out.println("Escolha uma fruta: maçã, banana, laranja, uva ou melancia");
		fruta = sc.nextLine().toLowerCase();
		
		switch(fruta) {
		case "maçã":
			System.out.println("Vermelha");
			break;
			
		case "banana":
			System.out.println("Amarela");
			break;
			
		case "laranja":
			System.out.println("Laranja");
			break;
			
		case "uva":
			System.out.println("Roxa");
			break;
			
		case "melancia":
			System.out.println("Verde por fora, vermelha por dentro");
			break;
			
			default:
				System.out.println("Fruta desconhecida");
		}
		
		sc.close();

	}

}
