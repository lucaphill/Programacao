/*
Luca borges
Projeto: beecrowd lista 2-numero perfeito
*/
#include <stdio.h>

int main(void){
    // definindo variaveis
    int n, m, soma;
    soma = 0;
    n = 0;
    m = 0;

    // imput
    scanf("%d", &n);
    // calculo
    for (int i = 1; i <= n; i++){
        scanf("%d", &m);
        soma = 0;

        for (int j = 1; j < m; j++){
            if (m % j == 0)
            {
                soma = soma + j;
            };
        };

        if (soma == m){
            printf("%d eh perfeito\n", m);
        }else{
            printf("%d nao eh perfeito\n", m);
        };
    };
}