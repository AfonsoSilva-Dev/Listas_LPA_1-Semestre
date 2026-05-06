package Lista11;
import java.util.Scanner;
public class Questao01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int matriz[][] = new int[3][3];

		System.out.println("          Preencher Matriz Coluna");
		preencherMatriz(matriz);
		
		System.out.println("Resultado: ");		
		mostrarMatriz(matriz);
		
		leia.close();
	}

	public static void preencherMatriz(int[][] matriz) {
		Scanner leia = new Scanner(System.in);

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Digite o valor da posicao [" + j + "][" + i + "]: ");
				System.out.print("R: ");
				matriz[j][i] = leia.nextInt();
			}
		}
		leia.close();
	}
	
	public static void mostrarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
