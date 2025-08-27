package exerciciosswhitchcase;

import java.util.Scanner;

public class Calculadora {
/*
 * Faça um programa que leia dois números e um operador (+, -, * ou /).
Use switch case para calcular e exibir o resultado da operação.
Se o usuário digitar um operador inválido, exiba "Operador inválido".
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y,resultado;
		char operador;
		
		System.out.println("Digite o primeiro número:");
		x = sc.nextDouble();
		
		System.out.println("Digite o segundo número:");
		y = sc.nextDouble();
		
		System.out.println("Digite o operador (+, -, *, /):");
		operador = sc.next().charAt(0);
		
		switch(operador) {
		case '+' :
			resultado = x+y;
		System.out.println("Resultado: "+resultado);
		break;
		
		case '-' :
			resultado = x-y;
		System.out.println("Resultado: "+resultado);
		break;
		
		case '*' :
			resultado = x*y;
		System.out.println("Resultado: "+resultado);
		break;
		
		  case '/':
              if (y != 0) {
                  resultado = x / y;
                  System.out.printf("Resultado: %.2f%n", resultado);
              } else {
                  System.out.println("Erro: divisão por zero não permitida!");
              }
              break;
		
		default:
			System.out.println("Operador inválido");
			
		}
		
		sc.close();

	}

}
