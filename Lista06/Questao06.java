package Lista06;

import java.util.Scanner;

public class Questao06 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num1, num2, opcao;

        // leitura inicial
        System.out.print("Digite o primeiro número: ");
        num1 = leia.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = leia.nextInt();

        do {
            System.out.println("\n1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Trocar valores");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + soma(num1, num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + subtracao(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + multiplicacao(num1, num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + divisao(num1, num2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o novo primeiro número: ");
                    num1 = leia.nextInt();

                    System.out.print("Digite o novo segundo número: ");
                    num2 = leia.nextInt();
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        leia.close();
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(int a, int b) {
        return (double) a / b;
    }
}