package Lista04;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade, sexo, genero;

		int homem = 0;
		int terror = 0, comedia = 0;
		int homem_acao = 0, mulher_comedia = 0;
		int quant = 0;

		int jovem = 0, adulto_jovem = 0, adulto = 0, idoso = 0;

		double soma_idade = 0, soma_idade_terror = 0;

		System.out.println(" Digite a idade (-1 para encerrar)");
		System.out.print("Digite a idade: ");
		idade = leia.nextInt();

		while (idade != -1) {

			soma_idade += idade;
			quant++;

			// Faixa etária
			if (idade <= 17) {
				jovem++;
			} else if (idade <= 35) {
				adulto_jovem++;
			} else if (idade <= 60) {
				adulto++;
			} else {
				idoso++;
			}

			// Sexo
			System.out.println("Sexo:");
			System.out.println("1 - Mulher");
			System.out.println("2 - Homem");
			System.out.print("R: ");
			sexo = leia.nextInt();

			if (sexo == 1) {
			} else if (sexo == 2) {
				homem++;
			}

			// Gênero
			System.out.println("\nGênero favorito:");
			System.out.println("1 - Comédia");
			System.out.println("2 - Terror");
			System.out.println("3 - Ação");
			System.out.print("R: ");
			genero = leia.nextInt();

			if (genero == 1) {
				comedia++;
				if (sexo == 1) {
					mulher_comedia++;
				}
			} else if (genero == 2) {
				terror++;
				soma_idade_terror += idade;
			} else if (genero == 3) {
				if (sexo == 2) {
					homem_acao++;
				}
			}

			System.out.print("\nDigite a idade: ");
			idade = leia.nextInt();
		}

		System.out.println("\n===== RESULTADOS =====");

		// (a) Média idade terror
		if (terror > 0) {
			System.out.println("Média de idade (Terror): " + (soma_idade_terror / terror));
		} else {
			System.out.println("Nenhuma pessoa escolheu Terror.");
		}

		// (b) Percentual homens ação
		if (homem > 0) {
			System.out.println("Percentual de homens que preferem Ação: " + ((double) homem_acao / homem) * 100 + "%");
		} else {
			System.out.println("Nenhum homem foi registrado.");
		}

		// (c) Quem prefere comédia
		if (comedia > 0) {
			int homens_comedia = comedia - mulher_comedia;

			if (mulher_comedia > homens_comedia) {
				System.out.println("Mais mulheres preferem Comédia.");
			} else if (mulher_comedia < homens_comedia) {
				System.out.println("Mais homens preferem Comédia.");
			} else {
				System.out.println("Homens e mulheres preferem igualmente Comédia.");
			}
		} else {
			System.out.println("Nenhuma pessoa escolheu Comédia.");
		}

		// (d) Faixa etária predominante
		if (quant > 0) {
			if (jovem >= adulto_jovem && jovem >= adulto && jovem >= idoso) {
				System.out.println("Predominam jovens (0-17 anos).");
			} else if (adulto_jovem >= adulto && adulto_jovem >= idoso) {
				System.out.println("Predominam adultos jovens (18-35 anos).");
			} else if (adulto >= idoso) {
				System.out.println("Predominam adultos (36-60 anos).");
			} else {
				System.out.println("Predominam idosos (60+ anos).");
			}

			System.out.println("Média geral de idade: " + (soma_idade / quant));
		} else {
			System.out.println("Nenhum dado foi informado.");
		}

		leia.close();
	}
}