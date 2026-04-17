/*
Luca Borges
Projeto: fatorial
*/
#include<stdio.h>
int main(void){
    int n, fator = 1;
    scanf("%d", &n);

    for (n; n > 0; n--){
        fator = fator * n;

    }
    printf("%d\n", fator);

    return 0;
}