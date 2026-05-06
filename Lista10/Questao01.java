package Lista10;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matrizA[][] = new int[20][20];
		int matrizB[][] = new int[20][20];

		System.out.println(" Multiplicação de matriz");

		// Preencher matriz A
		System.out.println("\nMatriz A:");
		for (int linhas = 0; linhas < 20; linhas++) {
			for (int colunas = 0; colunas < 20; colunas++) {
				System.out.println("Digite o número para matriz A:");
				matrizA[linhas][colunas] = leia.nextInt();
			}
		}

		// Preencher matriz B
		System.out.println("\nMatriz B:");
		for (int linhas = 0; linhas < 20; linhas++) {
			for (int colunas = 0; colunas < 20; colunas++) {
				System.out.println("Digite o número para matriz A:");
				matrizB[linhas][colunas] = leia.nextInt();
			}
		}

		// Modularização para multiplicação da matria A e B que resulta na matriz C
		multiplicacao(matrizA, matrizB);

		leia.close();
	}

	public static void multiplicacao(int matrizA[][], int matrizB[][]) {
		int matrizC[][] = new int[20][20];

		for (int i = 0; i < 20; i++) { // linhas
			for (int j = 0; j < 20; j++) { // colunas
				matrizC[i][j] = 0;

				for (int k = 0; k < 20; k++) { // multiplicação
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j];

				}
				System.out.print(matrizC[i][j]+ "  ");
			}
			System.out.println();
		}
	}
}