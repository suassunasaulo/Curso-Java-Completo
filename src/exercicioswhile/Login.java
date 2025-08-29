package exercicioswhile;

import java.util.Scanner;

public class Login {
	/*
	 * Crie um programa que simule a tela de login de um sistema. O usuário deve
	 * fornecer um nome de usuário e uma senha. As credenciais corretas são:
	 * Usuário: "admin" Senha: "1234" O usuário tem no máximo 3 tentativas para
	 * acertar as credenciais. O programa deve seguir as seguintes regras: Solicitar
	 * ao usuário que digite o nome de usuário e a senha. Se o nome de usuário e a
	 * senha estiverem corretos, o programa deve exibir a mensagem
	 * "Acesso Concedido" e ser encerrado. Se pelo menos um dos dois estiver
	 * incorreto, o programa deve exibir a mensagem
	 * "Usuário ou senha inválidos. Tentativas restantes: X", onde X é o número de
	 * tentativas que ainda restam. Após 3 tentativas incorretas, o programa deve
	 * exibir a mensagem "Acesso bloqueado. Contate o administrador." * e ser
	 * encerrado.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String usuario_correto = "admin";
		final String senha_correta = "1234";
		final int max_tentativas = 3;

		int tentativas = 0;
		boolean acesso_concedido = false;

		while (tentativas < max_tentativas && !acesso_concedido) {
			System.out.println("Digite seu usuário");
			String usuario = sc.nextLine();

			System.out.println("Digite sua senha");
			String senha = sc.nextLine();

			if (usuario.equals(usuario_correto) && senha.equals(senha_correta)) {
				System.out.println("Acesso concedido");
				acesso_concedido = true;
			}

			else {
				tentativas += 1;
				int tentativas_restantes = max_tentativas - tentativas;
				if (tentativas_restantes > 0) {

					System.out.println("Usuário ou senha inválidos. Tentativas restantes: " + tentativas_restantes);
				}

				else {
					System.out.println("Acesso bloqueado. Contate o administrador.");
				}
			}
		}

		sc.close();

	}

}
