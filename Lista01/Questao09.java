package Lista01;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int totalFitas;
		double valorAluguel, alugadasMes, faturamentoMensal, faturamentoAnual, atrasadas, valorMulta, multaMensal, estragadasAno;

		System.out.println("Locadora");

		System.out.print("Digite a quantidade de fitas: ");
		totalFitas = leia.nextInt();

		System.out.print("Digite o valor do aluguel: ");
		valorAluguel = leia.nextDouble();

		// 1/3 das fitas alugadas por mês
		alugadasMes = totalFitas / 3.0;

		// Faturamento
		faturamentoMensal = alugadasMes * valorAluguel;
		faturamentoAnual = faturamentoMensal * 12;

		// Multas
		atrasadas = alugadasMes / 10;
		valorMulta = valorAluguel * 0.10;
		multaMensal = atrasadas * valorMulta;

		// Fitas estragadas
		estragadasAno = totalFitas * 0.02;
		
		
		System.out.println("  Locadora Santos  ");
		System.out.println("Com " + totalFitas+ " fitas e o valor do aluguel por " + valorAluguel);
		System.out.println("Considerando a estimatica dos 10% que atrasam: "+ atrasadas+ ". Com a multa de: R$ "+ valorMulta+ ". O rendimento da multa mensalmente é de R$ "+ multaMensal);
		System.out.println("Considerando também as fitas estragadas que giram em "+ estragadasAno);
		System.out.println("O faturamento mensal é de R$ "+ faturamentoMensal+ "e o faturamento anual é de R$ "+ faturamentoAnual);
		
		
		leia.close();
	}
}