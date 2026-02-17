/*
Luca Borges
Projeto: beecrowd lista 2-numeros primos
*/
#include <stdio.h>

int main(void){
    //definindo variaveis
    int teste, valor,soma;
    soma = 0;

    //imput
    scanf("%d",&teste);
    //programa
    for (int i=1; i <= teste; i++){
        scanf("%d",&valor);
        soma = 0;
        for (int j = 1; j < valor; j++){

            if (valor%j == 0){
                soma = soma + j;
            };
        };

        if (soma == 1){
            printf("%d eh primo\n",valor);
        } else {
            printf("%d nao eh primo\n", valor);

        };

    };
    return 0;
}