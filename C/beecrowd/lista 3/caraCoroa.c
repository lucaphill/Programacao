/*
Luca Borges
Programa: Cara ou coroa
*/
#include <stdio.h>

int main(void){
    int jogadas=1, a,maria=0, joao=0;

    while (1){
        scanf("%d",&jogadas);
        if(jogadas == 0){
            break;
        }
        for(int i = 0; i < jogadas; i++){
            scanf("%d",&a);

            if(a == 0){
                maria ++;
            } else {
                joao++;
            }
        }
        
        printf("Mary won %d times and John won %d times\n",maria, joao);
        maria=0;
        joao=0;
    }

    return 0;
}