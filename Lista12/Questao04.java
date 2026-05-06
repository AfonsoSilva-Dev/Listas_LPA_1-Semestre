package Lista12;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int dividendo, divisor;

        System.out.println("Digite o dividendo: ");
        dividendo = leia.nextInt();

        System.out.println("Digite o divisor: ");
        divisor = leia.nextInt();

        System.out.println("Resultado: " + divisao(dividendo, divisor));

        leia.close();
    }

    public static int divisao(int dividendo, int divisor) {

        if (divisor == 0) {
            System.out.println("Erro: divisão por zero");
            return 0;
        }

        if (dividendo < divisor) { 
            return 0;
        }

        return 1 + divisao(dividendo - divisor, divisor);
    }
}