package Lista12;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		System.out.println("Digite  o número que deseja ver o fatorial:");
		num=leia.nextInt();
		System.out.println(calcularFatorial(num));

		leia.close();
	}

	public static int calcularFatorial(int num) {
		if (num <= 1) {
			return 1;
		}
		return num * calcularFatorial(num - 1);
	}
}