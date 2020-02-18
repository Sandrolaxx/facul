package CalculadoraTermometro;

import java.text.DecimalFormat;

public class CalculadoraTemperatura {
	double valorTemperatura;
	DecimalFormat formatador = new DecimalFormat("0.00");
	
	public double armazenarTemperatura(double  valorPrimeiraTemperatura) {
		valorTemperatura =  valorPrimeiraTemperatura;
		return 0.0;
	}
	
	public String calcularTemperaturas(String primeiraTemperatura, String segundaTemperatura) {
		double resultadoConversao;
		if(primeiraTemperatura.equals("C") && segundaTemperatura.equals("F")) {
			resultadoConversao = (valorTemperatura*1.8) + 32;
			System.out.println("| " + valorTemperatura + "°C é o equivalente a " + formatador.format(resultadoConversao) + "°F |");
		} else if(primeiraTemperatura.equals("C") && segundaTemperatura.equals("K")) {
			resultadoConversao = valorTemperatura + 273.15;
			System.out.println("| " + valorTemperatura + "°C é o equivalente a " + formatador.format(resultadoConversao) + "K |");
		} else if(primeiraTemperatura.equals("F") && segundaTemperatura.equals("C")) {
			resultadoConversao = (valorTemperatura - 32) * 5/9;
			System.out.println("| " + valorTemperatura + "°F é o equivalente a " + formatador.format(resultadoConversao) + "°C |");
		} else if(primeiraTemperatura.equals("F") && segundaTemperatura.equals("K")) {
		    resultadoConversao = (valorTemperatura - 32) * 5/9 + 273.15;
			System.out.println("| " + valorTemperatura + "°F é o equivalente a " + formatador.format(resultadoConversao) + "K |");
		} else if(primeiraTemperatura.equals("K") && segundaTemperatura.equals("C")) {
		    resultadoConversao = valorTemperatura - 273.15;
		    System.out.println("| " + valorTemperatura + "K é o equivalente a " + formatador.format(resultadoConversao) + "°C |");
		} else if(primeiraTemperatura.equals("K") && segundaTemperatura.equals("F")) {
		    resultadoConversao = (valorTemperatura - 273.15) * 9/5 + 32;
			System.out.println("| " + valorTemperatura + "K é o equivalente a " + formatador.format(resultadoConversao) + "°F |");
		}
		return "0";
	}
}
