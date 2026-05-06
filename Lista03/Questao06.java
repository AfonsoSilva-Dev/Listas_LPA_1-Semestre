package Lista03;

import java.util.Scanner;

public class Questao06 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double peso, altura;

		System.out.println("Informe seu peso e altura, respectivamente, em quilos e metros): ");
		System.out.print("Peso: ");
		peso = leia.nextDouble();
		System.out.print("Altura: ");
		altura = leia.nextDouble();

		System.out.println("De acordo com as informaçoes fornecidas");
		System.out.println("Voce se enquadra:");
		System.out.print("Tipo:");

		if (peso <= 60) {
			if (altura < 1.3) {
				System.out.println("A");
			} else if (altura >= 1.3 && altura <= 1.7) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		} else if (peso > 60 && peso <= 85) {
			if (altura < 1.3) {
				System.out.println("D");
			} else if (altura >= 1.3 && altura <= 1.7) {
				System.out.println("E");
			} else {
				System.out.println("F");
			}
		} else {
			if (altura < 1.3) {
				System.out.println("G");
			} else if (altura >= 1.3 && altura <= 1.7) {
				System.out.println("H");
			} else {
				System.out.println("I");
			}
		}
		leia.close();
	}

}