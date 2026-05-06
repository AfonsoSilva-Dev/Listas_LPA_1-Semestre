package Lista05;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;

		System.out.println("Digite o numero para verificaçao: ");
		System.out.print("R: ");
		numero = leia.nextInt();

		if (numero % 2 != 0) {
			System.out.println("É um número primo");
		} else if (numero == 2 || numero % 2 == 0) {
			System.out.println("Não é um número primoo");
		}
		leia.close();
	}
}