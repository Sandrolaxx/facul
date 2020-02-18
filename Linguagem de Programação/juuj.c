#include <stdio.h>
#include <ctype.h>
void main(){
 char c[31];
 scanf("%c", &c);
 if('A' <= c && c <= 'Z' || 'a' <= c && c <= 'z'){
    printf("teste");
 }
}