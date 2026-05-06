package Lista07;

import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String valor;
		int quant=0;
		
		System.out.println("Digite o número: ");
		System.out.print("R: ");
		valor = leia.nextLine();

		for (int i = 0; i < valor.length(); i++) {
			if (valor.charAt(i) == '1') {
				quant++;
			}
		}
		System.out.println("Aparecem " +quant+ " números 1's" );
		leia.close();
	}
}
