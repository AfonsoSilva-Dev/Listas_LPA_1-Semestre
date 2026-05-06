package Lista03;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int dia1, dia2, mes1, mes2, ano1, ano2;

		System.out.println("Data 1:");
		System.out.print("Dia: ");
		dia1 = leia.nextInt();
		System.out.print("Mes: ");
		mes1 = leia.nextInt();
		System.out.print("Ano: ");
		ano1 = leia.nextInt();

		mes1 += ano1 * 12;
		dia1 += mes1 * 30;

		System.out.println("Data 2:");
		System.out.print("Dia: ");
		dia2 = leia.nextInt();
		System.out.print("Mes: ");
		mes2 = leia.nextInt();
		System.out.print("Ano: ");
		ano2 = leia.nextInt();

		mes2 += ano2 * 12;
		dia2 += mes2 * 30;

		if (dia1 < dia2) {
			System.out.println("A data 1 é a mais recente!");
		} else if (dia1 > dia2) {
			System.out.println("A data 2 é a mais recente!");
		} else {
			System.out.println("As datas são iguais!");
		}

		leia.close();
	}

}
