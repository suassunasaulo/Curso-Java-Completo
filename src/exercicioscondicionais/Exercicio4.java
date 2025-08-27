package exercicioscondicionais;

import java.util.Scanner;

public class Exercicio4 {
/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio,fim,duracao;
		
		System.out.println("Digite a hora inicial do jogo");
		inicio = sc.nextInt();
		
		System.out.println("Digite a hora final do jogo");
		fim = sc.nextInt();
		
		if(inicio<fim) {
			duracao = fim - inicio;
		}
		
		else {
			duracao = 24 - (inicio-fim);
		}
		
		System.out.println("O JOGO DUROU "+duracao + " HORA(S)");
		sc.close();
		

	}

}
