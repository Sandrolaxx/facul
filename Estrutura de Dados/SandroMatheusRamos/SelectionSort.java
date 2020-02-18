package SandroMatheusRamos;

import java.util.Random;

public class SelectionSort {

	public static void selectionSort(int[] vetor) {
		   inserirDados(vetor);
		   
		   selectionsort(vetor);

		   //exibirDados(vetor);
		 }
		                  
		 public static void selectionsort(int[] array) {
		  for (int fixo = 0; fixo < array.length - 1; fixo++) {
		    int menor = fixo;
		   
		    for (int i = menor + 1; i < array.length; i++) {
		       if (array[i] < array[menor]) {
		          menor = i;
		       }
		    }
		    if (menor != fixo) {
		      int t = array[fixo];
		      array[fixo] = array[menor];
		      array[menor] = t;
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
