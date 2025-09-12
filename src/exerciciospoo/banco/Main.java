package exerciciospoo.banco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Digite o titular da conta: ");
		String nome = sc.nextLine();

		System.out.println("Deseja realizar um depósito (s/n)?");
		char op = sc.next().charAt(0);
		
		Banco conta;

		if (Character.toLowerCase(op) == 's') {
			System.out.println("Digite o valor do depósito: ");
			double depositoInicial = sc.nextDouble();
            conta = new Banco(numero, nome, depositoInicial);
		}
		else {
            conta = new Banco(numero, nome);
        }
		
		System.out.print("\nDeseja realizar um depósito (s/n)? ");
        char opDep = sc.next().charAt(0);
        if (Character.toLowerCase(opDep) == 's') {
            System.out.print("Digite o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta.depositar(deposito);
            System.out.println("Dados da conta após depósito:");
            System.out.printf("Conta %d, Titular: %s, Saldo: $%.2f\n", 
                              conta.getConta(), conta.getTitular(), conta.getSaldo());
        }
        
        System.out.print("\nDeseja realizar um saque (s/n)? ");
        char opSaque = sc.next().charAt(0);
        if (Character.toLowerCase(opSaque) == 's') {
            System.out.print("Digite o valor do saque: ");
            double saque = sc.nextDouble();
            conta.sacar(saque);
            System.out.println("Dados da conta após saque:");
            System.out.printf("Conta %d, Titular: %s, Saldo: $%.2f\n", 
                              conta.getConta(), conta.getTitular(), conta.getSaldo());
        }

	}

}
