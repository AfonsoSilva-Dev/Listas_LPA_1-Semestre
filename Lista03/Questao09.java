package Lista03;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int seletor;
		double valor;

		System.out.println("Qual tipo de bilhete deseja? ");
		System.out.println("1 - Unitário    (R$1,30)");
		System.out.println("2 - Duplo       (R$2,60)");
		System.out.println("3 - 10 viagens  (R$12,00)");
		System.out.print("R: ");
		seletor = leia.nextInt();

		System.out.println("Qual valor foi pago pelo passageiro:");
		System.out.print("R: ");
		valor = leia.nextDouble();

		System.out.print("O tipo de bilhete é ");

		switch (seletor) {

		case 1:
			System.out.println("Unitário: ");
			System.out.println("O valor do troco é : " + (valor - 1.3));
			break;

		case 2:
			System.out.println("Duplo");
			System.out.println("O valor do troco é : " + (valor - 2.6));
			break;

		case 3:
			System.out.println("de 10 viagens");
			System.out.println("O valor do troco é : " + (valor - 12));
			break;
		default:
			System.out.println("Opção inválida!");
		}

		leia.close();
	}
}