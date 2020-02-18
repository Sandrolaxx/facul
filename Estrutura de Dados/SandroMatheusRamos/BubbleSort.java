package SandroMatheusRamos;

import java.util.Random;

public class BubbleSort {
	public static void bubbleSort(int[] vetor) { 
	inserirDados(vetor);
    
    bubblesort(vetor);

    //exibirDados(vetor);
	}

	private static void bubblesort(int vetor[]){
      boolean troca = true;
      int aux;
      while (troca) {
          troca = false;
          for (int i = 0; i < vetor.length - 1; i++) {
              if (vetor[i] > vetor[i + 1]) {
                  aux = vetor[i];
                  vetor[i] = vetor[i + 1];
                  vetor[i + 1] = aux;
                  troca = true;
              }
          }
      }
}
	/*private static void exibirDados(int[] vetor) {
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
}
	
	
	



