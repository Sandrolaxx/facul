#include <locale.h>
#include <stdio.h>
//Fun��o da Soma
double soma(double n1,double n2){
    double Soma;
  	  Soma = n1 + n2;
	return Soma;
}

//Procedimento da subtra��o
double subtracao(double n1,double n2){

printf("Digite o valor do primeiro n�mero: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo n�mero: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da subtra��o � %.2lf\n",(n1-n2));
}

//Fun��o da Divis�o
double divisao(double n1,double n2){
    double Div;
  	  Div = n1 / n2;
	return Div;
}

//Procedimento da multiplica��o
double multiplicacao(double n1,double n2){

printf("Digite o valor do primeiro n�mero: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo n�mero: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da subtra��o � %.2lf\n",(n1*n2));

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
    printf("|   1 - ADI��O           |\n");
    printf("|   2 - SUBTRA��O        |\n");
    printf("|   3 - DIVIS�O          |\n");
    printf("|   4 - MULTIPLICA��O    |\n");
    printf("|   5 - SAIR             |\n");
    printf("-------------------------\n");
    scanf("%d",&OperacaoEscolhida);


 switch(OperacaoEscolhida){

	case 1:
	printf("Digite o valor do primeiro n�mero: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo n�mero: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da soma � %.2lf\n",soma(n1,n2));
        break;

    	case 2:
	subtracao(n1,n2);
    	break;

    	case 3:
    	printf("Digite o valor do primeiro n�mero: ");
		fflush(stdout);
		scanf("%lf", &n1);
	printf("Digite o valor do segundo n�mero: ");
		fflush(stdout);
		scanf("%lf", &n2);

	printf("O resultado da divis�o � %.2lf\n",divisao(n1,n2));
    	break;

    	case 4:
	multiplicacao(n1,n2);
    	break;

    case 5:
	printf("Obrigado por usar nossa aplica��o!\n");
    break;

	default:
     printf("Digite um numero v�lido!\n");
    break;
 }
 printf("Deseja realizar uma nova opera��o?[S/N]");
 fflush(stdin);
 scanf("%c", &escolha);
 }while(escolha == 'S');

}
