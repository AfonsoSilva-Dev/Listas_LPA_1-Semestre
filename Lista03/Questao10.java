package Lista03;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c, Xmais, Xmenos, delta, raizdelta = 0;

	

		System.out.println("Informe os valores de A, B e C: ");
		System.out.print("A: ");
		a = leia.nextInt();
		System.out.print("B: ");
		b = leia.nextInt();
		System.out.print("C: ");
		c = leia.nextInt();

		System.out.println("Δ = b² - 4ac");
		delta = ((b * b) - (4 * a * c));
		System.out.println("Δ = " + b + "² - 4 * " + a + " * " + c + " = " + delta);
		System.out.println("X = (-b ± √Δ) / 2a");

		if (delta > 0) {
			for (int cont = 1; (cont * cont) >= delta; cont++) {
				if (delta == 1) {
					raizdelta = 1;
					cont += delta;
					break;
				}
				if (cont * cont == delta) {
					raizdelta = cont;
					cont += delta;
					break;
				} else if(cont * cont > delta) {
					System.out.println("A raiz de " + delta + " não é um numero inteiro (é irracional)");
					break;
				}
			}

			if (raizdelta > 0) {

				Xmais = (((b * (-1)) + raizdelta) / (2 * a));
				Xmenos = (((b * (-1)) - raizdelta) / (2 * a));
				System.out.println("X = (-(" + b + ") ± √" + raizdelta + ") 2 * " + a);
				System.out.println("X = (-(" + b + ") + √" + raizdelta + ") 2 * " + a + " = " + Xmais);
				System.out.println("X = (-(" + b + ") - √" + raizdelta + ") 2 * " + a + " = " + Xmenos);
				System.out.println("=========================");
				System.out.println("X₁ = " + Xmais + " / X₂ = " + Xmenos);
				System.out.println("=========================");
			}

		} else if (delta == 0) {
			raizdelta = 0;
			Xmais = (((b * (-1)) + raizdelta) / (2 * a));
			Xmenos = (((b * (-1)) - raizdelta) / (2 * a));
			System.out.println("X = (-(" + b + ") ± √" + raizdelta + ") 2 * " + a);
			System.out.println("X = (-(" + b + ") + √" + raizdelta + ") 2 * " + a + " = " + Xmais);
			System.out.println("X = (-(" + b + ") - √" + raizdelta + ") 2 * " + a + " = " + Xmenos);
			System.out.println("=========================");
			System.out.println("X₁ = " + Xmais + " / X₂ = " + Xmenos);
			System.out.println("=========================");

		} else {
			System.out.println("A raiz de Δ (delta) não é uma raiz real.");
		}
		
		leia.close();
	}
}