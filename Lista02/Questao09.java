package Lista02;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int homem1, homem2, mulher1, mulher2, homemVelho, homemNovo, mulherNova, mulherVelha;

		System.out.println("Digite a idade dos 2 homens: ");
		System.out.print("Homem 1: ");
		homem1 = leia.nextInt();

		System.out.print("Homem 2: ");
		homem2 = leia.nextInt();

		if (homem1 > homem2) {
			homemVelho=homem1;
			homemNovo=homem2; 
		} else {
			homemVelho=homem2 ;
			homemNovo= homem1 ;
		}

		System.out.println("Digite a idade das 2 mulheres: ");
		System.out.print("Mulher 1: ");
		mulher1 = leia.nextInt();
		System.out.print("Mulher 2: ");
		mulher2 = leia.nextInt();

		if (mulher1 < mulher2) {
			 mulherNova=mulher1;
			mulherVelha= mulher2;
		} else {
			mulherNova=mulher2;
			mulherVelha= mulher1;
		}

		System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + (mulherNova + homemVelho));
		System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + mulherVelha * homemNovo);

		leia.close();
	}
}
