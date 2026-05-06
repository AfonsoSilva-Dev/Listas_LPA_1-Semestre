package Lista03;

import java.util.Scanner;

public class Questao04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double salario;
		String nome;
		int codigo;

		System.out.print("Nome: ");
		nome = leia.nextLine();
		System.out.print("Cod. Cargo: ");
		codigo = leia.nextInt();
		System.out.print("Salario: ");
		salario = leia.nextFloat();

		switch (codigo) {

		case 101:
			System.out.println("Nome: " + nome);
			System.out.println("Cod. Cargo: " + codigo);
			System.out.println("Cargo: Gerente");
			System.out.println("Salario: " + salario);
			System.out.println("Aumento: 10% (" + salario * 0.1 + ")");
			System.out.println("Salario com reajuste: " + (salario + salario * 0.1));
			break;

		case 102:
			System.out.println("Nome: " + nome);
			System.out.println("Cod. Cargo: " + codigo);
			System.out.println("Cargo: Engenheiro");
			System.out.println("Salario: " + salario);
			System.out.println("Aumento: 20% (" + salario * 0.2 + ")");
			System.out.println("Salario com reajuste: " + (salario + salario * 0.2));
			break;

		case 103:
			System.out.println("Nome: " + nome);
			System.out.println("Cod. Cargo: " + codigo);
			System.out.println("Cargo: Tecnico");
			System.out.println("Salario: " + salario);
			System.out.println("Aumento: 30% (" + salario * 0.3 + ")");
			System.out.println("Salario com reajuste: " + (salario + salario * 0.3));
			break;

		default:
			System.out.println("Nome: " + nome);
			System.out.println("Cod. Cargo: " + codigo);
			System.out.println("Cargo: Desconhecido");
			System.out.println("Salario: " + salario);
			System.out.println("Aumento: 40% (" + salario * 0.4 + ")");
			System.out.println("Salario com reajuste: " + (salario + salario * 0.4));
		}

		leia.close();
	}

}
