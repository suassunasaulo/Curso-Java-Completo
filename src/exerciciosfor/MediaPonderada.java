package exerciciosfor;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
			
		int N;
		double X,Y,Z,media;
		
		System.out.println("Digite o número de casos de teste");
		N=sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			System.out.print("Digite o valor de X");
			X=sc.nextDouble();
			
			System.out.print("Digite o valor de Y");
			Y=sc.nextDouble();
			
			System.out.print("Digite o valor de Z");
			Z=sc.nextDouble();
			
			media = ((X * 2.0) + (Y * 3.0) + (Z * 5.0)) / 10.0;
			
			System.out.printf("%.1f%n",media);
		}
		
		sc.close();

	}

}
