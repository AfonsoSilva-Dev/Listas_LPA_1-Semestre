package Lista03;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int numero, parte1, parte2, soma, resultado;

		System.out.print("Digite um número de 4 dígitos: ");
		numero = leia.nextInt();

		// Verifica se tem 4 dígitos
		if (numero >= 1000 && numero <= 9999) {

			// Separar o número
			parte1 = numero / 100; // primeiros 2 dígitos
			parte2 = numero % 100; // últimos 2 dígitos

			soma = parte1 + parte2;
			resultado = soma * soma;

			if (resultado == numero) {
				System.out.println("O número tem a característica do 3025!");
			} else {
				System.out.println("O número NÃO tem essa característica.");
			}

		} else {
			System.out.println("Digite um número válido de 4 dígitos.");
		}
		leia.close();
	}
}