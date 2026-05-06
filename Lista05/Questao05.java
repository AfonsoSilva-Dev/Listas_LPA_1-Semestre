package Lista05;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, aux = 1;

		System.out.println("Digite um numero:");
		System.out.print("R: ");
		num = sc.nextInt();

	if (num > 0) {
			System.out.println("O fatorial de " + num + " é:");
			for (int cont = num; cont > 0; cont--) {
				System.out.print(cont + "!");
				aux *= cont;
				if (cont - 1 > 0) {
					System.out.print(" -> ");
				}
			}
			System.out.println(" = " + aux);
		}

		sc.close();
	}
}