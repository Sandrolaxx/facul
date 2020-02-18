package CinemaPrincipal;

import java.util.Scanner;
//import TrabalhoCinema.CalculoCinema;

public class Principal{
	private static int Poltrona1[][] = new int[8][12];
	private static int Poltrona2[][] = new int[8][12];
	private static int poltronaEscolhida[] = new int[192];
	private static int IngressoVendido = 0;
	private static int poltrona;
	//private static int PoltronsVendidas[][] = new int[16][24];
	private static int contador = 1;
	//private static int numeroSorteado = 0;
	static Scanner PoltronaEscolhida1 = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		criarMatriz1();
		criarMatriz2();
		Mostrarmatriz();
		PoltronaEscolhida();		
		
}
	//Mostrar Matriz
	private static void Mostrarmatriz() {
	for (int linha = 0; linha < Poltrona1.length; linha++) {
		for (int coluna = 0; coluna < Poltrona1[linha].length; coluna++) {
			imprimirPoltronaEscolhidaA(linha,coluna);
			if (Poltrona1[linha][coluna] != poltrona) {
				if (Poltrona1[linha][coluna] < 10){
					System.out.print(0);
				}
				System.out.print(Poltrona1[linha][coluna] + " ");
			}
			
		}	
		System.out.print("   ");
		
		for (int coluna1 = 0; coluna1 < Poltrona2[linha].length; coluna1++) {
			imprimirPoltronaEscolhidaA(linha,coluna1);
			if (Poltrona1[linha][coluna1] != poltrona) {
				if (Poltrona2[linha][coluna1] < 100){
					System.out.print(0);
				}
				System.out.print(Poltrona2[linha][coluna1] + " ");
			}		
		}
		System.out.println("");
		}
	}
	//Criar Matriz
	private static void criarMatriz1() {
			for (int linha = 0; linha < Poltrona1.length; linha++) {
				for (int coluna = 0; coluna < Poltrona1[linha].length; coluna++) {
					Poltrona1[linha][coluna] = contador++;
				}	
				
			}
	}
	
	private static void criarMatriz2() {
		for (int linha = 0; linha < Poltrona2.length; linha++) {
			for (int coluna = 0; coluna < Poltrona2[linha].length; coluna++) {
				Poltrona2[linha][coluna] = contador++;
			}
			
		}
}

	private static void PoltronaEscolhida() {
		String escolha;
		int coluna=0;
		for (int linha = 0; linha <= 192; linha++) {
			System.out.println("Qual lado deseja comprar, lado A ou B? [A/B]" );
			escolha = PoltronaEscolhida1.next();
				if (escolha.equals("A")) {
					System.out.println("Qual a poltrona deseja comprar?");
					poltronaEscolhida[linha] = PoltronaEscolhida1.nextInt();
					IngressoVendido = IngressoVendido +1;
					 imprimirPoltronaEscolhidaA(linha,coluna);
				}
				if (escolha.equals("B")) {
					System.out.println("Qual a poltrona deseja comprar?");
					poltronaEscolhida[linha] = PoltronaEscolhida1.nextInt();
					IngressoVendido = IngressoVendido +1;
					 imprimirPoltronaEscolhidaB(linha,coluna);
				}
			
				imprimirLadoEscolhido(linha,coluna);
		}
	}
	
	private static void imprimirPoltronaEscolhidaA(int linha, int coluna) {
		for (int posicao = 0; posicao < poltronaEscolhida.length; posicao++) {
			if (Poltrona1[linha][coluna] == poltronaEscolhida[posicao]) {
				System.out.print("XX ");
				poltrona = poltronaEscolhida[posicao];
			} 
		}
	}
	
	private static void imprimirPoltronaEscolhidaB(int linha, int coluna) {
		for (int posicao = 0; posicao < poltronaEscolhida.length; posicao++) {
			if (Poltrona2[linha][coluna] == poltronaEscolhida[posicao]) {
				System.out.print("XXX");
				poltrona = poltronaEscolhida[posicao];
			} 
		}
	}
	
	private static void imprimirLadoEscolhido(int linha, int coluna) {
			for (linha = 0; linha < Poltrona1.length; linha++) {
				for ( coluna = 0; coluna < Poltrona1[linha].length; coluna++) {
					imprimirPoltronaEscolhidaA(linha, coluna);
					if(Poltrona1[linha][coluna] != poltrona) {
						if (Poltrona1[linha][coluna] < 10){
							System.out.print(0);
						}
						System.out.print(Poltrona1[linha][coluna] + " ");
					}
				}
				System.out.print("   ");
				for (coluna = 0; coluna < Poltrona2[linha].length; coluna++) {
					imprimirPoltronaEscolhidaB(linha, coluna);
					if(Poltrona2[linha][coluna] != poltrona) {
						if(Poltrona2[linha][coluna] < 100) {
							System.out.print(0);
						}
						System.out.print(Poltrona2[linha][coluna] + " ");
					}
				}
				System.out.println("");
			}
		}
	/*private static void imprimirLadoEscolhidB(int i, int j) {
		for (i = 0; i < Poltrona1.length; i++) {
			for ( j = 0; j < Poltrona1[i].length; j++) {
				imprimirPoltronaEscolhida(i, j);
				if(Poltrona1[i][j] != poltrona) {
					System.out.print(Poltrona1[i][j] + " ");
				}
				
			}
			System.out.println();
			}
			
		}*/
	
	
	
	/*private static boolean validarNumerosDigitado(int numeroDigitado) {
		System.out.print("Que poltrona deseja comprar? ");
		Poltrona1 = PoltronaEscolhida.nextLine();
		for (int i = 0; i < numeroDigitado.length; i++) {
			if (numeroDigitado == numeroDigitado[i]) {
				return false;
			}
		}
		return true;
	}*/
	
	
	}		

