package Lista07;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		System.out.println("Digite um nome: ");
		nome = leia.next();

		if (nome.toUpperCase().charAt(0) == 'A') {
			System.out.println(nome);
		}
		leia.close();
	}
}