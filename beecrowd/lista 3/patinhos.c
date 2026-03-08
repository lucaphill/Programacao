/*
Luca Borges
Programa: subtrai um pato 
*/
#include <stdio.h>

int main(void){
    unsigned long long int patos=0;

    while (1){
        scanf("%llu",&patos);
        if (patos == 18446744073709551615){
            break;
        } else if (patos == 0){
            printf("%llu\n",patos);
        } else {
            printf("%llu\n", patos -1);
        }

    }
    


    return 0;
}