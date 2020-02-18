package TrabalhoCinema;
import java.util.Scanner;

public class juuuj {

	private static int poltronasA[][] = new int[8][12];
	private static int poltronasB[][] = new int[8][12];
	private static int poltronasC[] = new int[192];
	private static int acrescentador = 1;
	private static int teste = 0;
	private static int ingressos = 0;
	
	public static void main(String[] args) {
		criarPoltronas1();
		criarPoltronas2();
		mostrarPoltronas();
		venderPoltronas();
	}
	
	private static void criarPoltronas1() {
		for (int linha = 0; linha < poltronasA.length; linha++) {
			for (int coluna = 0; coluna < poltronasA[linha].length; coluna++) {
				poltronasA[linha][coluna] = acrescentador++;
			}
		}
	}
	private static void criarPoltronas2() {
		for (int linha = 0; linha < poltronasB.length; linha++) {
				for (int coluna = 0; coluna < poltronasB[linha].length; coluna++) {
					poltronasB[linha][coluna] = acrescentador++;
				}
			}
	}
	private static void mostrarPoltronas() {
		for (int i = 0; i < poltronasA.length; i++) {
			for (int j = 0; j < poltronasA[i].length; j++) {
				imprimirPZero(i, j);
				System.out.print(poltronasA[i][j] + " ");
			}
			System.out.print("\t");
			for (int j = 0; j < poltronasB[i].length; j++) {
				System.out.print("P");
				if(poltronasB[i][j] < 100) {
					System.out.print(0);
				}
				System.out.print(poltronasB[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void venderPoltronas() {
		String pergunta;
		int j = 0;
		Scanner resposta = new Scanner(System.in);
		Scanner numPoltrona = new Scanner(System.in);
		for (int i = 0; i <= 192; i++) {
			System.out.print("\nDeseja comprar um ingresso? [S/N] ");
			pergunta = resposta.nextLine();
			if (pergunta.equals("S")) {
				System.out.print("\nEm qual seção deseja comprar a poltrona [A/B] ");
				pergunta = resposta.nextLine();
				if (pergunta.equals("A")) {
					imprimirCaracterePoltronaCompradaA(i,j);
				}
				if (pergunta.equals("B")) {
					imprimirCaracterePoltronaCompradaB(i,j);
				}
				System.out.print("Informe qual poltrona deseja: P");
				poltronasC[i] = numPoltrona.nextInt();
				System.out.println();
				ingressos = ingressos + 1;	
			}
			else if (pergunta.equals("N")) {
				System.out.println("Total de ingressos vendidos: " + ingressos);
				break;
			}
			
			imprimirPoltronasCompradas(i, j);
		}
	}
	
	
	private static void imprimirCaracterePoltronaCompradaA(int i, int j) {
		for (int posicao = 0; posicao < poltronasC.length; posicao++) {
			if(poltronasC[posicao] <= 96) {
				if (poltronasA[i][j] == poltronasC[posicao]) {
					System.out.print("PXX ");
					teste = poltronasC[posicao];
				} 
			}	
		}
	}
	private static void imprimirCaracterePoltronaCompradaB(int i, int j) {
		for (int posicao = 0; posicao < poltronasC.length; posicao++) {
			
			if(poltronasC[posicao] >= 97) {
				if (poltronasB[i][j] == poltronasC[posicao]) {
					System.out.print("PXXX ");
					teste = poltronasC[posicao];
				}
			}
		}
	}
	
	private static void imprimirPoltronasCompradas(int i, int j) {
		for (i = 0; i < poltronasA.length; i++) {
			for ( j = 0; j < poltronasA[i].length; j++) {
				imprimirCaracterePoltronaCompradaA(i, j);
				if(poltronasA[i][j] != teste) {
					imprimirPZero(i, j);
					System.out.print(poltronasA[i][j] + " ");
				}
			}
			System.out.print("\t");
			for (j = 0; j < poltronasB[i].length; j++) {
				imprimirCaracterePoltronaCompradaB(i, j);
				if(poltronasB[i][j] != teste) {
					System.out.print("P");
					if(poltronasB[i][j] < 100) {
						System.out.print(0);
					}
					System.out.print(poltronasB[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	private static void imprimirPZero(int i, int j) {
		System.out.print("P");
		if (poltronasA[i][j] < 10) {
			System.out.print(0);
		}
	}
	
}