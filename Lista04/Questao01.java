package Lista04;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;

		System.out.println("Digite um número: ");
		n = leia.nextInt();

		System.out.print("A) S = 1/1 + ");
		for (int cont = 2; cont <= n; cont++) {
			System.out.print("1/" + cont + " + ");
		}
		System.out.println("FIM");
		System.out.print("B) S = ");
		for (int cont = 1; cont <= n; cont++) {
			System.out.print(cont + "/" + ((n + 1) - cont) + " + ");
		}
		System.out.println("FIM");
		System.out.print("C) S = 1/1 - ");
		for (int cont = 2; cont <= n; cont++) {
			System.out.print("1/" + cont);
			if ((cont % 2) == 0) {
				System.out.print(" + ");
			} else {
				System.out.print(" - ");
			}
		}
		leia.close();
	}
}
