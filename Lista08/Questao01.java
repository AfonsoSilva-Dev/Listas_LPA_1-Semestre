package Lista08;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String[] nome = new String[20];
		int[] idade = new int[20];
		int somaIdade = 0;
		double mediaIdade;

		for (int i = 0; i < 20; i++) {
			System.out.println("Digite seu nome:");
			nome[i] = leia.nextLine();

			System.out.println("Digite sua idade:");
			idade[i] = leia.nextInt();
			leia.nextLine();
			
			somaIdade += idade[i];
		}

		mediaIdade = somaIdade / 20.0;
		
		System.out.println("A média das idades é: " + mediaIdade);
		System.out.println("As pessoas com idade acima da média são:");
		
		for (int i = 0; i < 20; i++) {
			if (idade[i] > mediaIdade) {
				System.out.println("Nome:" + nome[i] + "\nIdade:" + idade[i]);
			}
		}
		leia.close();
	}
}
