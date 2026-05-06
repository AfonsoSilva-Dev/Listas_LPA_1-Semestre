package Lista07;

import java.util.Scanner;

public class Questao04 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String valor;
		
		System.out.println("Digite os 0's e 1's: ");
		System.out.print("R: ");
		valor = leia.nextLine();
		
		System.out.println("Número digitado original: " + valor);
		System.out.println("Número com 1's substituindo os 0's : " + valor.replace('0',  '1'));
		
		leia.close();
	}
}
