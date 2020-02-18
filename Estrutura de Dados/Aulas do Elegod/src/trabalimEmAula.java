

import java.util.Random;

public class trabalimEmAula {
	private static int MatrizA[][] = new int[3][4];
	private static int MatrizB[][] = new int[4][5];
	private static int MatrizC[][] = new int[4][4];
	private static int MatrizD[][] = new int[4][5];
	private static Random Sorteador= new Random();
	private static int NumeroAleatorio;
	private static int Result;
	
	
	public static void main(String[] args) {
		criarMatriz();
		imprimirMatriz();
		operacoes();
	} 
	
	public static void criarMatriz() {
		for(int linha = 0; linha < MatrizA.length; linha++) {
			for(int coluna = 0; coluna < MatrizA[linha].length; coluna++) {	
				NumeroAleatorio = Sorteador.nextInt(9)+1;
				MatrizA[linha][coluna] = NumeroAleatorio;
			}
			}
		for(int linha = 0; linha < MatrizB.length; linha++) {
			for(int coluna = 0; coluna < MatrizB[linha].length; coluna++) {	
				NumeroAleatorio = Sorteador.nextInt(9)+1;
				MatrizB[linha][coluna] = NumeroAleatorio;
			}
			}
		for(int linha = 0; linha < MatrizC.length; linha++) {
			for(int coluna = 0; coluna < MatrizC[linha].length; coluna++) {	
				NumeroAleatorio = Sorteador.nextInt(9)+1;
				MatrizC[linha][coluna] = NumeroAleatorio;
			}
			}
		}	

public static void imprimirMatriz() {
	System.out.println("--------------------------------------------------------------------------------");
	for(int linha = 0; linha < MatrizA.length; linha++) {
		for(int coluna = 0; coluna < MatrizA[linha].length; coluna++) {
				System.out.print(MatrizA[linha][coluna] + " ");	
		}
	System.out.println();
		}
	System.out.println();
	for(int linha = 0; linha < MatrizB.length; linha++) {
	    for(int coluna = 0; coluna < MatrizB[linha].length; coluna++) {
				System.out.print(MatrizB[linha][coluna] + " ");	
		}
	System.out.println();
		}
	System.out.println();
	for(int linha = 0; linha < MatrizC.length; linha++) {
	    for(int coluna = 0; coluna < MatrizC[linha].length; coluna++) {
				System.out.print(MatrizC[linha][coluna] + " ");	
		}
	System.out.println();
		}
	System.out.println();
	/*for(int linha = 0; linha < MatrizD.length; linha++) {
		for(int coluna = 0; coluna < MatrizD[linha].length; coluna++) {
				System.out.print(MatrizD[linha][coluna] + " ");	
		}
	System.out.println();
		}*/
	}

public static void operacoes() {
	System.out.println();
	for (int linha = 0; linha < MatrizA.length; linha++) {
		for (int coluna = 0; coluna < MatrizA.length; coluna++) {
			Result= MatrizA[linha][coluna] + MatrizB[linha][coluna] + MatrizC[linha][coluna];
			MatrizD[linha][coluna] = Result;
	}
		
		
		
	}	
		
	
	/*System.out.println();
	for (int linha = 0; linha < MatrizD.length; linha++) {
		for (int coluna = 0; coluna < MatrizD.length; coluna++) {
			Result= MatrizA[linha][coluna] - MatrizB[linha][coluna] - MatrizC[linha][coluna];
			System.out.println(Result + " ");
		}
	}
	
	System.out.println();
	for (int linha = 0; linha < MatrizD.length; linha++) {
		for (int coluna = 0; coluna < MatrizD.length; coluna++) {
			Result= MatrizA[linha][coluna] * MatrizB[linha][coluna] * MatrizC[linha][coluna];
			System.out.println(Result + " ");
		}
	}
	
	System.out.println();
	for (int linha = 0; linha < MatrizD.length; linha++) {
		for (int coluna = 0; coluna < MatrizD.length; coluna++) {
			Result= MatrizA[linha][coluna] / MatrizB[linha][coluna] / MatrizC[linha][coluna];
			System.out.println(Result + " ");
		}
	}*/
	
}
}
