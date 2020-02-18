#include <stdio.h>
#define TAM_MAX 10

void ImprimeVet (int Tam, int Vet[TAM_MAX])	{
int i;
	for (i=0; i< Tam; i++){
  		Vet[i] = i;
	}   
	 
}

int main(){
	int Notas[TAM_MAX];
int i;
  
  for (i = 0; i < TAM_MAX; i++){
    printf("Digite os valores das notas: ");
    scanf("%d", &Notas[i]);
  }

  printf("\n Antes de chamar a func...");
  for (i = 0; i < TAM_MAX; i++){
    printf("%d | ", Notas[i]);
  }
  
  ImprimeVet(TAM_MAX, Notas); 
  
  printf("\n Depois de chamar a func...");
  for (i = 0; i < TAM_MAX; i++){
    printf("%d | ", Notas[i]);
  } 
 
  return 0;

}
