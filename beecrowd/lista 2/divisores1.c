/*
Luca borges
Projeto: beecrowd lista 2-divisores
*/
#include <stdio.h>

int main(void){
    // definindo variaveis
    int valor, divisor;
    // pegando valor
    scanf("%d", &valor);
    // calculo
    for (int i = 1; i <= valor; i++){
        if (valor % i == 0){
            divisor = i;
            printf("%d\n", divisor);
        };
    };
}