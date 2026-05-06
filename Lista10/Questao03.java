package Lista10;

import java.util.Random;

public class Questao03 {

	public static void main(String[] args) {
		Random sorteio = new Random();

		int[][] matriz = new int[2][2];
		boolean valido = true; // Controla se é matriz de permutação

		// Preenche matriz com 0's e 1's
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz[i][j] = sorteio.nextInt(2);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Verifica se tem apenas um "1" nas linhas
		for (int i = 0; i < 2; i++) {
			int cont = 0;

			for (int j = 0; j < 2; j++) {
				if (matriz[i][j] == 1) {
					cont++;
				}
			}

			if (cont != 1) {
				valido = false;
			}
		}

		// Verifica se tem apenas um "1" nas colunas
		for (int j = 0; j < 2; j++) {
			int cont = 0;

			for (int i = 0; i < 2; i++) {
				if (matriz[i][j] == 1) {
					cont++;
				}
			}

			if (cont != 1) {
				valido = false;
			}
		}

		// Resultado
		if (valido) {
			System.out.println("É matriz de permutação");
		} else {
			System.out.println("NÃO é matriz de permutação");
		}
	}
}
