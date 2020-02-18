//Estruturas de decisão if, else,  else if
//						se, então, então se
#include <stdio.h>

int main(){
	//Declarando variáveis
	int idade;

	//Entrada
	printf("Qual é a sua idade? ");
	scanf("%d", &idade);

	//Processamento
	if(idade < 18){
			printf("Você é menor de idade. \n");
				break;

		}
	else if(idade > 18 && idade < 60){
		printf("Você é adulto. \n");
			break;
	}
	else{
			printf("Você é idoso. \n");
				break;
		}

	//Saída
	printf("Sua idade é %d\n", idade);


	return 0;
}
