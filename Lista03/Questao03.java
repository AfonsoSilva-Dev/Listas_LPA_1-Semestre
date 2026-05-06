package Lista03;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int nivel, horas;
		float valores = 0;

		System.out.println("Nome do professor:");
		nome = leia.nextLine();
		System.out.println("Nível: ");
		nivel = leia.nextInt();
		System.out.println("Horas: ");
		horas = leia.nextInt();

		switch (nivel) {

		case 1:
			valores = horas * 12;
			break;

		case 2:
			valores = horas * 17;
			break;

		case 3:
			valores = horas * 25;
			break;

		default:
			System.out.println("Opçao invalida!!");
		}

		System.out.println("Ficha do professor: ");
		System.out.println("Nome do professor : " + nome);
		System.out.println("Nível: " + nivel);
		System.out.println("Valores a receber: " + valores);

		leia.close();
	}

}