/*
Luca Borges
Programa: um programa que lidentifica se um n° é primo
*/
#include<stdio.h>
int main(void){

    int j, k;
    k = 0;

    puts("insira um numero para verificar se ele eh primo:");
    scanf("%d", &j);

    for (int i = 1; i < j; i++){
        if (j%i == 0){
            k ++;
        }
    }
    if (k == 1){
        printf("%d eh primo\n", j);
    } else {
        printf("%d nao eh primo\n", j);

    }

    return 0;
}