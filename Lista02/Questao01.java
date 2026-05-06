package Lista02;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int ano, anoAtual;

		System.out.println("Digite o ano do seu nascimento: ");
		System.out.print("R: ");
		ano = leia.nextInt();
		System.out.println("Digite o ano atual: ");
		System.out.print("R: ");
		anoAtual = leia.nextInt();

		//Verifica se o usuário é maior de idade
		if (anoAtual - ano >= 18) {
			System.out.println("Voce ja tem mais de 18 anos. Já pode votar.");
		} else {
			System.out.println("Voce tem menos que 18 anos. Não pode votar ainda.");
		}

		leia.close();
	}
}
