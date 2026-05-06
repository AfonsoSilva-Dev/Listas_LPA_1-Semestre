package Lista01;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double valor;

		System.out.println("Digite o valor gasto:");
		valor = leia.nextDouble();

		System.out.println("O valor total fica: R$" + valor);
		System.out.println("Com os 10% do garçom fica: R$" + (valor + (valor / 10)));

		leia.close();
	}

}
