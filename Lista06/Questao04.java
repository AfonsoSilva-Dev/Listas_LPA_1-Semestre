package Lista06;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		char opcao1, opcao2;
		int numero;

		do {
			System.out.print("Deseja ver a tabuada? (s/n): ");
			opcao1 = leia.next().charAt(0);

			if (opcao1 == 's') {

				System.out.print("Digite um número entre 1 e 10: ");
				numero = leia.nextInt();

				if (numero > 0 && numero < 11) {
					Tabuada(numero);
				} else {
					System.out.println("Número inválido!");
				}
			}
			System.out.println("Deseja ver outro número?(s/n)");
			opcao2 = leia.next().charAt(0);
		} while (opcao2 == 's');

		leia.close();
	}

	public static void Tabuada(int num) {
		System.out.println("\nTabuada do " + num);

		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}
}