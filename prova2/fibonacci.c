/*
Luca Borges
Programa: sequencia de fibonacci com array e funções
*/
#include <stdio.h>

int CalculoFibonacci(int sequencia[], int tamanho){
    int soma = 0;

    sequencia[0] = sequencia[1] = 1;

    //1,1,2,3,5,8
    for(int i = 2; i < tamanho; i++){
        sequencia[i] = sequencia[i-1] + sequencia[i-2];
        
    }
}


int main(void){
    int fibonacci[1000], numeros;

    printf("Insira quantos numeros de fibonacci vc quer: ");
    scanf("%d", &numeros);

    CalculoFibonacci(fibonacci, numeros);


    for(int i = 0; i < numeros; i++){
        printf(" %d", fibonacci[i]);

    }
    printf("\n");
}