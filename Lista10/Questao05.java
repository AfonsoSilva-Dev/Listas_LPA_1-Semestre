package Lista10;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int temp, maiorValor, posicaoMaior, coluna, linha;
		int[][] matriz = new int[10][10];

		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna < 10; coluna++) {
				matriz[linha][coluna] = leia.nextInt();
			}
		}

		// 🔹 PROCESSAMENTO (troca maior com diagonal)
		for (linha = 0; linha < 10; linha++) {

			maiorValor = matriz[linha][0];
			posicaoMaior = 0;

			// procurar maior da linha
			for (coluna = 1; coluna < 10; coluna++) {

				if (matriz[linha][coluna] > maiorValor) {
					maiorValor = matriz[linha][coluna];
					posicaoMaior = coluna;
				}
			}

			// troca com diagonal
			temp = matriz[linha][linha];
			matriz[linha][linha] = maiorValor;
			matriz[linha][posicaoMaior] = temp;
		}

		// 🔹 IMPRIMIR MATRIZ FINAL
		for (linha = 0; linha < 10; linha++) {
			for (coluna = 0; coluna < 10; coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}

		leia.close();
	}
}