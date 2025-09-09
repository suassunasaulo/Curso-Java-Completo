package exerciciospoo.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Name: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println(funcionario);
		
		System.out.println("Qual a porcentagem do aumento do salário?");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		
		System.out.println("\nDados atualizados: " + funcionario);
		
		sc.close();
	}

}
