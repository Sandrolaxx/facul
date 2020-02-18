package TrabalhoCalculadora;

import java.util.Scanner;

public class Calculadora{
    public static void Calculadora(){
  
        System.out.println("Operadores:+,-,/,*");
        float valor1;
        float valor2;
        int OperadroEscolhido;
        String operadorMatematico;
        float resultado;
        Scanner valor = new Scanner(System.in);
        Scanner escolha = new Scanner(System.in);

       
			System.out.println("|--------------------------| ");
			System.out.println("|          MENU            |");
			System.out.println("|--------------------------|  ");
			System.out.println("| [1] Adição               |");
			System.out.println("| [2] Subtração            |");
			System.out.println("| [3] Multiplicação        |");
			System.out.println("| [4] Divisão  	           |");
			System.out.println("| [5] Sair   	           |");
			System.out.println("|--------------------------| ");
			do {
				System.out.print("Escolha uma das opções: ");
				OperadroEscolhido = escolha.nextInt();
				if(OperadroEscolhido == 1 || OperadroEscolhido == 2 || OperadroEscolhido ==3 || OperadroEscolhido == 4 || OperadroEscolhido == 5 ) {
					break;
				} else {
					System.out.print("Opção inválida! ");
				}
			}
			while(OperadroEscolhido != 1 || OperadroEscolhido != 2 || OperadroEscolhido !=3 || OperadroEscolhido != 4 || OperadroEscolhido != 5 );
		     if (OperadroEscolhido == 1) {
		    	 System.out.println("Informe primeiro valor:");
		         valor1 = valor.nextInt();
		         System.out.println("Informe segundo valor:");
		         valor2 = valor.nextInt();
		         resultado = valor1 + valor2;
		         System.out.println("O valor da soma é igual a:"+resultado);
			} 
		     else if (OperadroEscolhido == 2) {
				System.out.println("Informe primeiro valor:");
		        valor1 = valor.nextInt();
		        System.out.println("Informe segundo valor:");
		        valor2 = valor.nextInt();
		        resultado= valor1 - valor2;
		        System.out.println("O valor da subtração é igual a:"+resultado);
			  } 
		     else if (OperadroEscolhido == 3) {
			    System.out.println("Informe primeiro valor:");
			        valor1 = valor.nextInt();
			    System.out.println("Informe segundo valor:");
			        valor2 = valor.nextInt();
			    } 
		     else if (OperadroEscolhido == 4) {
			    System.out.println("Informe primeiro valor:");
			    valor1 = valor.nextInt();
			    System.out.println("Informe segundo valor:");
			    valor2 = valor.nextInt();
			    resultado = valor1 / valor2;
		        System.out.println("O valor da divisão é igual a:"+resultado);
			      } 
		     else if(OperadroEscolhido == 5) {
			    System.out.println("Obrigado por usar nossa aplicação! ");
			      }
		}
}
   
