package Lista01;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos;

		System.out.print("Digite a hora atual: ");
		horas = leia.nextInt();
		System.out.print("Digite os minutos atuais: ");
		minutos = leia.nextInt();
		System.out.print("Digite os segundos atuais: ");
		segundos = leia.nextInt();
		System.out.println("");

		// Fórmula para saber os segundos
		segundos = horas * 3600 + minutos * 60 + segundos;

		System.out.println("Ja se passaram " + segundos + " segundos do seu dia!");
		leia.close();
	}

}
