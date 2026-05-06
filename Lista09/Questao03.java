package Lista09;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] quantidade = new int[100];
		double[] valor = new double[100];

		int n;
		double total = 0;

		System.out.print("Quantos produtos? ");
		n = leia.nextInt();

		// Entrada de dados
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade do produto " + (i + 1) + ": ");
			quantidade[i] = leia.nextInt();

			System.out.print("Valor do produto " + (i + 1) + ": ");
			valor[i] = leia.nextDouble();
		}

		// Impressão da nota
		System.out.println("\n--- NOTA DE COMPRA ---");

		for (int i = 0; i < n; i++) {
			double subtotal = quantidade[i] * valor[i];
			System.out.println(quantidade[i] + " x " + valor[i] + " = " + subtotal);
			total += subtotal;
		}

		System.out.println("Total = " + total);

		leia.close();
	}
}