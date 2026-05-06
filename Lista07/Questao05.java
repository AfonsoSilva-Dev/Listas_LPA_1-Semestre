package Lista07;

import java.util.Scanner;

public class Questao05 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String palavra;
		
		System.out.println("Digite sua palavra: ");
		System.out.print("R: ");
		palavra = leia.nextLine();
		
		System.out.println("Palavra Original: ");
		System.out.println(palavra);
		System.out.println("Palavra ao contrário: ");
		for(int i = palavra.length() - 1; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
		
		leia.close();
	}
}
