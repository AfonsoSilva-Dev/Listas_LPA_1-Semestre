package Lista06;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite os 2 números para calcular o MMC:");
        System.out.print("Numero 1: ");
        numero1 = leia.nextInt();

        System.out.print("Numero 2: ");
        numero2 = leia.nextInt();

        System.out.println("\n-----------------------------\n");

        int resultado = MMC(numero1, numero2);

        System.out.println("MMC: " + resultado);

        leia.close();
    }

    public static int MMC(int num1, int num2) {
        int mmc = 1;
        int divisor = 2;

        while (num1 > 1 || num2 > 1) {

            if (num1 % divisor == 0 || num2 % divisor == 0) {

                if (num1 % divisor == 0) {
                    num1 = num1 / divisor;
                }

                if (num2 % divisor == 0) {
                    num2 = num2 / divisor;
                }

                mmc = mmc * divisor;

                System.out.println(num1 + " " + num2 + " | " + divisor);

            } else {
                divisor++;
            }
        }

        return mmc;
    }
}