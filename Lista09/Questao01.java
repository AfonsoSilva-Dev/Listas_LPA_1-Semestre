package Lista09;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] par = new int[10];
		int[] impar = new int[10];
		int[] valores = new int[20];

		int contPar = 0, contImpar = 0;

		System.out.println("Digite os numeros:");

		for (int i = 0; i < 20; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			valores[i] = leia.nextInt();

			if (valores[i] % 2 == 0) {
				par[contPar++] = valores[i];
			} else {
				impar[contImpar++] = valores[i];
			}
		}

		System.out.println("\nPares:");
		for (int i = 0; i < contPar; i++) {
			System.out.println(par[i]);
		}

		System.out.println("\nÍmpares:");
		for (int i = 0; i < contImpar; i++) {
			System.out.println(impar[i]);
		}

		leia.close();
	}
}