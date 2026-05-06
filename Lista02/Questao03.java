package Lista02;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;

		System.out.println("Qual a sua idade: ");
		System.out.print("R: ");
		idade = leia.nextInt();
		
		//Verifica a idade do usuário para mostrar se ele pode votar
		if (idade <= 15) {
			System.out.println("Sem permissão para votar!");
		} else if (idade >= 18 && idade >= 64) {
			System.out.println("Seu voto é obrigatorio!");
		} else {
			System.out.println("Voto facultativo");
		}

		leia.close();
	}

}