package exerciciosintrodutorios;
import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D;
		
		System.out.println("Digite o número A");
		A = sc.nextInt();
		
		System.out.println("Digite o número B");
		B = sc.nextInt();
		
		System.out.println("Digite o número C");
		C = sc.nextInt();
		
		System.out.println("Digite o número D");
		D = sc.nextInt();
		
		int DIFERENCA = ((A*B)-(C*D));
		
		System.out.println("DIFERENÇA = "+DIFERENCA);
		
		sc.close();

	}

}
