/*
Luca Borges
Programa: Correção de palavras
*/
#include <stdio.h>
#include <string.h>

int main(void){
    int contador;
    char palavra[28];
    char *obi, *uri;
    int tamanho;

    scanf("%d", &contador);
    for(int i = 0; i < contador; i++){
        scanf("%s", palavra);

        tamanho = strlen(palavra);

        obi = strstr(palavra, "OB");
        uri = strstr(palavra, "UR");

        if(tamanho == 3 && obi){
            *(obi+2) = 'I';
        } else if(tamanho == 3 && uri){
            *(uri+2) = 'I';
        }

        printf(" %s", palavra);
    }
    printf("\n");
    return 0;
}