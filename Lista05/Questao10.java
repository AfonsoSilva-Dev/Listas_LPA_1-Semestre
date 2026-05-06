package Lista05;

import java.util.Scanner;

public class Questao10 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, opcao;
		
		do {
			System.out.println("Digite 2 números: ");
			System.out.print("Numero 1: ");
			numero1 = leia.nextInt();
			System.out.print("Numero 2: ");
			numero2 = leia.nextInt();

			System.out.println("Seus numero sao: " + numero1 + " e " + numero2 + "\n");

			System.out.print("1 - Soma\n" + "2 - Subtraçao\n" + "3 - Multiplicaçao\n" + "4 - Divisao\n"
					+ "5 - Trocar de Valores\n" + "6 - Sair\n" + "R: ");
			opcao = leia.nextInt();
			
		} while (opcao != 5);

		switch (opcao) {
		case 1:
			System.out.println("A soma dá:" + (numero1 + numero2));
			break;
		case 2:
			System.out.println("A subtração dá:" + (numero1 - numero2));
			break;
		case 3:
			System.out.println("A multiplicação dá:" + (numero1 * numero2));
			break;
		case 4:
			System.out.println("A divisãi dá:" + (numero1 / numero2));
			break;
		case 6:
			System.out.println(" Saindo ...");
			break;
		default:
			System.out.println("Opçao invalida!!! \n");
		}
		leia.close();
	}
}