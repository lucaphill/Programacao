/*
Luca Borges
Programa: Soma natural
*/
#include <stdio.h>

int main(void){
    unsigned long long a, b;
    scanf("%llu %llu", &a, &b);

    unsigned long long somaB = (b*(b+1)/2);
    unsigned long long somaA = (a*(a-1)/2);

    unsigned long long total = somaB - somaA;

    printf("%llu\n", total);

    return 0;
}