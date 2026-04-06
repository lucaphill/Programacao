/*
Luca Borges
Programa: dado uma sequencia de numeros, organizar ela em ordem crescente
*/
#include<stdio.h>
#include<string.h>

int main(void){
    int testes, i, trocou = 1;
    while (scanf("%d", &testes) == 1){
        // declarado com um a mais para ser uma variavel reserva temporaria
        char numero[1005][6];

        for(i = 0; i < testes; i++){
            scanf("%s", numero[i]);
        }
        trocou = 1;

        while(trocou){
            trocou = 0;
            for(i = 0; i < testes -1 ; i++){
                if(strcmp(numero[i], numero[i+1]) > 0){
                    strcpy(numero[1004], numero[i]);
                    strcpy(numero[i], numero[i+1]);
                    strcpy(numero[i+1], numero[1004]);
                    trocou = 1;
                }
            }
        }
        for(i = 0; i < testes; i++){
            printf("%s\n", numero[i]);
        }
    }

    return 0;
}