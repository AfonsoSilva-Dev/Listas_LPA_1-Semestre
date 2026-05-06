package Lista12;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int base, expoente;
		System.out.println("Digite a base: ");
		base = leia.nextInt();
		System.out.println("Digite o expoente: ");
		expoente = leia.nextInt();

		System.out.println("Resultado : " + calcularPotencia(base, expoente));

		leia.close();
	}

	public static int calcularPotencia(int base, int expoente) {
		if (expoente < 1) {
			return 1;
		}
		return base * calcularPotencia(base, expoente - 1);
	}
}
