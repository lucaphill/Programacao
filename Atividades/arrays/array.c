/*
Luca Borges
Programa: Operações com arrays
*/
#include <stdio.h>



int main(void){
    int ar[10], n, lugar;
    int i, soma = 0, media, maior = 0;

    /*
    // Exercicio n1
    for(i = 1; i <= 10; i++){
        ar[i-1] = 10*i;
        printf("ar[%d]: %d\n", i, ar[i-1]);
        soma += ar[i-1];
    }
    printf("\n");

    // valor decrescente
    for(i = 9; i >= 0; i--){
        printf("ar [%d]: %d\n", i, ar[i]);
    }
    printf("\nar[5]: %d\n", ar[5]);
    printf("\n");

    // falores impares
    for(i = 0; i <= 9; i++){
        if(i%2 == 1){
            printf("Impar ar[%d]: %d\n", i, ar[i]);
        }
    }
    printf("\nA soma dos ar[i] eh: %d\n", soma);
    */

    // EXERCICIO 2 - pega valores com o usuario
    for(i = 0; i <= 9; i++){
        printf("Insira um valor para o ar[%d]: ", i);
        scanf("%d", &ar[i]);
    }

    // EXERCICIO 3 - calculo de media
    for (i = 0; i <= 9; i++){
        soma += ar[i];
    }
    media = soma / 10;
    printf("A media dos valores eh: %d\n", media);

    // EXERCICIO 4 - procurando valores
    puts("Insira um numero para conferir se ele esta no array:");
    scanf("%d", &n);
    for(i = 0; i <= 9; i++){
        if (n == ar[i]){
            printf("Esse numero eh o mesmo do: ar[%d]\n", i);
        }
    }

    // EXERCICIO 5 - maior
    for(i = 0; i <= 9; i++){
        if (maior < ar[i]){
            maior = ar[i];
            lugar = i;
        }
    }
    printf("O maior elemento eh: %d\nEle esta no: ar[%d]\n", maior, lugar);


    return 0;
}