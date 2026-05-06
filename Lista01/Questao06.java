package Lista01;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1, nota2, nota3, peso1, peso2, peso3, media;

		System.out.println("Digite sua 3 notas: ");
		System.out.println("Nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Nota 3: ");
		nota3 = leia.nextDouble();
		System.out.println("Digite os 3 pesos: ");
		System.out.println("Peso 1: ");
		peso1 = leia.nextDouble();
		System.out.println("Peso 2: ");
		peso2 = leia.nextDouble();
		System.out.println("Peso 3: ");
		peso3 = leia.nextDouble();

		// Cálculo da média
		media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

		System.out.println("Sua média é " + media);

		leia.close();

	}

}
