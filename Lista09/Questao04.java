package Lista09;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int[] pa = new int[20];
		int primeiro, segundo, razao;

		
		System.out.println("   Progressão Aritmética   ");
		System.out.print("Digite o primeiro termo: ");
		primeiro = leia.nextInt();

		System.out.print("Digite o segundo termo: ");
		segundo = leia.nextInt();

		// calcular a razão
		razao = segundo - primeiro;

		// preencher vetor
		for (int i = 0; i < 20; i++) {
			pa[i] = primeiro + i * razao;
		}

		// mostrar resultado
		System.out.println("\nPA:");
		for (int i = 0; i < 20; i++) {
			System.out.print(pa[i] + " ");
		}

		leia.close();
	}
}