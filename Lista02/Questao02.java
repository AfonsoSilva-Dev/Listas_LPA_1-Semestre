package Lista02;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b;

		System.out.println("Digite o valor de A e depois o de B: ");
		System.out.print("A = ");
		a = leia.nextDouble();
		System.out.print("B = ");
		b = leia.nextDouble();

		if (a != 0) {
			if (b != 0) {
				if (a % b == 0) {
					System.out.println("São divisiveis!");
				} else {
					System.out.println("Não sao divisiveis!");
				}
			} else {
				System.out.println("Qualquer valor diferente de zero dividido por zero não tem um resultado definido, portanto 0/0 é indefinido");
			}
		} else if (a == 0 && b == 0) {
			System.out.println("O valor 0 divido por 0 é indeterminado");
		} else {
			System.out.println("0 dividido por qualquer numero, o resultado sempre será 0");
		}

		leia.close();
	}

}
