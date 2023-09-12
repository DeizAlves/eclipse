package estruturas;
//For

import java.util.Scanner;

public class Programa9For {
	public static void main (String[]args) {
		
		int idade;
		String nome;
		Scanner digite = new Scanner(System.in);
		
		//variável de controle; condição de parada; forma de incremento
		for(int i = 0; i < 5; i++ ) {
			System.out.println("Informe seu nome: ");
			nome = digite.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = digite.nextInt();// Bug
			idade = Integer.parseInt(digite.nextLine());
			
			if(idade > 0){
			System.out.println(nome + " tem " + idade + " anos.");

			}
		}
		
		digite.close();
	
	}
}

