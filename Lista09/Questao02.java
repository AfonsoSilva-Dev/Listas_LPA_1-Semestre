package Lista09;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] valores = new int[50];
		int maior = valores[0];
		for (int i = 0; i < 50; i++) {
			System.out.println("Digite o número:");

			valores[i] = leia.nextInt();
			if (maior < valores[i]) {
				maior = valores[i];

			}
		}
		System.out.println("Maior número:" + maior);
		leia.close();
	}
}
