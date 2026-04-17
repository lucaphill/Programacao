/*
Luca Borges
Programa: corrige palavras, dessa vez de verdade
*/
#include <stdio.h>
#include <string.h>


int main(void){
    char palavraerrada[33];
    int tamanho, i, j;
    char *p1, *p2;

    while (scanf("%s", palavraerrada) == 1){
        tamanho = strlen(palavraerrada);

        for (i = tamanho/2; i > 1; i--){
           if(strncmp(palavraerrada +(tamanho-i), palavraerrada + (tamanho -2*i), i) == 0){
            palavraerrada[tamanho -i] = '\0';
            break;
           }
        }


    printf("%s\n", palavraerrada);
    }

    return 0;
}