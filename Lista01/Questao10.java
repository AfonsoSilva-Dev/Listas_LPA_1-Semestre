package Lista01;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, inicio, fim, resultado;

		System.out.println("Digite o horário que começou a atividade em horas, minutos e segundos: ");
		System.out.print("Horas   : ");
		horas = leia.nextInt();
		System.out.print("Minutos : ");
		minutos = leia.nextInt();
		System.out.print("Segundos: ");
		segundos = leia.nextInt();

		inicio = horas * 3600 + minutos * 60 + segundos;

		System.out.println("Agora, digite o horário que terminou a atividade em horas, minutos e segundos: \n");
		System.out.print("Horas   : ");
		horas = leia.nextInt();
		System.out.print("Minutos : ");
		minutos = leia.nextInt();
		System.out.print("Segundos: ");
		segundos = leia.nextInt();

		fim = horas * 3600 + minutos * 60 + segundos;

		resultado = fim - inicio;

		System.out.println("O tempo de duração da atividade é:");
		horas = resultado / 3600;
		resultado -= horas * 3600;
		minutos = resultado / 60;
		resultado -= minutos * 60;

		System.out.println(horas + "h " + minutos + "m " + resultado + "s");

		leia.close();
	}

}
