package Lista01;

import java.util.Scanner;


public class Questao07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int termo1, termo2, termo, razao, contador = 1;

		System.out.println("Digite os 2 primerios termos da progressão aritimetica: ");
		System.out.print("Termo 1: ");
		termo1 = leia.nextInt();
		System.out.print("Termo 2: ");
		termo2 = leia.nextInt();
		System.out.println("");
		System.out.println("Qual termo deseja descobrir? ");
		System.out.print("Termo: ");
		termo = leia.nextInt();

		// Descobre a razão dos dois termos
		razao = termo2 - termo1;

		// Soma o termo 1 com a razão até chegar no termo que o usuário digitou
		while (contador < termo) {
			termo1 = termo1 + razao;
			contador++;
		}
		System.out.println(termo1);

		leia.close();

	}

}
