package Lista10;

public class Questao04 {

	public static void main(String[] args) {

		int[][] triangulo = new int[7][7];

		for (int linha = 0; linha < 7; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {

				// Bordas sempre são 1
				if (coluna == 0 || coluna == linha) {
					triangulo[linha][coluna] = 1;

				} else {
					
					// Soma dos dois valores de cima
					triangulo[linha][coluna] = triangulo[linha - 1][coluna] + triangulo[linha - 1][coluna - 1];
				}

				System.out.print(triangulo[linha][coluna] + " ");
			}

			System.out.println();
		}
	}
}