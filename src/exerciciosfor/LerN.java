package exerciciosfor;

import java.util.Scanner;

public class LerN {
	/*
	 Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
	 */
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	int N;
	int in =0;
	int out=0;
	
	System.out.println("Digite um número");
	N=sc.nextInt();
	
	for(int i = 0; i<N; i++) {
		System.out.println("Digite um número");
		int X = sc.nextInt();
		
		if(X>=10 && X<=20) {
			in = in+1;
		}
		else {
			out= out+1;
		}
		
	}
	
	System.out.println(in + " in");
	System.out.println(out + " out");
	
	sc.close();
	}

}
