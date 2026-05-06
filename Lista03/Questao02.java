package Lista03;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double lado1, lado2, lado3;

		System.out.println("Digite os 3 lados de cada triangulo: ");
		System.out.print("Lado 1: ");
		lado1 = leia.nextDouble();
		System.out.print("Lado 2: ");
		lado2 = leia.nextDouble();
		System.out.print("Lado 3: ");
		lado3 = leia.nextDouble();
		System.out.println("Esse é um triangulo: ");

		if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Equilatero");

			} else if ((lado1 == lado2 && lado2 != lado3) || (lado1 == lado3 && lado1 != lado2)
					|| (lado2 == lado3 && lado2 != lado1)) {
				System.out.println("Isoceles");

			} else if (lado1 != lado2 && lado3 != lado1 && lado2 != lado3) {
				System.out.println("Escaleno");

			}
		}
		leia.close();
	}
}
