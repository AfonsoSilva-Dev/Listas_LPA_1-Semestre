package Lista05;

import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num, aux1 = 1, aux2 = 1, mostrar;

		System.out.println("Quantos numeros deseja ver na sequencia de Fibonacci?");
		num = leia.nextInt();

		if (num > 0) {

			if (num == 1) {
				System.out.println(1);
			} else {
				System.out.print(aux1 + " " + aux2 + " ");

				for (int cont = 3; cont <= num; cont++) {
					mostrar = aux1 + aux2;
					System.out.print(mostrar + " ");

					aux1 = aux2;
					aux2 = mostrar;
				}
			}

		} else {
			System.out.println("Numero invalido!");
		}

		leia.close();
	}
}