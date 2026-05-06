package Lista02;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario, prestacao;

		System.out.println("Qual valor do seu emprestimo desejado? ");
		System.out.print("R: ");
		prestacao = leia.nextFloat();
		System.out.println("Qual valor do seu salario? ");
		System.out.print("R: ");
		salario = leia.nextFloat();
		
		//Verifica se o emprestimo passa de 30% do salário
		if (salario * 0.3 < prestacao) {
			System.out.println("O emprestimo nao pode ser concedido pois o valor ultrapassa 30% do seu salario.");
			System.out.println("Valor máximo: R$" + salario * 0.3);
			System.out.println("Emprestimo pedido: R$" + prestacao);
		} else {
			System.out.println("Emprestimo concedido!");
			System.out.println("Valor máximo: R$" + salario * 0.3);
			System.out.println("Emprestimo pedido: R$" + prestacao);
		}

		leia.close();

	}
}