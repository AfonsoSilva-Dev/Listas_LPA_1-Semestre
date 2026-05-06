package Lista07;
import java.util.Scanner;
public class Questao03 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String frase;
		char letra;
		int quant = 0;
		
		System.out.println("Digite a frase ou palavra: ");
		System.out.print("R: ");
		frase = leia.nextLine();
		
		System.out.println("\nDigite qual letra quer contar: ");
		System.out.print("R: ");
		letra = leia.next().toUpperCase().charAt(0);
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.toUpperCase().charAt(i) == letra) {
				quant++;
			}
		}

		System.out.println("Na palavra: " + frase);
		System.out.println("Foram encontradas " + quant + " letras " + letra);
		
		leia.close();
	}
}
