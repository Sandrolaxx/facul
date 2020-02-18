package CinemaPrincipal;

import java.util.TimerTask;
import java.util.Timer;
import java.util.Scanner;

public class Cinema {
	// Declarando variáveis
	private static int PoltronaA[][] = new int[8][12];
	private static int PoltronaB[][] = new int[8][12];
	private static int[][] LadoOcupadoA = new int[8][12];
	private static int[][] LadoOcupadoB = new int[8][12];
	private static char ladoEscolhido;
	private static int lugarEscolhido = 0;
	private static boolean ingressoValido;
	private static int contaddorA = 1;
	private static int contadorB = 1;
	private static int IngressoVendido = 0;
	private static char opcao = 'S';
	static Timer timer;
	private static Scanner PoltronaEscolhida = new Scanner(System.in);
	
	public static void main(String[] args) {
		Timer(120);
		criarMatriz();
		escolhaPoltrona();
		imprimiPoltronas();
		EscolhaN();
	}	

	// Criar as duas matrizes
	public static void criarMatriz() {
		for(int linha = 0; linha < PoltronaA.length; linha++) {
			for(int coluna = 0; coluna < PoltronaA[linha].length; coluna++) {	
				PoltronaA[linha][coluna] = contaddorA++;
			}
			for(int coluna = 0; coluna < PoltronaB[linha].length; coluna++) {
				PoltronaB[linha][coluna] = contadorB++;
			}
		}
	}	
	
	// Mostrar as poltronas na tela
		public static void imprimiPoltronas() {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.println("------------------------------CINEMA DO SANDROLA--------------------------------");
			System.out.println("--------------LADO A----------------------------------------LADO B--------------");
			for(int linha = 0; linha < PoltronaA.length; linha++) {
				for(int coluna = 0; coluna < PoltronaA[linha].length; coluna++) {
					if(PoltronaA[linha][coluna] == LadoOcupadoA[linha][coluna]) {
						System.out.print("XX ");
					}
					if(PoltronaA[linha][coluna] != LadoOcupadoA[linha][coluna]) {
						if(PoltronaA[linha][coluna] < 10) {
							System.out.print("0");
						}
						System.out.print(PoltronaA[linha][coluna] + " ");
					}
				}		
				System.out.print("       ");		
				for(int coluna = 0; coluna < PoltronaB[linha].length; coluna++) {
					if(PoltronaB[linha][coluna] == LadoOcupadoB[linha][coluna]) {
						System.out.print("XX ");
					}
					if(PoltronaB[linha][coluna] != LadoOcupadoB[linha][coluna]) {
						if(PoltronaB[linha][coluna] < 10) {
							System.out.print("0");
						}
						System.out.print(PoltronaB[linha][coluna] + " ");
					}
				}	
				System.out.println();
			}
			System.out.println("----------------------O filme iniciará em 2 minutos!----------------------------");
			System.out.println("--------------------------------------------------------------------------------");
		}
	
	// Escolha da poltrona e venda do ingresso
	private static void escolhaPoltrona() {
		while(opcao == 'S') {
			imprimiPoltronas();
			System.out.println("Escolha o lado desejado [A/B]: ");		
			ladoEscolhido = PoltronaEscolhida.next().charAt(0);
			System.out.println("Escolha a poltrona desejada: ");
			lugarEscolhido = PoltronaEscolhida.nextInt();
			ingressoValido = true;
			if(ladoEscolhido == 'A') {
				for(int linha = 0; linha < LadoOcupadoA.length; linha++) {
					for(int coluna = 0; coluna < LadoOcupadoA[linha].length; coluna++) {
						if(lugarEscolhido == LadoOcupadoA[linha][coluna]) {
							System.out.println("Escolha uma poltrona que esteja vazia! ");
							System.out.println();
							ingressoValido = false;
						}
					}
				}
			} else if(ladoEscolhido == 'B') {	
				for(int linha = 0; linha < LadoOcupadoB.length; linha++) {
					for(int coluna = 0; coluna < LadoOcupadoB[linha].length; coluna++) {
						if(lugarEscolhido == LadoOcupadoB[linha][coluna]) {
							System.out.println("Escolha uma poltrona que esteja vazia! ");
							System.out.println();
							ingressoValido = false;
						}
					}
				}
			} else {
				System.out.println("Lado digitado inválido, escolha entre (A ou B)!");
				ingressoValido = false;
			}
				if(lugarEscolhido > 96 || lugarEscolhido <= 0) {
				System.out.println("Poltrona inválida, escolha entre (1 e 96)!");
			} else
			if(ingressoValido == true) {	
				IngressoVendido++;
				System.out.println("Ingresso comprado!");
			}	
			validarPoltrona();
			System.out.println();
			System.out.println("O filme iniciara em menos de 2 minutos!");
			System.out.println("Deseja comprar outra poltrona? [S/N]");
			opcao = PoltronaEscolhida.next().charAt(0);
			System.out.println();
		}	
	}

	// Validar as poltronas
	private static void validarPoltrona() {
		if(ladoEscolhido == 'A') {
			for(int linha = 0; linha < PoltronaA.length; linha++) {
				for(int coluna = 0; coluna < PoltronaA[linha].length; coluna++) {
					if(lugarEscolhido == PoltronaA[linha][coluna]) {
						LadoOcupadoA[linha][coluna] = lugarEscolhido;
					}
				}	
			}
		} else if(ladoEscolhido == 'B') {
			for(int linha = 0; linha < PoltronaB.length; linha++) {
				for(int coluna = 0; coluna < PoltronaB[linha].length; coluna++) {
					if(lugarEscolhido == PoltronaB[linha][coluna]) {
						LadoOcupadoB[linha][coluna] = lugarEscolhido;
					}
				}	
			}
		}
	}
	
	//Timer de 2 minutos para o filme iniciar
	public static void Timer(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds*1000);
    }

    public static class RemindTask extends TimerTask {
        public void run() {
            System.out.println("O filme começou, bom filme!");
            timer.cancel();
            System.out.println("Foram vendidos " + IngressoVendido + " ingressos");
            System.exit(0);
        }
    }
    
    //Caso usúario não queira mais comprar poltronas
    public static void EscolhaN() {
    	System.out.println("O Filme iniciará em menos de 2 minutos!");
    	System.out.println("Obrigado por escolher o Cinema do Sandrola, agradeçemos sua preferência!");
    	System.out.println("Aguarde em sua poltrona até que o filme se inicie!");
    }
	
}