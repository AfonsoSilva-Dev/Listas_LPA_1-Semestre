package Lista05;

import java.util.Scanner;

public class Questao09 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double resultado, numero;
		
		System.out.println("Digite um numero:");
		numero = leia.nextInt();

		for(int i=1; numero>i ; i++ ) {
			resultado=numero/i;
			System.out.println(numero+ "/" + i + "=" + resultado);
			}


		leia.close();
	}
}