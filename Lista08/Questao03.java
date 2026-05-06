package Lista08;

import java.util.Scanner;

public class Questao03 {
	
	public static void main(String[] atgs) {
		Scanner leia = new Scanner(System.in);
		int[] numeros = new int[50];

		// Entrada
		for (int i = 0; i < 50; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = leia.nextInt();
		}

		// Ordenação 
		for (int i = 0; i < 49; i++) {
			for (int j = 0; j < 49 - i; j++) {
				if (numeros[j] > numeros[j + 1]) {
					int temp = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = temp;
				}
			}
		}

		// Saída
		System.out.println("\nNúmeros em ordem crescente:");
		for (int i = 0; i < 50; i++) {
			System.out.print(numeros[i] + " ");
		}

		leia.close();
	}
}