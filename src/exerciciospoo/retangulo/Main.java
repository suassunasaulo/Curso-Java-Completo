package exerciciospoo.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	/*
	 * Fazer um programa para ler os valores da largura e altura de um retângulo. Em
	 * seguida, mostrar na tela o valor de sua área, perímetro e diagonal. Usar uma
	 * classe como mostrado no projeto ao lado.
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Enter rectangle width and height:");

		retangulo.height = sc.nextDouble();
		retangulo.width = sc.nextDouble();

		System.out.printf("ÁREA = %.2f%n", retangulo.Area());
		System.out.printf("PERIMETRO = %.2f%n", retangulo.Perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.Diagonal());

		sc.close();
	}

}
