package Lista10;

import java.util.Random;

public class Questao02 {

	public static void main(String[] args) {

		int[][] matriz = new int[100][100];
		int[] contagem = new int[10];

		preencher(matriz);
		contar(matriz, contagem);
		mostrar(contagem);
	}

	// Preenche com números aleatórios
	public static void preencher(int[][] matriz) {
		Random r = new Random();

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				matriz[i][j] = r.nextInt(10); // 0 a 9
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	// Conta números repetidos
	public static void contar(int[][] matriz, int[] contagem) {

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {

				int numero = matriz[i][j];

				contagem[numero]++;
			}
		}
	}

	// Mostra resultado
	public static void mostrar(int[] contagem) {

		for (int i = 0; i < contagem.length; i++) {
			System.out.println("Número " + i + " aparece " + contagem[i] + " vezes");
		}
	}
}