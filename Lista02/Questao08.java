package Lista02;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, operacao;

		System.out.println("Digite 2 valores inteiros: ");
		System.out.print("Valor 1: ");
		valor1 = sc.nextInt();
		System.out.print("Valor 2: ");
		valor2 = sc.nextInt();

		System.out.println(" Qual operaçao deseja fazer?");
		System.out.println("1 - Adição" + "\n2 - Subtraçao" + "\n3 - Divisao" + "\n4 - Multiplicacao");
		System.out.println("R: ");
		operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("A soma de " + valor1 + " + " + valor2 + " = " + (valor1 + valor2));
			break;

		case 2:
			System.out.println("A subtraçao de " + valor1 + " - " + valor2 + " = " + (valor1 - valor2));
			break;

		case 3:
			if (valor1 == 0) {
				System.out.println("Operação invalida!");
			} else if (valor2 == 0) {
				System.out.println("Operação invalida!");
			} else {
				System.out.println("A divisao de " + valor1 + " / " + valor2 + " = " + (valor1 / valor2));
			}
			break;

		case 4:
			System.out.println("A multiplicacao de " + valor1 + " * " + valor2 + " = " + (valor1 * valor2));
			break;

		default:
			System.out.println("Opção inválida!");
		}

		sc.close();
	}

}
