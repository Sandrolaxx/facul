#include<stdio.h>
#include<stdlib.h>

void funcao1(void);

void funcao2(void);

int main()
{
	/* code */
	funcao1();
	funcao2();
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

