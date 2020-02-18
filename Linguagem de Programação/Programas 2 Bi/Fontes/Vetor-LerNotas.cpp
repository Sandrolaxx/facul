#include<stdio.h>
#include <stdlib.h>

float media (int n, float *vnotas);


main (void){
  float vnotas[10];
  float media_notas;
  int i;
  
  /* leitura das notas */
  for (i = 0; i < 10; i++){
    printf("Digite os valores das notas: ");
    scanf("%f", &vnotas[i]);
  }
  
  printf("\n Antes de chamar a fun...\n");
  for (i = 0; i < 10; i++){
    printf("%f", vnotas[i]);
	printf(" | ");
  }   
  //chamada da função
  media_notas = media(10,vnotas);
  
  printf ( "\nMedia = %.1f \n", media_notas );
  printf("\n Depois de chamar a fun...\n");
  
  for (i = 0; i < 10; i++){
    printf("%.1f", vnotas[i]);
	printf(" | ");
  }  
  system("pause");
  return 0;
}

float media (int n, float *vnotas){
  int i;
  float m = 0, soma = 0;
  
  //fazendo a somatória das notas
  	for (i = 0; i < n; i++){
    	soma = soma + vnotas[i];
    	vnotas[i] = i;
	}
  //dividindo pela quantidade de elementos n
  m = soma / n;
  
  //retornando a média
  return m;
}
