package SandroMatheusRamos;

import TermometroPrincipal.Termometro;
import TrabalhoBoletim.Notas;
import CinemaPrincipal.Cinema;
import TrabalhoCalculadora.Calculadora;
import java.util.Scanner;

	public class Menu {
		public static void main(String[] args) {
			Calculadora calculadora = new Calculadora();
			Notas notas = new Notas();
			Termometro temperatura = new Termometro();
			Cinema cinema = new Cinema();
			Scanner trabalhos = new Scanner (System.in);
			Scanner escolha = new Scanner (System.in);
			int TrabalhoEscolhido;
			String NovaConsulta;
			
			do {
				System.out.println("|--------------------------| ");
				System.out.println("|          MENU            |");
				System.out.println("|--------------------------|  ");
				System.out.println("| [1] Calculadora          |");
				System.out.println("| [2] Boletim Escolar      |");
				System.out.println("| [3] Conversor Temperatura|");
				System.out.println("| [4] Cinema               |");
				System.out.println("| [5] Sair                 |");
				System.out.println("|--------------------------| ");
				do {
					System.out.print("Escolha uma das opções: ");
					TrabalhoEscolhido = trabalhos.nextInt();
					if(TrabalhoEscolhido == 1 || TrabalhoEscolhido == 2 || TrabalhoEscolhido ==3 || TrabalhoEscolhido == 4 || TrabalhoEscolhido == 5 ) {
						break;
					} else {
						System.out.print("Opção inválida! ");
					}
				}
				while(TrabalhoEscolhido != 1 || TrabalhoEscolhido != 2 || TrabalhoEscolhido !=3 || TrabalhoEscolhido != 4 || TrabalhoEscolhido != 5 );
			     if (TrabalhoEscolhido == 1) {
					calculadora.Calculadora();
				} else if (TrabalhoEscolhido == 2) {
					notas.Notas();
				  } else if (TrabalhoEscolhido == 3) {
					  temperatura.Termometro();
				    } else if (TrabalhoEscolhido == 4) {
				    	cinema.cinema();
				      } else if(TrabalhoEscolhido == 5) {
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

