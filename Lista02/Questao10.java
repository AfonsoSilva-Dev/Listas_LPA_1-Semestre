package Lista02;
import java.util.Scanner;
public class Questao10 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		String nome;
		int idade;

		System.out.println("Informe o nome e idade do participante:");
		System.out.print("Nome: ");
		nome = leia.nextLine();
		System.out.print("Idade: ");
		idade = leia.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		
		if(idade <= 4) {
			System.out.println("Não pode competir");
		} else if(idade >= 5 && idade <=7) {
			System.out.println("Categoria: Infantil A");
		} else if(idade >= 8 && idade <=10) {
			System.out.println("Categoria: Infantil B");
		} else if(idade >= 11 && idade <= 13) {
			System.out.println("Categoria: Juvenil A");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		} else if(idade > 18) {
			System.out.println("Categoria: Senior");
		}
		
		leia.close();
	}
}