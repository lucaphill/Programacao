/*
Luca Borges
Programa: contando de -10-10 -> do while
*/
#include <stdio.h>

int main(void){
    // definindo variaveis
    int num;
    num = -10;
    
    do {
        printf("%d\n",num);
        num ++;

    } while (num <= 10);

    return 0;
}