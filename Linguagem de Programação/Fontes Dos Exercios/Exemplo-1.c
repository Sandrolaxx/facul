#include<stdio.h>
#include<stdlib.h>
#include "sandrolax.h"

void funcao1(void);

void funcao2(void);

int main()
{
	/* code */
	float recebeSoma;
	funcao1();
	funcao2();
	recebeSoma=Soma(1.0,3.0);
	printf("\n%f, %d", recebeSoma, 10);
	FimPrograma();
	system("pause");
	return 0;
}

void funcao1(void)
{
	int i;
	i=10;
	int j;
	j=20;
	printf("\n%d,%d",i,j );
}

void funcao2(void)
{
	int i;
	i=10;
	int j;
	j=20;
	printf("\n%d,%d",i,j );
}