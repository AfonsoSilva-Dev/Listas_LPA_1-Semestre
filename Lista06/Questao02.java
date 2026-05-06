package Lista06;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidadePrimos, somaPrimos = 0, numeroAtual = 2, quantidadeEncontrada = 0;

		// usuário diz quantos primos quer somar
		System.out.print("Quantos números primos deseja somar? ");
		quantidadePrimos = leia.nextInt();

		// continua até encontrar a quantidade desejada de primos
		while (quantidadeEncontrada < quantidadePrimos) {

			// chama a função que verifica se o número é primo
			if (verificarPrimo(numeroAtual)) {

				// soma e conta mais um primo encontrado
				somaPrimos += numeroAtual;
				quantidadeEncontrada++;
			}

			numeroAtual++;
		}

		System.out.println("Soma dos " + quantidadePrimos + " primeiros primos: " + somaPrimos);

		leia.close();
	}

	public static boolean verificarPrimo(int numero) {

		if (numero < 2) {
			return false;
		}

		for (int divisor = 2; divisor < numero; divisor++) {
			if (numero % divisor == 0) {
				return false;
			}
		}

		return true;
	}
}