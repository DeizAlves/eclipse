package estruturas;
// do while
import java.util.Scanner;

public class Programa8doWhile {
	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		//Para receber dados via teclado
		Scanner digite = new Scanner(System.in);
		
		//Primeiro executa o bloco, depois faz a chegagem
		do {
			
			System.out.println("Informe seu nome: ");
			nome = digite.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = digite.nextInt();// Bug
			idade = Integer.parseInt(digite.nextLine());
			
			if(idade > 0){
			System.out.println(nome + " tem " + idade + " anos.");

			}
		}while(idade > 0);
		
		digite.close();

	}
}

