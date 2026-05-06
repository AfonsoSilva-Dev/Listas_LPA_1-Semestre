package Lista08;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] pa = new int[20];
		int primeiro, razao;

		System.out.print("Digite o primeiro termo: ");
		primeiro = leia.nextInt();

		System.out.print("Digite a razão: ");
		razao = leia.nextInt();

		// Preenchimento
		for (int i = 0; i < 20; i++) {
			pa[i] = primeiro + i * razao;
		}

		// Saída
		System.out.println("PA:");
		for (int i = 0; i < 20; i++) {
			System.out.print(pa[i] + " ");
		}

		leia.close();
	}

}