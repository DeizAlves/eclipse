package estruturas;
//While
import java.util.Scanner;

public class Programa7while {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		//Para receber dados via teclado
		Scanner digite = new Scanner(System.in);
		
		//Sempre checa o valor antes de executar o bloco 
		while(idade > 0) {
			
			System.out.println("Informe seu nome: ");
			nome = digite.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = digite.nextInt();// Bug
			idade = Integer.parseInt(digite.nextLine());
			
			
			System.out.println(nome + " tem " + idade + " anos. ");
		}			
		digite.close();

	}
}