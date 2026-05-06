package Lista04;

import java.util.Scanner;

public class Questao05 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int num, opcao, soma = 0, quant = 0;
        int maior = 0, menor = 0;
        int pares = 0, quantpares = 0;

        do {
            System.out.println("Digite um numero:");
            num = leia.nextInt();

            // Inicializa maior e menor apenas no primeiro número
            if (quant == 0) {
                maior = menor = num;
            }

            soma += num;
            quant++;

            if (num % 2 == 0) {
                pares += num;
                quantpares++;
            }

            if (num > maior) {
                maior = num;
            } else if (num < menor) {
                menor = num;
            }

            System.out.println("Deseja inserir outro número?");
            System.out.println("Digite -1 para parar ou qualquer outro valor para continuar:");
            opcao = leia.nextInt();

        } while (opcao != -1);

        if (quant > 0) {
            System.out.println("Soma: " + soma);
            System.out.println("Quantidade: " + quant);
            System.out.println("Média: " + (double) soma / quant);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);

            if (quantpares > 0) {
                System.out.println("Média dos pares: " + (double) pares / quantpares);
            } else {
                System.out.println("Não foram digitados números pares.");
            }
        }

        leia.close();
    }
}