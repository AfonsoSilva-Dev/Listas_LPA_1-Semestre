package Lista07;

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String frase;
        int quantPalavras = 0;

        System.out.println("Digite sua palavra ou frase: ");
        System.out.print("R: ");
        frase = leia.nextLine().trim();

        if (!frase.isEmpty()) {
            quantPalavras = 1;

            for (int i = 0; i < frase.length(); i++) {
                if (frase.charAt(i) == ' ' && frase.charAt(i - 1) != ' ') {
                    quantPalavras++;
                }
            }
        }

        System.out.println("A sua frase '" + frase + "' tem " + quantPalavras + " palavras.");

        leia.close();
    }
}