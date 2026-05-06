package Lista02;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double ideal = 0, altura;
		int sexo;

		System.out.println("Digite o seu sexo:");
		System.out.println("1 - Feminino" + "\n2 - Masculino");
		System.out.print("R: ");
		sexo = leia.nextInt();
		System.out.println("Digite sua altura: ");
		System.out.print("R: ");
		altura = leia.nextDouble();

		if (sexo == 1) {
			ideal = (62.1 * altura) - 44.7;
		} else if (sexo == 2) {
			ideal = (72.7 * altura) - 58;
		} else {
			System.out.println("Opção inválida!");
		}
		System.out.println("Seu peso ideal seria: " + ideal + "Kg");

		leia.close();
	}
}