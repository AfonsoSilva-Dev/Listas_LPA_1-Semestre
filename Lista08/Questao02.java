package Lista08;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String[] candidatos = new String[5];
		int[] votos = new int[5];

		int votosBrancos = 0;
		int votosNulos = 0;
		int opcao;

		// Cadastro
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do candidato " + (i + 1) + ":");
			candidatos[i] = leia.nextLine();
		}

		// Votação
		do {
			System.out.println("\n--- URNA ELETRÔNICA ---");
			System.out.println("(0) BRANCO");

			for (int i = 0; i < 5; i++) {
				System.out.println("(" + (i + 1) + ") " + candidatos[i]);
			}

			System.out.println("(-1) Encerrar votação");
			System.out.print("Digite seu voto: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				votosBrancos++;
			} else if (opcao >= 1 && opcao <= 5) {
				votos[opcao - 1]++;
			} else if (opcao != -1) {
				votosNulos++;
			}

		} while (opcao != -1);

		// Resultado
		System.out.println("\n--- RESULTADO FINAL ---");

		int maior = 0;
		int vencedor = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println(candidatos[i] + ": " + votos[i] + " votos");

			if (votos[i] > maior) {
				maior = votos[i];
				vencedor = i;
			}
		}

		System.out.println("Brancos: " + votosBrancos);
		System.out.println("Nulos: " + votosNulos);

		System.out.println("\nVencedor: " + candidatos[vencedor]);

		leia.close();
	}
}