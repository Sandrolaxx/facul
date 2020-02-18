package TermometroPrincipal;

import java.util.Scanner;

import CalculadoraTermometro.CalculadoraTemperatura;

public class Termometro {

	public static void Termometro() {
		String primeiraTemperatura, segundaTemperatura;
		Scanner UnidadeTemperatura = new Scanner(System.in);
		double valorPrimeiraTemperatura;
		Scanner Valortemperatura = new Scanner(System.in);
		String unidadesTemperatura;
		CalculadoraTemperatura calculo = new CalculadoraTemperatura();
		double armazenar;
		
		System.out.println("|--------------------------|");
		System.out.println("|CALCULADORA DE TEMPERATURA|");
		System.out.println("|--------------------------|");
		System.out.println("|     [C] Celsius      	   |");
		System.out.println("|     [F] Fahrenheitt      |");
		System.out.println("|     [K] Kelvin           |");
		System.out.println("|--------------------------|");
		
		do {
			System.out.print("Informe a unidade de temperatura: ");
			primeiraTemperatura = UnidadeTemperatura.nextLine();
			if(primeiraTemperatura.equals("C") || primeiraTemperatura.equals("F") || primeiraTemperatura.equals("K")) {
				break;
			}
			else if(primeiraTemperatura != "C" || primeiraTemperatura != "F" || primeiraTemperatura != "K") {
			System.out.println("Unidade de temperatura inv�lida!");
			}
		} while(primeiraTemperatura != "C" || primeiraTemperatura != "F" || primeiraTemperatura != "K");
		
		System.out.print("Informe o valor da temperatura: ");
		valorPrimeiraTemperatura = Valortemperatura.nextDouble();
		armazenar = calculo.armazenarTemperatura(valorPrimeiraTemperatura);
		
		do {
			System.out.print("Informe a unidade de temperatura para convers�o: ");
			segundaTemperatura = UnidadeTemperatura.nextLine();
			while(segundaTemperatura.equals(primeiraTemperatura)) {
				System.out.print("A unidade atual e para convers�o s�o iguais.\nInforme-a novamente: ");
				segundaTemperatura = UnidadeTemperatura.nextLine();
			}
			if(segundaTemperatura.equals("C") || segundaTemperatura.equals("F") || segundaTemperatura.equals("K")) {
				break;
			}
			else if(segundaTemperatura != "C" || segundaTemperatura != "F" || segundaTemperatura != "K") {
				System.out.println("Unidade de temperatura inv�lida!");
			}
		} while(segundaTemperatura != "C" || segundaTemperatura != "F" || segundaTemperatura != "K");
		
		System.out.println("|----------------------------------|");
		unidadesTemperatura = calculo.calcularTemperaturas(primeiraTemperatura, segundaTemperatura);
		System.out.println("|----------------------------------|");
	}

}
