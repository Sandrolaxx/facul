#include <stdio.h>
#include <conio.h>
#include <string.h>
#include <ctype.h>

int main(void) {
  int i;
  char texto[31];
  scanf("%s", &texto);
  fflush(stdin);

  printf("Valor da variavel texto = %s\n", texto);

  //Percorrendo o vetor de char e mostrando
  //cada elemento individualmente
  for (i=0; i<strlen(texto); i++) {

    //printf("Valor do elemento %d da string = %c\n",i, texto[i]);
    while (!isalnum(texto[i])){
        printf("num é alfanumerico opora, digita dnv 10graça: ");
        scanf("%s", &texto);
        fflush(stdin);
        if (isalnum(texto[i])){
            break;
        }
    }
  }
  getch();
  return 0;
}
