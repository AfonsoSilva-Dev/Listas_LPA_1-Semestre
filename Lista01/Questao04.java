package Lista01;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salariominimo, salariotual, quantidade;

		System.out.print("Digite o valor do salario minimo: R$");
		salariominimo = leia.nextDouble();
		System.out.print("Digite o valor do seu salario: R$");
		salariotual = leia.nextDouble();

		quantidade = salariotual / salariominimo;

		System.out.println("Voce recebe " + quantidade + " salarios minimos.");

		leia.close();
	}

}