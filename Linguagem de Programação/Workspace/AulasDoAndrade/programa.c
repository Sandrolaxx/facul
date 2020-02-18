#include<stdio.h>
#include <stdlib.h>
#define TAM_MAX 5

void leituraDosVetores(int vetorIdade[TAM_MAX],float vetorAltura[TAM_MAX]);
void imprimeInvertido(int novamenteOVetor[TAM_MAX], float novamenteOVetorX[TAM_MAX]);

int main(){
	int idade[5];
	float altura[5];

	leituraDosVetores(idade, altura);
	imprimeInvertido(idade, altura);
  system("pause");
  return 0;
}


void leituraDosVetores(int vetorIdade[TAM_MAX],float vetorAltura[TAM_MAX]){
	int i;
	for(i=0; i<5; i++) {
		printf("\nInforme a idade do maluko[%d] : ",i);
		scanf("%d", &vetorIdade[i]);
		printf("\nInforme a altura do maluko[%d] :", i);
		scanf("%f", &vetorAltura[i]);
	}
}

void imprimeInvertido(int novamenteOVetor[TAM_MAX], float novamenteOVetorX[TAM_MAX]){
	int i;
	for(i=4; i>=0; i--){
		printf("\nIdade do maluko[%d] : %d",i, novamenteOVetor[i]);
		printf("\nAltura do maluko[%d] :%.2f", i, novamenteOVetorX[i]);
	}
}
