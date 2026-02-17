/*
Luca Borges
Programa: numeros no intervalo de [1,1000] que terminam com 4 e divisiveis por 6
*/
#include <stdio.h>
int main(void){
    
    for(int i = 1; i <= 1000; i++){
        if (i % 10 == 4 && i % 2 == 0 && i % 3 == 0){
            printf("%d\n", i);

        };

    };
    return 0;
}