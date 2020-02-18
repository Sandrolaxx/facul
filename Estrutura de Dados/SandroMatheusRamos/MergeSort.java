package SandroMatheusRamos;

import java.util.Random;

public class MergeSort {
	
	private static Random sorteador = new Random();
	
	private static void printArray(int[] vetor) {
		MergeSort(vetor);
		
	
		
	}
	
	private static int[] MergeSort(int[] vetor) {
		
		if(vetor.length <= 1) {
			
			return vetor;
			
		}
		
		int midpoint = vetor.length / 2;
		
		int[] left = new int[midpoint];
		int[] right;
		
		if(vetor.length % 2 == 0) { 
			
			right = new int[midpoint];
			
		} else {
			
			right = new int[midpoint + 1];
			
		}
		
		for(int i=0; i < midpoint; i++) {
			
			left[i] = vetor[i];
			
		}
		
		for(int j=0; j < right.length; j++) {
			
			right[j] = vetor[midpoint+j];
			
		}
		
		int[] result = new int[vetor.length];
		
		left = MergeSort(left);
		right = MergeSort(right);
		
		result = merge(left, right);
		
		return result;
		
	}
	
	private static int[] merge(int[] left, int[] right) {
		
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
	
		while(leftPointer < left.length || rightPointer < right.length) {
			
			if(leftPointer < left.length && rightPointer < right.length) {
				
				if(left[leftPointer] < right[rightPointer]) {
					
					result[resultPointer++] = left[leftPointer++];
					
				} else {
					
					result[resultPointer++] = right[rightPointer++];
					
				}
				
			}
			
			else if(leftPointer < left.length) {
				
				result[resultPointer++] = left[leftPointer++];
				
			}
			
			else if(rightPointer < right.length) {
				
				result[resultPointer++] = right[rightPointer++];
				
			}
 			
		}
		
		return result;
		
	}
	
	public static void mergeSort(int[] vetor) {
		
		inserirDados(vetor);
		vetor = MergeSort(vetor);
		printArray(vetor);
		
	}
	
	private static void inserirDados(int [] vetor) {
		int dadoSorteado = 0;
		boolean dadoValido = false;
		for (int i = 0; i < vetor.length; i++) {
			if (i == 0) {
				dadoSorteado = sorteador.nextInt(1001);
				vetor[i] = dadoSorteado;
			}
			else {	
				while(dadoValido == false) {
					dadoSorteado = sorteador.nextInt(1001);
					dadoValido = validarDados(dadoSorteado, vetor);
				}
				vetor[i] = dadoSorteado;
				dadoValido = false;
			}
		}
	}
	
	private static boolean validarDados(int dadoSorteado, int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (dadoSorteado == vetor[i]) {
				return false;
			}
		}
		return true;
	}

}
