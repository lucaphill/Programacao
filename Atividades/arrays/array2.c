/*
Luca Borges
Programa: mais operações com arrays
*/
#include <stdio.h>


float MediaArray(int array[], int tamanho){
    float soma=0;
    for (int i = 0; i < tamanho; i++){
        soma += array[i];
    }

    return soma / tamanho;
}


int EmArray(int numero, int array[], int tamanho){
    
    for(int i = 0; i < tamanho; i++){
        if(numero == array[i]){
            return 1;
        }
    }

    return 0;
}


int MaximoValorArray(int array[], int tamanho){
    int max;
    for (int i = 0; i < tamanho; i++){
        if(max < array[i]){
            max = array[i];
        }
    }
    
    return max;
}


int EhArrayOrdenado(int array[], int tamanho){
    int crescente = 1, decrescente = 1;

    for (int i = 1; i <= tamanho; i++){
        // 1,2,3,4
        if(array[i-1] < array[i]){
            decrescente = 0;

        }
        if(array[i-1] > array[i]){
            crescente = 0;
        }

    }
    if(crescente == 1 || decrescente == 1){
        return 1;
    } else if(crescente == 0 && decrescente == 0){
        return 0;
    }
}


int main(void){
    int ar[10], i, num;
    int soma, tamanho = 10;
    int maiorValor;
    float media;

    for(i = 0; i < 10; i++){
        printf("Insira um valor para o elemento %d:\n", i+1);
        scanf("%d", &ar[i]);

    }

    printf("\n");
    for(i = 9; i >= 0; i--){
        printf("ar[%d] = %d\n", i, ar[i]);
    }

    printf("\nar[4] = %d\n", ar[4]);

    printf("\n");
    for(i = 0; i < 10; i++){
        if(i%2 != 0){
            printf("ar[%d] = %d\n", i, ar[i]);
        }

    }
    /*
    printf("\n");
    for(i = 0; i < 10; i++){
        soma += ar[i];
    }
    printf("Soma: %d\n", soma);
    */

    //FUNÇÕES
    media = MediaArray(ar, tamanho);
    printf("\nMedia: %.1f\n", media);


    puts("Insira um valor para verificar se ele esta no array:");
    scanf("%d", &num);
    if(EmArray(num, ar, tamanho)){
        printf("O numero %d esta no array!\n", num);
    } else {
        printf("O numero %d nao esta no array!\n", num);
    }

    maiorValor = MaximoValorArray(ar, tamanho);
    printf("Maior valor: %d\n", maiorValor);


    if(EhArrayOrdenado(ar, tamanho)){
        puts("O array eh ordenado!");
    } else {
        puts("O array nao eh ordenado!");
    }


    return 0;
}