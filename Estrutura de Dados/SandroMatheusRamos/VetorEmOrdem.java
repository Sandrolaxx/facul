package SandroMatheusRamos;

import java.util.Random;

public class VetorEmOrdem {
	
	public static void vetorEmOrdem(int[] vetor) {
		inserirDados(vetor);
		
		ordenarVetor(vetor);
		//exibirDados(vetor);
		
	}
	//Gerando os valores randomicamente
		private static void	inserirDados(int[] vetor){
			Random aleatorio = new Random();
			boolean numeroValido = false;
			int numeroSorteado = 0;
			for (int posicao = 0; posicao < vetor.length; posicao++) {
				while (numeroValido == false) {
					numeroSorteado = aleatorio.nextInt(1001);
					numeroValido = validarNumerosSorteados(vetor, numeroSorteado);
				} 
				numeroValido = false;
				vetor[posicao] = numeroSorteado;
			}
		}	
			
		//Ordenando
		private static void ordenarVetor(int[] vetor) {
			 int cont2,aux;
			 boolean comparar = true;
			 while(comparar){
				 comparar = false;
	             for(cont2 = 0; cont2 < vetor.length-1 ; cont2++){  
	                if(vetor[cont2]> vetor[cont2 + 1]){  
	                     aux = vetor[cont2];  
	                     vetor[cont2] = vetor[cont2 + 1];  
	                     vetor[cont2 + 1] = aux;
	                     comparar=true;
	                 }  
	             }
	         }  
		}
		//Imprimindo os valores
		/*private static void exibirDados(int[] vetor) {
			ordenarVetor(vetor);
			for (int i = 0; i < vetor.length; i++) {
				System.out.print(vetor[i] + "-");
			}
		}*/
		
		//Validação para que não repita
		private static boolean validarNumerosSorteados(int[] vetor, int numeroSorteado) {
			for (int i = 0; i < vetor.length; i++) {
				if (numeroSorteado == vetor[i]) {
					return false;
				}
			}
			return true;
		}

}

