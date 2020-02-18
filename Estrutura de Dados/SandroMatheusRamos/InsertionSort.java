package SandroMatheusRamos;

import java.util.Random;

public class InsertionSort {

	public static void insertionSort(int[] vetor) {
		         inserirDados(vetor);
			    
			    
			     insertionsort(vetor);
			    
			     
			    
			     //exibirDados(vetor);
			}    
			public static void insertionsort(int[] vetor) {
			    int j;
			    int key;
			    int i;
			    
			    for (j = 1; j < vetor.length; j++)
			    {
			      key = vetor[j];
			      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
			      {
			         vetor[i + 1] = vetor[i];
			       }
			        vetor[i + 1] = key;
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
		
	


