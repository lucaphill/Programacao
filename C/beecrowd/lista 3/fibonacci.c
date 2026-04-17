/*
Luca Borges
Programa: mostra a sequencia de Fibonacci até o numero escolhido
*/
#include <stdio.h>

int main (void){

    int num, d, ultimo1=1, ultimo2=0;
    scanf("%d",&num);

    if (num == 1){
        printf("0\n");
    } else if (num == 2){
        printf("0 1\n");
    } else{

        printf("0 1");
        for(int i = 2; i < num; i++){
            int temp;

            d = ultimo1 + ultimo2;

            printf(" %d",d);

            temp = ultimo1;
            ultimo1 = d;
            ultimo2 = temp;

            
        }
        printf("\n");

    }
    return 0;
}