package Lista01;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double celsius, fahrenheit;

		System.out.print("Digite a temperatura atual em Centigrados: ");
		celsius = leia.nextDouble();

		// Fórmula de conversão
		fahrenheit = ((celsius * 9) + 160) / 5;

		System.out.println("O valor convertido fica " + fahrenheit + " fahrenheits.");
		leia.close();

	}

}
