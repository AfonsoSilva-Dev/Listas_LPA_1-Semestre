package Lista07;
import java.util.Scanner;
public class Questao07 {
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			String palavra;
			
			System.out.println("Digite a palavra ou frase: ");
			System.out.print("R: ");
			palavra = leia.nextLine();
			
			System.out.println("Palavra na Vertical:");
			for(int i = 0; i < palavra.length(); i++) {
				System.out.println(palavra.charAt(i));
			}
			
			leia.close();
		}

	}