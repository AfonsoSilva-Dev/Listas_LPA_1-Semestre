package Lista02;
import java.util.Scanner;
public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidadeMacas;
		double total;

		System.out.println("Quantas maças deseja comprar? ");
		System.out.print("R: ");
		quantidadeMacas = leia.nextInt();


		if (quantidadeMacas >= 12) {
			total = quantidadeMacas * 0.25;
			System.out.println("Sua compra deu: R$ " + total);
		} else {
			total = quantidadeMacas * 0.3;
			System.out.println("Sua compra deu: R$ ");
		}

		leia.close();
	}
}