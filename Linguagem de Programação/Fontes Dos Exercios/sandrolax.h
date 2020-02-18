#include <stdio.h>
#include <conio.h>
#include <stdio.h>
#include <stdlib.h>
#include <dos.h>
#include <time.h>

float Soma(float valor1, float valor2)
{
	return valor1 + valor2;
}

void FimPrograma()
{
	printf("\n Fim programa!" );
}

float CalcularTerrenoRetangulo()

	{
	float altura,base;
	do{
		printf("Digite a ALTURA do retangulo:\n\n");
		scanf("%f",&altura);
		printf("Digite a BASE do retangulo:\n\n");
		scanf("%f",&base);
		if (base == altura)
			{
			printf("Largura e altura não podem ser iguais!!!!!\n");
			}
	  }
	while(base == altura);
	printf("A area e:");
	return altura * base;

}

float CalcularFerraduras(){
	float QtdCavalo, QtdFerradura=4;
	 printf("Digite quantidade de cavalo:\n\n");
	 scanf("%f",&QtdCavalo);
	 printf("A quantidade de ferraduras utilizadas foi:\n\n");
	 return QtdCavalo * QtdFerradura;
	 	 
}
