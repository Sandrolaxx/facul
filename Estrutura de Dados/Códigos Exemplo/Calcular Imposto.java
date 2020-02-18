package com.teste;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teste {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		
		// Cálculo de impostos
		Locale.setDefault(Locale.US);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
    
		System.out.print("\nInforme o valor do faturamento:\t");
		double faturamento = entrada.nextDouble();
		double valor_cofins = faturamento * Constantes.COFINS / 100;
		double valor_pis = faturamento * Constantes.PIS / 100;
		double total_impostos = valor_cofins + valor_pis;
		
		System.out.println("COFINS (3%):\t" + nf.format(valor_cofins));
		System.out.println("PIS (0,65%):\t" + nf.format(valor_pis));
		System.out.println("TOTAL:\t\t" + nf.format(total_impostos));
		System.out.println();
		
/*		
		// Caracteres para números
		
		System.out.print("\nInforme um caractere:\t");
		String texto = entrada.nextLine();
		char caractere = texto.charAt(0);
		int codigo = caractere;
		
		System.out.println("Código do caractere:\t" + codigo);
		System.out.println();		


		// Números para caracteres
	    System.out.print("\nInforme um número inteiro:\t");
		String texto = entrada.nextLine();
		int numero = Integer.parseInt(texto);
		char caractere = (char)numero;
		
		System.out.println("Caractere correspondente:\t" + caractere);
		System.out.println();
		
		// Conversão de números
		int inteiro = -1563524312;
		long longo = inteiro;
		float flutuante = inteiro;
		short curto = (short) inteiro;

		double dobro = 24.75;
		int inteiro2 = (int) dobro;
		int inteiro3 = (int) Math.round(dobro);
    
		String mensagem = "Conteúdo das variáveis:\n" +
	      "inteiro = \t" + inteiro + "\n" + "longo = \t" + longo + "\n" + 
	      "flutuante = \t" + flutuante + "\n" + "curto = \t" + curto + "\n\n" +
	      "dobro = \t" + dobro + "\n" + "inteiro2 = \t" + inteiro2 + "\n" +
	      "inteiro3 = \t" + inteiro3;
    
		JOptionPane.showMessageDialog(null, mensagem);
		System.exit(0);		
		
		
		
		// Números em texto
		String stringInteiro, stringDecimal;
		double numeroDecimal;
		int numeroInteiro;

		System.out.print("\nInforme um número inteiro: ");
		numeroInteiro = entrada.nextInt();

		System.out.print("Informe um número decimal: ");
		numeroDecimal = entrada.nextDouble();

		stringInteiro = String.valueOf(numeroInteiro);
		stringDecimal = String.valueOf(numeroDecimal);

		System.out.println("\nConteúdo das strings:" + 
				"\n stringInteiro = \t" + stringInteiro
				+ "\n stringDecimal = \t" + stringDecimal);
		System.out.println();	



		// Texto em números
		System.out.print("\nInforme um número: ");
		String texto = entrada.nextLine();

		double dobro = Double.parseDouble(texto);
		float flutuante = Float.parseFloat(texto);
		long longo = Long.parseLong(texto);
		int inteiro = Integer.parseInt(texto);
		short curto = Short.parseShort(texto);
		byte unidade = Byte.parseByte(texto);
		char caractere = (char) Integer.parseInt(texto);

		System.out.printf(
				"\nConteúdo das variáveis:" + "\n dobro = \t %f \n flutuante = \t %f \n longo = \t %d \n inteiro = \t %d"
						+ "\n curto = \t %d \n unidade = \t %d \n caractere = \t %c \n\n",
				dobro, flutuante, longo, inteiro, curto, unidade, caractere);		
				
					

		
		
		// Número decimais
		float flutuante1, flutuante2;
		double dobro1 = 5.123456789, dobro2 = 10.0;

		flutuante1 = 1.02F;
		flutuante2 = 2.0F;
		
		String mensagem = "Conteúdo das variáveis:" + "\nflutuante1 = " + flutuante1 + "\nflutuante2 = " + flutuante2
				+ "\ndobro1 = " + dobro1 + "\ndobro2 = " + dobro2;

		JOptionPane.showMessageDialog(null, mensagem);
		System.exit(0);


		// Números inteiros
		byte unidade;
		short curto;
		int inteiro;
		long longo;

		unidade = 127;
		curto = 32767;
		inteiro = 2147483647;
		longo = 9223372036854775807L;

		System.out.println("\nLimite superior:");
		System.out.println("byte:\t" + unidade);
		System.out.println("short:\t" + curto);
		System.out.println("int:\t" + inteiro);
		System.out.println("long:\t" + longo);

		unidade = -128;
		curto = -32768;
		inteiro = -2147483648;
		longo = -9223372036854775808L;

		System.out.println("\nLimite inferior:");
		System.out.println("byte:\t" + unidade);
		System.out.println("short:\t" + curto);
		System.out.println("int:\t" + inteiro);
		System.out.println("long:\t" + longo);
*/		
	}
}

class Constantes {
  static final double COFINS = 3.0;
  static final double PIS = 0.65;
}