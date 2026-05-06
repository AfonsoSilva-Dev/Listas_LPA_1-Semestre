package Lista05;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int num, div, cont = 0, atual = 2;

		System.out.println("Quantos numeros primos quer ver?");
		num = leia.nextInt();

		if (num > 0) {

			while (cont < num) {
				div = 0;

				for (int aux = 1; aux <= atual; aux++) {
					if (atual % aux == 0) {
						div++;
					}
				}

				if (div == 2) {
					System.out.print(atual + " ");
					cont++;
				}

				atual++;
			}

		} else {
			System.out.println("Numero invalido!");
		}

		leia.close();
	}
}