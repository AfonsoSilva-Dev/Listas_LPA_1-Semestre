package Lista05;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int num1, num2, mdc = 0, aux;

        System.out.println("Digite o primeiro numero: ");
        num1 = leia.nextInt();

        System.out.println("Digite o segundo numero: ");
        num2 = leia.nextInt();

        if (num2 > num1) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for (int cont = 1; cont <= num2; cont++) {
            if (num1 % cont == 0 && num2 % cont == 0) {
                mdc = cont;
            }
        }

        System.out.println("MDC: " + mdc);

        leia.close();
    }
}