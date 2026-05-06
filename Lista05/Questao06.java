package Lista05;

import java.util.Scanner;

public class Questao06 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int A, B, inicio, fim;
		long val;

		System.out.println("Digite o primeiro numero: ");
		A = leia.nextInt();

		System.out.println("Digite o segundo numero: ");
		B = leia.nextInt();

		if (A < B) {
			inicio = A;
			fim = B;
		} else {
			inicio = B;
			fim = A;
		}

		System.out.println("\nOs fatoriais de " + inicio + " a " + fim + " são:\n");

		for (int cont = inicio; cont <= fim; cont++) {

			val = 1;

			for (int i = cont; i > 0; i--) {
				val *= i;
			}

			System.out.print(cont + "! = " + val);

			if (cont < fim) {
				System.out.print("  ");
			}
		}

		leia.close();
	}
}
