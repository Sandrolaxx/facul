package br.edu.principal;

import java.util.Scanner;

public class calculadora
{
    public static void main (String[] args)
    {
  
        System.out.println("Operadores:+,-,/,*");
        double valor1;
        double valor2;
        String operadorMatematico;
        double resultado;

        Scanner valor = new Scanner(System.in);
        System.out.println("Informe operação desejada:");
        operadorMatematico = valor.nextLine();
        System.out.println("Informe primeiro valor:");
        valor1 = valor.nextInt();
        System.out.println("Informe segundo valor:");
        valor2 = valor.nextInt();

        if (operadorMatematico.equals("+")) 
        {
        resultado = somarValores(valor1,valor2);
        System.out.println("O valor da soma é igual a:"+resultado);
        }
    
        else if (operadorMatematico.equals("-")) 
        {
        resultado = subtrairValores(valor1,valor2);
        System.out.println("O valor da subtração é igual a:"+resultado);
        }

        else if (operadorMatematico.equals("*")) 
        {
        resultado = multiplicarValores(valor1,valor2);
        System.out.println("O valor da multiplicação é igual a:"+resultado);
        }

        else if (operadorMatematico.equals("/")) 
        {
        resultado = dividirValores(valor1,valor2);
        System.out.println("O valor da divisão é igual a:"+resultado);
        }
    }

    public static double somarValores( double valor1,double valor2){
        return valor1+valor2;
    }

    public static double subtrairValores( double valor1,double valor2){
        return valor1-valor2;
    }

    public static double dividirValores( double valor1,double valor2){
        return valor1/valor2;
    }

    public static double multiplicarValores( double valor1,double valor2){
        return valor1*valor2;
    }

} 


