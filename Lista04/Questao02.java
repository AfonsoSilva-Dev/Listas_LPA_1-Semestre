package Lista04;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num, numatual = 0, aux1, aux2, aux, pos = 0;

		System.out.print("Digite um numero: ");
		num = leia.nextInt();
		
		
		System.out.println("Procurando o numero " + num );
		System.out.print("1 -> ");

		aux1 = 1;
		aux2 = 2;
		for(int cont = 1; numatual < num; cont++) {
			aux = aux2;
			aux2+=aux1;
			aux1 = aux; 
			System.out.print(aux2 + " -> ");
			if(aux2 > num) {
				pos = 1;
				numatual = num;
			}
			if(aux2 == num) {
				numatual = num;
				pos = cont+1;
			}
		}
		System.out.println("FIM");
		
		if(aux2 == num) {
			System.out.println("O seu numero se encontra na "+ pos + "ª posiçao.");
		} else {
			System.out.println("Seu numero nao se encontra na sequencia de Fibonacci");
		}
		
		leia.close();
		
	}
}