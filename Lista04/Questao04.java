package Lista04;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		double saldo;
		int opcao = 0;
		boolean invalido = false;

		System.out.println("Cadastro de cpmta: ");
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Deposito inicial: R$");
		saldo = leia.nextDouble();

		do {

			System.out.println("   Banco Silva   ");
			System.out.println("Cliente: " + nome);
			System.out.println("Saldo: R$" + saldo + "\n");
			if (invalido == true) {
				System.out.println("⚠️ Opção Invalida ⚠️");
			}
			System.out.println("1 - Deposito");
			System.out.println("2 - Retirada");
			System.out.println("3 - Fim");
			System.out.print("R: ");
			opcao = leia.nextInt();
			invalido = false;
			switch (opcao) {

			case 1:
				System.out.println("   Banco Silva   ");
				System.out.println("Cliente: " + nome);
				System.out.println("Saldo: R$" + saldo + "\n");

				System.out.println("Qual valor deseja depositar?");
				System.out.print("R$");
				saldo += leia.nextDouble();
				break;

			case 2:
				System.out.println("   Banco Silva   ");
				System.out.println("Cliente: " + nome);
				System.out.println("Saldo: R$" + saldo + "\n");

				System.out.println("Qual valor deseja retirar?");
				System.out.print("R$");
				saldo -= leia.nextDouble();
				break;

			default:
				invalido = true;
			}
		} while (opcao != 3);

		System.out.println("   Banco Silva   ");
		System.out.println("Cliente: " + nome);
		System.out.println("Saldo: R$" + saldo + "\n");
		System.out.print("Situaçao: ");

		if (saldo > 0) {
			System.out.println("CONTA PREFERENCIAL");
		} else if (saldo < 0) {
			System.out.println("CONTA ESTOURADA");
		} else {
			System.out.println("CONTA ZERADA");
		}

		leia.close();
	}

}