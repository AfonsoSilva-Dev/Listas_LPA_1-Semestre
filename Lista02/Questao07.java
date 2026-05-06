package Lista02;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double lados, lado1, lado2, lado3;

		System.out.println("Digite quantos lados seu poligono tem:");
		System.out.print("R: ");
		lados = leia.nextInt();

		if (lados == 3) {
			System.out.println("Digite a medida em cm de cada lado: ");
			System.out.print("Lado 1: ");
			lado1 = leia.nextDouble();
			System.out.print("Lado 2: ");
			lado2 = leia.nextDouble();
			System.out.print("Lado 3: ");
			lado3 = leia.nextDouble();

			System.out.println("É um triangulo e seu perimetro é " + (lado1 + lado2 + lado3));
			
		} else if (lados == 4) {
			System.out.println("Digite a medida em cm dos lados: ");
			System.out.print("Lado 1: ");
			lado1 = leia.nextDouble();

			System.out.println("É um quadrado e sua área é " + lado1 * lado1);
		} else if (lados == 5) {
			System.out.println("É um pentagono.");
		}

		leia.close();
	}
}
