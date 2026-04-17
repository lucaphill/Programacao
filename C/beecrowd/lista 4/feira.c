/*
Luca Borges
Programa: Vamos a feita comprar frutas
*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void){
    int testes, frutas, comprar;
    char num1[100][60], numCompra[100][60], palavras[100][60], palavra2[100][60];
    double resultado[100], soma = 0;

    scanf("%d", &testes);

    for(int i = 0; i < testes; i++){
        soma = 0;
        scanf("%d", &frutas);
        for(int j = 0; j < frutas; j++){
            scanf("%s", palavras[j]);
            scanf("%s", num1[j]);
        }

        scanf("%d", &comprar);
        for(int j = 0; j < comprar; j++){
            scanf("%s", palavra2[j]);
            scanf("%s", numCompra[j]);
        }

        for(int j = 0; j < comprar; j++){
            for(int k = 0; k < frutas; k++){
                if(strcmp(palavra2[j], palavras[k]) == 0){
                    resultado[j] = strtod(num1[k], NULL) * strtod(numCompra[j], NULL);
                }
            }
        }
         


        for(int j = 0; j < comprar; j++){
            soma += resultado[j];
        }
        printf("R$ %.2lf\n", soma);
        


    }

    return 0;
}