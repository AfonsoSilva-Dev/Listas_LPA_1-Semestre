package Lista03;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double saldoMedio;

		System.out.println("Verificaçao de credito especial: ");
		System.out.print("Saldo médio: ");
		saldoMedio = leia.nextDouble();

		System.out.println("Saldo médio: " + saldoMedio);
		System.out.print("Percentual: ");

		if (saldoMedio <= 200) {
			System.out.println("Nenhum Credito!");

		} else if (saldoMedio > 200 && saldoMedio <= 400) {
			System.out.println("20% do valor do saldo medio!");
			System.out.println("Valor Credito: " + (saldoMedio + saldoMedio * 0.2));

		} else if (saldoMedio > 400 && saldoMedio <= 600) {
			System.out.println("30% do valor do saldo medio!");
			System.out.println("Valor Credito: " + (saldoMedio + saldoMedio * 0.3));

		} else {
			System.out.println("40% do valor do saldo medio!");
			System.out.println("Valor Credito: " + (saldoMedio + saldoMedio * 0.4));
		}

		leia.close();
	}
}