package Lista07;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String palavra;

		System.out.println("Digite sua palavra: ");
		System.out.print("R: ");
		palavra = leia.nextLine();

		System.out.print("\nPalavra na Vertical em Escada: ");

		for (int i = 0; i <= palavra.length(); i++) {
			System.out.println(palavra.substring(0, i));
		}

		leia.close();
	}
}