package br.edu.OrdenandoVetor;

import java.util.Random;

public class VetorEmOrdem {
	private static int Vetorzin[] = new int [100];
	
	public static void main(String[] args) {
		inserirDados();
		ordenarVetor();
		exibirDados();
	}
	
	//Gerando os valores randomicamente
	private static void	inserirDados(){
		Random aleatorio = new Random();
		boolean numeroValido = false;
		int numeroSorteado = 0;
		for (int posicao = 0; posicao < Vetorzin.length; posicao++) {
			while (numeroValido == false) {
				numeroSorteado = aleatorio.nextInt(999);
				numeroValido = validarNumerosSorteados(numeroSorteado);
			} 
			numeroValido = false;
			Vetorzin[posicao] = numeroSorteado;
		}
	}	
		
	//Ordenando
	private static void ordenarVetor() {
		 int cont2,aux;
		 boolean comparar = true;
		 while(comparar){
			 comparar = false;
             for(cont2 = 0; cont2 < Vetorzin.length-1 ; cont2++){  
                if(Vetorzin[cont2]> Vetorzin[cont2 + 1]){  
                     aux = Vetorzin[cont2];  
                     Vetorzin[cont2] = Vetorzin[cont2 + 1];  
                     Vetorzin[cont2 + 1] = aux;
                     comparar=true;
                 }  
             }
         }  
	}
	//Imprimindo os valores
	private static void exibirDados() {
		ordenarVetor();
		for (int i = 0; i < Vetorzin.length; i++) {
			System.out.print(Vetorzin[i] + "-");
		}
	}
	
	//Validação para que não repita
	private static boolean validarNumerosSorteados(int numeroSorteado) {
		for (int i = 0; i < Vetorzin.length; i++) {
			if (numeroSorteado == Vetorzin[i]) {
				return false;
			}
		}
		return true;
	}
}

