package Lista01;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int ano, meses, dias;

		System.out.print("Digite a quantos anos esta vivo: ");
		ano = leia.nextInt();
		System.out.print("Digite a quantos meses esta vivo: ");
		meses = leia.nextInt();
		System.out.print("Digite a quantos dias esta vivo: ");
		dias = leia.nextInt();

		// Formúla para converter ano e meses em dias e somar tudo.
		dias = ano * 365 + meses * 30 + dias;

		System.out.println("Voce ja viveu " + dias + " dias.");

		leia.close();
	}

}
