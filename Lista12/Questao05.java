package Lista12;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vet[] = new int[4];
		int inicio = 0, fim = vet.length - 1;
		
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite o valor da posicao " + i + " do vetor: ");
			System.out.print("R: ");
			vet[i] = leia.nextInt();
		}
		
		System.out.println("Vetor Original: ");
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]);
			
			if((i + 1) < vet.length) {
				System.out.print(" | ");
			}
			leia.close();
		}
		
		inverterVetor(vet, inicio, fim);
		System.out.println("Vetor Modificado: ");
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i]);
			
			if((i + 1) < vet.length) {
				System.out.print(" | ");
			}
		}
	}

	public static void inverterVetor(int[] vet, int inicio, int fim) {
		if (inicio >= fim) {
			return;
		}
	        int temp = vet[inicio];
	        vet[inicio] = vet[fim];
	        vet[fim] = temp;

	        inverterVetor(vet, inicio + 1, fim - 1);
	    }
}