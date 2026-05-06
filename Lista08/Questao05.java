package Lista08;

import java.util.Random;
import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Random rand = new Random();

		int[] sequencia = new int[100];
		int tamanho = 0;
		int nivel = 1;
		boolean jogoAtivo = true;

		while (jogoAtivo) {

			int limite = nivel * 3;

			// adiciona novo número
			sequencia[tamanho] = rand.nextInt(limite) + 1;
			tamanho++;

			// mostra sequência
			System.out.println("\nNÍVEL " + nivel);
			System.out.println("Sequência:");

			for (int i = 0; i < tamanho; i++) {
				System.out.print(sequencia[i] + " ");
			}

			System.out.println("\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Agora repita:");

			// usuário tenta
			for (int i = 0; i < tamanho; i++) {
				System.out.print("Número " + (i + 1) + ": ");
				int resposta = leia.nextInt();

				// validação de faixa
				if (resposta < 1 || resposta > limite) {
					System.out.println("Valor inválido! Fim de jogo.");
					jogoAtivo = false;
					break;
				}

				// verificação
				if (resposta != sequencia[i]) {
					System.out.println("Errou! Fim de jogo.");
					jogoAtivo = false;
					break;
				}
			}

			if (!jogoAtivo)
				break;

			System.out.println("Acertou!");

			// 🔹 sobe de nível a cada 10 acertos
			if (tamanho % 10 == 0) {
				nivel++;
				System.out.println("SUBIU DE NÍVEL!");
			}
		}

		System.out.println("Pontuação final: " + tamanho);
		leia.close();
	}
}