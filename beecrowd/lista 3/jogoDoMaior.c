/*
Luca Borges
Programa: brincadeira de homens das cavernas? kkk que isso beecrowd
*/
#include <stdio.h>

int main(void){
    int rodada=1, a=1, b=1;
    int contadorA=0, contadorB=0;

    while (1){
        scanf("%d", &rodada);

        if (rodada == 0){
            break;
        }

        for(int i = 0; i < rodada; i++){
            scanf("%d %d",&a,&b);

            if (a>b){
                contadorA ++;
            } else if (b>a){
                contadorB ++;
            } else {
                // nada acontece
            }
        }
        printf("%d %d\n", contadorA, contadorB);
        contadorA=0;
        contadorB=0;

    }
    
    


    return 0;
}