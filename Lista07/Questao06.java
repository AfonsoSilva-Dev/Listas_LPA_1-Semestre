package Lista07;
import java.util.Scanner;
public class Questao06 {

		public static void main(String[] args) {
			Scanner leia = new Scanner(System.in);
			String valor;
			char L1, L2;
			
			System.out.println("Digite a palavra ou frase: ");
			System.out.print("R: ");
			valor = leia.nextLine();
			
			System.out.println("Qual letra deseja substituir? ");
			System.out.print("R: ");
			L1 = leia.next().charAt(0);
			
			System.out.println("Por qual letra deseja substituir? ");
			System.out.print("R: ");
			L2 = leia.next().charAt(0);
			
			System.out.println("Palavra/Frase Original: ");
			System.out.println(valor);
			System.out.println(""
					+ "Palavra/Frase Substituida: ");
			System.out.println(valor.replace(L1, L2));
			
			leia.close();
		}

	}