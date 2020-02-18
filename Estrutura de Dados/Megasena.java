package br.edu.vetor;

import java.util.Random;

public class Megasena {
	
	private static int cartela[][] = new int[6][10];
	private static int numerosSorteados[] = new int[6];
	private static int contador = 1;
	private static int numeroSorteado = 0;
	public static void main(String[] args) {
		criarMatriz();
		sortearNumeros();
		mostrarCartelaPreenchida();
	}

	private static void mostrarCartelaPreenchida() {
		for (int linha = 0; linha < cartela.length; linha++) {
			for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
				imprimirCaractereNumeroSorteado(linha, coluna);
				if (cartela[linha][coluna] != numeroSorteado) {
					imprimirZero(linha, coluna);
					System.out.print(cartela[linha][coluna] + " ");
				}
				
			}
			System.out.println();
		}
	}

	private static void imprimirCaractereNumeroSorteado(int linha, int coluna) {
		for (int posicao = 0; posicao < numerosSorteados.length; posicao++) {
			if (cartela[linha][coluna] == numerosSorteados[posicao]) {
				System.out.print("XX ");
				numeroSorteado = numerosSorteados[posicao];
			} 
		}
	}

	private static void sortearNumeros() {
		Random aleatorio = new Random();
		boolean numeroValido = false;
		int numeroSorteado = 0;
		for (int posicao = 0; posicao < numerosSorteados.length; posicao++) {
			while (numeroValido == false) {
				numeroSorteado = aleatorio.nextInt(59) + 1;
				numeroValido = validarNumerosSorteados(numeroSorteado);
			} 
			numeroValido = false;
			numerosSorteados[posicao] = numeroSorteado;
		}
	}

	private static boolean validarNumerosSorteados(int numeroSorteado) {
		for (int i = 0; i < numerosSorteados.length; i++) {
			if (numeroSorteado == numerosSorteados[i]) {
				return false;
			}
		}
		return true;
	}

	private static void criarMatriz() {
		for (int linha = 0; linha < cartela.length; linha++) {
			for (int coluna = 0; coluna < cartela[linha].length; coluna++) {
				cartela[linha][coluna] = contador++;
			}
		}
	}

	private static void imprimirZero(int linha, int coluna) {
		if (cartela[linha][coluna] < 10) {
			System.out.print(0);
		}
	}

}
