package SandroMatheusRamos;

import java.util.Scanner;

import SandroMatheusRamos.VetorEmOrdem;
import SandroMatheusRamos.InsertionSort;
import SandroMatheusRamos.BubbleSort;
import SandroMatheusRamos.QuickSort;
import SandroMatheusRamos.SelectionSort;
import SandroMatheusRamos.MergeSort;

public class Principal {

	public static void main(String[] args) {
		InsertionSort insertionSort = new  InsertionSort();
		BubbleSort bubbleSort = new BubbleSort();
		QuickSort quickSort = new QuickSort();
		SelectionSort selectionSort = new SelectionSort();
		MergeSort mergeSort = new MergeSort();
		VetorEmOrdem vetorEmOrdem = new VetorEmOrdem();
		int quantidade = 1000;
	    int[] vetor = new int[quantidade];
		Scanner trabalhos = new Scanner (System.in);
		Scanner escolha = new Scanner (System.in);
		int TrabalhoEscolhido;
		String NovaConsulta;
		
		do {
			System.out.println("|--------------------------| ");
			System.out.println("|          MENU            |");
			System.out.println("|--------------------------|  ");
			System.out.println("| [1] InsertionSort        |");
			System.out.println("| [2] BubbleSort           |");
			System.out.println("| [3] QuickSort            |");
			System.out.println("| [4] SelectionSort        |");
			System.out.println("| [5] MergeSort            |");
			System.out.println("| [6] Método Próprio       |");
			System.out.println("| [7] Sair                 |");
			System.out.println("|--------------------------| ");
			do {
				System.out.print("Escolha uma das opções: ");
				TrabalhoEscolhido = trabalhos.nextInt();
				if(TrabalhoEscolhido == 1 || TrabalhoEscolhido == 2 || TrabalhoEscolhido ==3 || TrabalhoEscolhido == 4 || TrabalhoEscolhido == 5 || TrabalhoEscolhido == 6 || TrabalhoEscolhido == 7) {
					break;
				} else {
					System.out.print("Opção inválida! ");
				}
			}
			while(TrabalhoEscolhido != 1 || TrabalhoEscolhido != 2 || TrabalhoEscolhido !=3 || TrabalhoEscolhido != 4 || TrabalhoEscolhido != 5 || TrabalhoEscolhido != 6 || TrabalhoEscolhido != 7);
		     if (TrabalhoEscolhido == 1) {
		    	
		    	 System.out.println("Você escolheu InsertionSort!");
		    	 long tempoInicial = System.currentTimeMillis();
		    	 InsertionSort.insertionSort(vetor);
		    	 long tempoFinal = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		    	 System.out.println("Outros Métodos");
		    	 long tempoInicial1 = System.currentTimeMillis();
		    	 BubbleSort.bubbleSort(vetor);
		    	 long tempoFinal1 = System.currentTimeMillis();
		    	 System.out.println("BubbleSort Executado em = " + (tempoFinal1 - tempoInicial1) + " ms");
		    	 long tempoInicial2 = System.currentTimeMillis();
		    	 QuickSort.quickSort(vetor);
		    	 long tempoFinal2 = System.currentTimeMillis();
		    	 System.out.println("QuickSort executado em = " + (tempoFinal2 - tempoInicial2) + " ms");
		    	 long tempoInicial3 = System.currentTimeMillis();
		    	 SelectionSort.selectionSort(vetor);
		    	 long tempoFinal3 = System.currentTimeMillis();
		    	 System.out.println("SelectionSort executado em = " + (tempoFinal3 - tempoInicial3) + " ms");
		    	 long tempoInicial4 = System.currentTimeMillis();
		    	 MergeSort.mergeSort(vetor);
		    	 long tempoFinal4 = System.currentTimeMillis();
		    	 System.out.println("MergeSort executado em = " + (tempoFinal4 - tempoInicial4) + " ms");
		    	 long tempoInicial5 = System.currentTimeMillis();
		    	 VetorEmOrdem.vetorEmOrdem(vetor);
		    	 long tempoFinal5 = System.currentTimeMillis();
		    	 System.out.println("VetorEmOrdem executado em = " + (tempoFinal5 - tempoInicial5) + " ms");
		    	 break;
			} else if (TrabalhoEscolhido == 2) {
				System.out.println("Você escolheu BubbleSort!");
		    	 long tempoInicial = System.currentTimeMillis();
		    	 BubbleSort.bubbleSort(vetor);
		    	 long tempoFinal = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
		    	 System.out.println("Outros Métodos");
		    	 long tempoInicial1 = System.currentTimeMillis();
		    	 InsertionSort.insertionSort(vetor);
		    	 long tempoFinal1 = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal1 - tempoInicial1) + " ms");
		    	 long tempoInicial2 = System.currentTimeMillis();
		    	 QuickSort.quickSort(vetor);
		    	 long tempoFinal2 = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal2 - tempoInicial2) + " ms");
		    	 long tempoInicial3 = System.currentTimeMillis();
		    	 SelectionSort.selectionSort(vetor);
		    	 long tempoFinal3 = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal3 - tempoInicial3) + " ms");
		    	 long tempoInicial4 = System.currentTimeMillis();
		    	 MergeSort.mergeSort(vetor);
		    	 long tempoFinal4 = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal4 - tempoInicial4) + " ms");
		    	 long tempoInicial5 = System.currentTimeMillis();
		    	 VetorEmOrdem.vetorEmOrdem(vetor);
		    	 long tempoFinal5 = System.currentTimeMillis();
		    	 System.out.println("Executado em = " + (tempoFinal5 - tempoInicial5) + " ms");
		    	 break;
			  } else if (TrabalhoEscolhido == 3) {
				  System.out.println("Você escolheu QuickSort!");
			    	 long tempoInicial = System.currentTimeMillis();
			    	 QuickSort.quickSort(vetor);
			    	 long tempoFinal = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
			    	 System.out.println("Outros Métodos");
			    	 long tempoInicial1 = System.currentTimeMillis();
			    	 BubbleSort.bubbleSort(vetor);
			    	 long tempoFinal1 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal1 - tempoInicial1) + " ms");
			    	 long tempoInicial2 = System.currentTimeMillis();
			    	 QuickSort.quickSort(vetor);
			    	 long tempoFinal2 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal2 - tempoInicial2) + " ms");
			    	 long tempoInicial3 = System.currentTimeMillis();
			    	 SelectionSort.selectionSort(vetor);
			    	 long tempoFinal3 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal3 - tempoInicial3) + " ms");
			    	 long tempoInicial4 = System.currentTimeMillis();
			    	 MergeSort.mergeSort(vetor);
			    	 long tempoFinal4 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal4 - tempoInicial4) + " ms");
			    	 long tempoInicial5 = System.currentTimeMillis();
			    	 VetorEmOrdem.vetorEmOrdem(vetor);
			    	 long tempoFinal5 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal5 - tempoInicial5) + " ms");
			    	 break;
				  
				 
			    } else if (TrabalhoEscolhido == 4) {
			    	System.out.println("Você escolheu SelectionSort!");
			    	 long tempoInicial = System.currentTimeMillis();
			    	 selectionSort.selectionSort(vetor);
			    	 long tempoFinal = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
			    	 System.out.println("Outros Métodos");
			    	 long tempoInicial1 = System.currentTimeMillis();
			    	 BubbleSort.bubbleSort(vetor);
			    	 long tempoFinal1 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal1 - tempoInicial1) + " ms");
			    	 long tempoInicial2 = System.currentTimeMillis();
			    	 QuickSort.quickSort(vetor);
			    	 long tempoFinal2 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal2 - tempoInicial2) + " ms");
			    	 long tempoInicial3 = System.currentTimeMillis();
			    	 SelectionSort.selectionSort(vetor);
			    	 long tempoFinal3 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal3 - tempoInicial3) + " ms");
			    	 long tempoInicial4 = System.currentTimeMillis();
			    	 MergeSort.mergeSort(vetor);
			    	 long tempoFinal4 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal4 - tempoInicial4) + " ms");
			    	 long tempoInicial5 = System.currentTimeMillis();
			    	 VetorEmOrdem.vetorEmOrdem(vetor);
			    	 long tempoFinal5 = System.currentTimeMillis();
			    	 System.out.println("Executado em = " + (tempoFinal5 - tempoInicial5) + " ms");
			    	 break;
			    	
			    	
			      }else if (TrabalhoEscolhido == 5) {
			    	  System.out.println("Você escolheu MergeSort!");
				    	 long tempoInicial = System.currentTimeMillis();
				    	 MergeSort.mergeSort(vetor);
				    	 long tempoFinal = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
				    	 System.out.println("Outros Métodos");
				    	 long tempoInicial1 = System.currentTimeMillis();
				    	 BubbleSort.bubbleSort(vetor);
				    	 long tempoFinal1 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal1 - tempoInicial1) + " ms");
				    	 long tempoInicial2 = System.currentTimeMillis();
				    	 QuickSort.quickSort(vetor);
				    	 long tempoFinal2 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal2 - tempoInicial2) + " ms");
				    	 long tempoInicial3 = System.currentTimeMillis();
				    	 SelectionSort.selectionSort(vetor);
				    	 long tempoFinal3 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal3 - tempoInicial3) + " ms");
				    	 long tempoInicial4 = System.currentTimeMillis();
				    	 MergeSort.mergeSort(vetor);
				    	 long tempoFinal4 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal4 - tempoInicial4) + " ms");
				    	 long tempoInicial5 = System.currentTimeMillis();
				    	 VetorEmOrdem.vetorEmOrdem(vetor);
				    	 long tempoFinal5 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal5 - tempoInicial5) + " ms");
				    	 break;
			    	  
			      	}else if (TrabalhoEscolhido == 6) {
			      		System.out.println("Você escolheu Método Próprio!");
				    	 long tempoInicial = System.currentTimeMillis();
				    	 VetorEmOrdem.vetorEmOrdem(vetor);
				    	 long tempoFinal = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
				    	 System.out.println("Outros Métodos");
				    	 long tempoInicial1 = System.currentTimeMillis();
				    	 BubbleSort.bubbleSort(vetor);
				    	 long tempoFinal1 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal1 - tempoInicial1) + " ms");
				    	 long tempoInicial2 = System.currentTimeMillis();
				    	 QuickSort.quickSort(vetor);
				    	 long tempoFinal2 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal2 - tempoInicial2) + " ms");
				    	 long tempoInicial3 = System.currentTimeMillis();
				    	 SelectionSort.selectionSort(vetor);
				    	 long tempoFinal3 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal3 - tempoInicial3) + " ms");
				    	 long tempoInicial4 = System.currentTimeMillis();
				    	 MergeSort.mergeSort(vetor);
				    	 long tempoFinal4 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal4 - tempoInicial4) + " ms");
				    	 long tempoInicial5 = System.currentTimeMillis();
				    	 VetorEmOrdem.vetorEmOrdem(vetor);
				    	 long tempoFinal5 = System.currentTimeMillis();
				    	 System.out.println("Executado em = " + (tempoFinal5 - tempoInicial5) + " ms");
				    	 break;
				      }else if(TrabalhoEscolhido == 7) {
			    	  System.out.println("Obrigado por usar nossa aplicação! ");
			    	  break;
			        }
			do {
				System.out.println();
				System.out.print("Deseja realizar uma nova consulta? [S/N] ");
				NovaConsulta = escolha.nextLine();
				System.out.println();
				if(NovaConsulta.equals("S") || NovaConsulta.equals("N")) {
					break;
				} else {
					System.out.print("Opção inválida! ");
				}
			} while(NovaConsulta != "S" || NovaConsulta != "N");
			if(NovaConsulta.equals("N")) {
				System.out.println(" Obrigado por utilizar nossa aplicação! ");
		    	break;
			}
		} while(NovaConsulta.equals("S"));
	}
}
