// If, else, if else
package estruturas;

public class Programa4if_else {

	public static void main(String[] args) {
		// Declarando e inicializando a variável
		int numero = 5;
		
		/*
		 se (numero > 5) então {
		 	escreva ("Sim, o numero" + numero + "é maior que 5");
		 	}senão se (numerp ==5)então{
		 	escreva ("O número " + numero + " é igual a 5." );
		 	}senão{
		 	escreva ("Sim, o numero" + numero + "não é maior que 5");
		 }
		 */
		if (numero > 5) {
			System.out.println("Sim, o número " + numero + " é maior que 5." );
		}else if (numero == 5){
			System.out.println("O número " + numero + " é igual a 5." );
		}else {
			System.out.println("Não, o número " + numero + " não é maior que 5.");
		
	}

}

}