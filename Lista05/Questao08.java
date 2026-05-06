package Lista05;

import java.util.Scanner;

public class Questao08 {
	public static void main(String[] args) {

	Scanner leia = new Scanner(System.in);
	int resultado, numero;
	
	System.out.println("Digite um número:");
	numero = leia.nextInt();

	for (int i = 1; i <= 10; i++) {
	    resultado = numero * i;
	    System.out.println(numero + " * " + i + " = " + resultado);
	}
		leia.close();
	}
}
