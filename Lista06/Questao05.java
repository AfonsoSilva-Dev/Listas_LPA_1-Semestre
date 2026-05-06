package Lista06;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, opcao;
		double resultado=0;
		
		System.out.print("Digite o valor de n: ");
		numero = leia.nextInt();

		System.out.println("\nEscolha a opção:");
		System.out.println("1 - S = 1 + 1/2 + 1/3 + ... + 1/n");
		System.out.println("2 - S = 1/n + 2/(n-1) + ... + n/1");
		System.out.println("3 - S = 1 - 1/2 + 1/3 - 1/4 + ... + 1/n");

		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			resultado = serieA(numero);
			break;

		case 2:
			resultado = serieB(numero);
			break;

		case 3:
			resultado = serieC(numero);
			break;

		default:
			System.out.println("Opção inválida!");
		}

		System.out.println("Resultado: " + resultado);

		leia.close();
	}

	public static double serieA(int n) {
		double s = 0;

		for (int i = 1; i <= n; i++) {
			s += 1.0 / i;
		}

		return s;
	}

	public static double serieB(int n) {
		double s = 0;

		for (int i = 1; i <= n; i++) {
			s += (double) i / (n - i + 1);
		}

		return s;
	}

	public static double serieC(int n) {
		double s = 0;

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				s -= 1.0 / i;
			} else {
				s += 1.0 / i;
			}
		}

		return s;
	}
}