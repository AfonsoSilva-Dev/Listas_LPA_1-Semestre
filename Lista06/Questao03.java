package Lista06;

import java.util.Scanner;

public class Questao03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, resultado;

		System.out.print("Digite a posição da sequência de Fibonacci: ");
		numero = leia.nextInt();

		resultado = fibonacci(numero);

		System.out.println("Termo " + numero + " = " + resultado);

		leia.close();
	}

	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}

		int a = 1, b = 1, c = 0;

		for (int i = 3; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return b;
	}
}