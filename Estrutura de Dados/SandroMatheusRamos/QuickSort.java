package SandroMatheusRamos;

import java.util.Random;

public class QuickSort {

	public static void quickSort(int[] vetor) {
	 inserirDados(vetor);	

     quicksort(vetor,0,vetor.length-1);

     //exibirDados(vetor);
}

private static void quicksort(int[] vetor, int inicio, int fim) {
     if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quicksort(vetor, inicio, posicaoPivo - 1);
            quicksort(vetor, posicaoPivo + 1, fim);
     }
}

private static int separar(int[] vetor, int inicio, int fim) {
     int pivo = vetor[inicio];
     int i = inicio + 1, f = fim;
     while (i <= f) {
            if (vetor[i] <= pivo)
                   i++;
            else if (pivo < vetor[f])
                   f--;
            else {
                   int troca = vetor[i];
                   vetor[i] = vetor[f];
                   vetor[f] = troca;
                   i++;
                   f--;
            }
     }
     vetor[inicio] = vetor[f];
     vetor[f] = pivo;
     return f;
}
private static void exibirDados(int[] vetor) {
	for (int i = 0; i < vetor.length; i++) {
		System.out.print(vetor[i] + "-");
	}
}

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


