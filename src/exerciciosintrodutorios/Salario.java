package exerciciosintrodutorios;
import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero,hora;
		double valorhora;
		
		System.out.println("Digite o número do funcionário");
		numero = sc.nextInt();
		
		System.out.println("Digite o número de horas trabalhadas");
		hora = sc.nextInt();
		
		System.out.println("Digite o valor da hora do funcionário");
		valorhora = sc.nextDouble();
		
		double salario = hora * valorhora;
		
		System.out.println("NÚMERO = "+numero);
		System.out.printf("SALÁRIO = U$ %.2f\n",salario);
		
		sc.close();

	}

}
