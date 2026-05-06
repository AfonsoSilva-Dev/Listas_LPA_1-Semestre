package Lista11;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] nomes = new String[5];
        double[][] matriz = new double[5][4]; // 4 notas por aluno

        // Ler nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomes[i] = leia.nextLine();
        }

        dadosMatriz(nomes, matriz, leia);
        exibirMatriz(nomes, matriz);

        leia.close();
    }

    public static void dadosMatriz(String nomes[], double matriz[][], Scanner leia) {

        for (int a = 0; a < 5; a++) {
            System.out.println("\nAluno: " + nomes[a]);

            for (int b = 0; b < 4; b++) {
                System.out.print("Digite a nota " + (b + 1) + ": ");
                matriz[a][b] = leia.nextDouble();
            }
        }
    }

    public static void exibirMatriz(String nomes[], double matriz[][]) {
    	System.out.println();
    	System.out.println("_______________________________________");
    	System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(nomes[i] + ": ");

            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}