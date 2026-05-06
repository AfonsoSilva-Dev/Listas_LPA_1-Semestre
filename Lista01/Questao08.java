package Lista01;

import java.util.Scanner;

public class Questao08 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorSolicitado, nota50 = 0, nota10 = 0, nota5 = 0, nota1 = 0;

		System.out.print("Digite o valor que desenja retirar: ");
		valorSolicitado = leia.nextInt();

		while (valorSolicitado >= 50) {
			valorSolicitado -= 50;
			nota50++;
		}
		while (valorSolicitado >= 10) {
			valorSolicitado -= 10;
			nota10++;
		}
		while (valorSolicitado >= 5) {
			valorSolicitado -= 5;
			nota5++;
		}
		while (valorSolicitado >= 1) {
			valorSolicitado -= 1;
			nota1++;
		}

		System.out.println("Nota de R$50: " + nota50);
		System.out.println("Nota de R$10: " + nota10);
		System.out.println("Nota de R$5: " + nota5);
		System.out.println("Moeda de R$1: " + nota1);
		System.out.println("Ficando um total de " + (nota50 + nota10 + nota5 + nota1) + " notas.");

		leia.close();

	}

}
