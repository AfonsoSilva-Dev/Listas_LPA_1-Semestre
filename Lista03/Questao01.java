package Lista03;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;

		System.out.println("Digite um numero: ");
		System.out.println("R: ");
		num = leia.nextInt();
		
		//Verifica se o número é par ou ímpar e se é negativo ou par
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("O numero digitado é um numero positivo e par!");
			} else {
				System.out.println("O numero digitado é um numero positivo e impar!");
			}
		} else {
			if(num < 0) {
				if(num % 2 == 0) {
					System.out.println("O numero digitado é um numero negativo e par!");
				} else {
					System.out.println("O numero digitado é um numero negativo e impar!");
				}
			}
		}
		
		leia.close();
	}

}
