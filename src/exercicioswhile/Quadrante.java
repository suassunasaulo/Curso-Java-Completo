package exercicioswhile;

import java.util.Locale;
import java.util.Scanner;

public class Quadrante {
	/*
	 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
	 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
	 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
	 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
	 * alguma).
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println("Digite o valor de X");
		x = sc.nextDouble();

		System.out.println("Digite o valor de Y");
		y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
			}

			else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			}

			else if (x < 0 && y < 0) {
				System.out.println("Quadrante 3");
			}

			else {
				System.out.println("Quadrante 4");
			}

			System.out.println("Digite o valor de X");
			x = sc.nextDouble();

			System.out.println("Digite o valor de Y");
			y = sc.nextDouble();
		}

		sc.close();

	}

}
