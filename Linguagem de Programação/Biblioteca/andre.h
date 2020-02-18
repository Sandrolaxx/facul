#include <stdio.h>

void escreveUmaFrase(){
	printf("\n Uma frase qualquer......");
}

void funcao1(void){
	int i;
	i = 10;
	int j;
	j = 20;
	printf(" \n %d, %d", i, j);
}

void funcao2(void){
	int i;
	i = 24;
	int j;
	j = 11;
	printf(" \n %d, %d", i, j);
}

void exemplosDePrints(){
	printf(" \n %5d ", 350);
	
	//Arredonda
	printf(" \n %4.2f" , 3456.789 );
	
	//alinhamento
	printf(" \n %10.2f %10.2f %10.2f ", 8.0, 15.3, 584.13);

	//Zeros a esquerda
	printf(" \n %04d ", 21);

	//caracteres
	printf("\n %d %c %x %o \n ", 'A', 'A', 'A', 'B');
}

void iniciandoComandoScanf(){
	float anos, dias;
	printf("\n Digite sua idade em anos: ");
	fflush(stdout);
	scanf("%f", &anos);
	dias = anos * 365;
	printf("\n Sua idade em dias eh: %.0f",dias);
}

void converteCaracterEmDecimalHexaDecimal(){
	char a;
	printf("\n Digite um caractere e veja-o em decimal, octal e hexadecimal:");
	scanf("%c", &a);
	printf("\n %c em decimal = %d, octal = %o e hexadecimal = %x\n", a, a, a, a);
	
}

void LeMeuNome_MostraMeuNome(){
	char meuNome[51];
	
	printf("\n Informe seu nome com ateh 50 caracteres: ");
	scanf("%s", meuNome);
	
	printf("\n O nome informado eh %s", meuNome);
	
}

void calculaAreaRetangular(float altura, float base){
	printf("A area deste terreno eh: %.2f", altura*base);
}

int calculaQuantasFerraduras(int quantidadeCavalos){
	return quantidadeCavalos * 4;
}


void EscreveNaTela(char mensagem[250]){
	printf(mensagem);
}

void EscreveNaTelaDoisParametros(char mensagem[250], float valor){
	printf(mensagem, valor);
}

void calculaQuantosLitrosAbasteceu(float precoGasolina, float valorPagamento, float *galao){
	//float temp;
	
	*galao = (valorPagamento / precoGasolina);	
	//*valorPagamento = 0;
	//*precoGasolina = 0;
	//printf("\n Dentro do calculaQuantosLitrosAbasteceu");
	//printf("\n Valor pago dentro da funcao %f", *valorPagamento);
	//printf("\n Preco gasolina dentro da funcao %f", *precoGasolina);
	//return temp;

}

float getValorFlutuante(){
	float temp;
	scanf("%f", &temp);
	return temp;
}

int getValorInteiro(){
	int temp;
	scanf("%d", &temp);
	return temp;
}
