#include <locale.h>
#include <stdio.h>
//Função da Soma
double soma(double n1,double n2){
    double Soma;
  	  Soma = n1 + n2;
	return Soma;
}

//Procedimento da subtração
double subtracao(double n1,double n2){

printf("Digite o valor do primeiro número: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo número: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da subtração é %.2lf\n",(n1-n2));
}

//Função da Divisão
double divisao(double n1,double n2){
    double Div;
  	  Div = n1 / n2;
	return Div;
}

//Procedimento da multiplicação
double multiplicacao(double n1,double n2){

printf("Digite o valor do primeiro número: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo número: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da subtração é %.2lf\n",(n1*n2));

}

int main(){
	double n1;
	double n2;
	int OperacaoEscolhida;
	char escolha;
	setlocale(LC_ALL, "Portuguese");

	//Menu
	do{
    printf("-------------------------\n");
    printf("|  SANDROLAXCALCULATORV2 |\n");
    printf("-------------------------\n");
    printf("|   1 - ADIÇÃO           |\n");
    printf("|   2 - SUBTRAÇÃO        |\n");
    printf("|   3 - DIVISÃO          |\n");
    printf("|   4 - MULTIPLICAÇÃO    |\n");
    printf("|   5 - SAIR             |\n");
    printf("-------------------------\n");
    scanf("%d",&OperacaoEscolhida);


 switch(OperacaoEscolhida){

	case 1:
	printf("Digite o valor do primeiro número: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo número: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da soma é %.2lf\n",soma(n1,n2));
        break;

    	case 2:
	subtracao(n1,n2);
    	break;

    	case 3:
    	printf("Digite o valor do primeiro número: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo número: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da divisão é %.2lf\n",divisao(n1,n2));
    	break;

    	case 4:
	multiplicacao(n1,n2);
    	break;

    case 5:
	printf("Obrigado por usar nossa aplicação!\n");
    break;

	default:
     printf("Digite um numero válido!\n");
    break;
 }
 printf("Deseja realizar uma nova operação?[S/N]");
 fflush(stdin);
 scanf("%c", &escolha);
 }while(escolha == 'S');

}
