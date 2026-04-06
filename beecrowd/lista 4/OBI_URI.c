/*
Luca Borges
Programa: Indentifica e corrige palavras (uma letra e tamanho fixo)
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

        if(i > 0) printf(" ");
        printf("%s", palavra);
    }
    printf("\n");
    return 0;
}