package Lista12;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n;
		System.out.println("Digite até que número você quer que some: ");
		n = leia.nextInt();

		System.out.println("Resultado : " + somarNumeros(n));

		leia.close();
	}

	public static int somarNumeros(int n) {
		if (n == 0) {
			return 0;
		}
		return n + somarNumeros(n - 1);
	}

}
