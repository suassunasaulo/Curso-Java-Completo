package exerciciosintrodutorios;
import java.util.Locale;
import java.util.Scanner;

public class Geometria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C,triangulo,circulo,trapezio,quadrado,retangulo;
		
		System.out.println("Digite o valor A");
		A = sc.nextDouble();
		
		System.out.println("Digite o valor B");
		B = sc.nextDouble();
		
		System.out.println("Digite o valor C");
		C = sc.nextDouble();
		
		triangulo = (A*C)/2;
		circulo = 3.14159 * (Math.pow(C,2));
		trapezio = ((A + B) * C) / 2;
		quadrado = Math.pow(B,2);
		retangulo = A * B;
		
		
		System.out.printf("TRIANGULO: %.3f%n",triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio);
		System.out.printf("QUADRADO: %.3f%n",quadrado);
		System.out.printf("RETANGULO: %.3f%n",retangulo);
		
		sc.close();

	}

}
