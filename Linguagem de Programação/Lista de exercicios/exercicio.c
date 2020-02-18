#include <stdio.h>
#include "C:\Matérias\Matérias 2º Semestre-2K19\Linguagem de Programação\Biblioteca\andre.h"

main() {
	int valor1;
	int nota;
	int valor2;
	int cavalos;
	float valorLitro;
	float valorPago;
	float litros;
	float f;
	double d;
	int idade;
	int valor;
	/*funcao1();
	funcao2();
	escreveUmaFrase();
	exemplosDePrints();
	fflush(stdin);
	iniciandoComandoScanf();
	fflush(stdin);
	converteCaracterEmDecimalHexaDecimal();
	fflush(stdin);
	LeMeuNome_MostraMeuNome();
	fflush(stdin);
	printf("\n Informe a base do terreno: ");
	scanf("%f", &valor1);
	fflush(stdin);
	printf("\n Informe a altura do terreno: ");
	scanf("%f", &valor2);
	calculaAreaRetangular(valor1, valor2);
	fflush(stdin);
	printf("\n Informe quantos cavalos existem no haras: ");
	scanf("%d", &cavalos);
	printf("Eh necessario %d para equipar o(s) cavalo(s)",
		calculaQuantasFerraduras(cavalos));
	EscreveNaTela("Minha frase");
	printf("Digite um float: ");
  	scanf("%f",&f);
  	printf("O float digitado foi %.20f\n",f);

  	printf("Digite um double: ");
  	scanf("%lf",&d);
  	printf("O double digitado foi %.20lf\n",d);*/


//Um motorista deseja colocar no seu tanque X reais de gasolina.
//Escreva um algoritmo para ler o preço do litro da
//gasolina e o valor do pagamento, e exibir quantos
//litros ele conseguiu colocar no tanque.
	/*EscreveNaTela("\n Informe o preco do litro de gasolina:");
	valorLitro = getValorFlutuante();
	EscreveNaTela("\n Informe o valor pago na abastecida:");
	valorPago = getValorFlutuante();

	EscreveNaTelaDoisParametros("\nLitros de gasolina antes %f",valorLitro);
	EscreveNaTelaDoisParametros("\nvalor pago antes %f",valorPago);

	calculaQuantosLitrosAbasteceu(valorLitro, valorPago, &litros);

	EscreveNaTelaDoisParametros("\nLitros de gasolina depois %f",valorLitro);
	EscreveNaTelaDoisParametros("\nvalor pago depois %f",valorPago);

	EscreveNaTelaDoisParametros("\n Foi abastecido: %f litros de gasolina", litros);

/*
//Fazer um algoritmo para verificar se um indivíduo pode
//fazer carteira de habilitação.
	EscreveNaTela("\n Informe a idade do individuo:");
	idade = getValorInteiro();

	if(idade >= 18) && (idade < 70) {
		EscreveNaTela("\n O maluko pode fazer CNH");
	} else {
		EscreveNaTela("\n O maluko nem f... pode fazer CNH");
	}
*/
/*
//Ler um número e verificar se é impa r ou par.
	EscreveNaTela("\n Informe um valor para verificar se eh par ou impar:");
	valor = getValorInteiro();
	if (valor%2==0){
		EscreveNaTela("\n O valor eh par");
	} else {
		EscreveNaTela("\n O valor eh impar");
	}
	*/

// Fazer um algoritmo que leia dois números
//inteiros e calcule o resultado da subtração do
//maior pelo menor. (USAR SELEÇAO ENCADEADA)
/*
	EscreveNaTela("\n Informe um valor1 inteiro:");
	valor1 = getValorInteiro();
	EscreveNaTela("\n Informe outro valor2 inteiro:");
	valor2 = getValorInteiro();

	if (valor1 > valor2){
		EscreveNaTelaDoisParametros("\n Subtraindo valor1-valor2 %d ",valor1-valor2);
	} else
	if (valor2 > valor1){
		EscreveNaTelaDoisParametros("\n Subtraindo valor2-valor1 %d ",valor2-valor1);
	} else
		EscreveNaTela("\n iguais %d ");
*/

//Elabore um algoritmo que dada a idade de um nadador
//classifica-o em uma das seguintes categorias e mostra na
//tela em qual destas está classificado. São elas: (USAR SELEÇAO ENCADEADA)
//infantil A = 5 - 7 anos
//infantil B = 8-10 anos
//juvenil A = 11-13 anos
//juvenil B = 14-17 anos
//adulto = maiores de 18 anos

	EscreveNaTela("Informe a idade do individuo:");
	idade = getValorInteiro();

	if ((idade >= 5) && (idade <= 7)){
		EscreveNaTela("infantil A");
	} else{
		if ((idade >= 8) && (idade <= 10)){
			EscreveNaTela("infantil B");
		} else
		if ((idade >= 11) && (idade <= 13)){
			EscreveNaTela("juvenil A");
		} else
		if ((idade >= 14) && (idade <= 17)){
			EscreveNaTela("juvenil B");
		} else
			EscreveNaTela("adulto");
	}


	if ((nota > 10) || (nota < 0)){
		EscreveNaTela("Eror!");
	} else {
		if (nota > 7){
			EscreveNaTela("Aprovado");
		} else
		if (nota <= 6){
			EscreveNaTela("Reprovado");
		}
	}

}




