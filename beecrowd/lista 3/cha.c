/*
Luca Boges
Programa: identificador de chá
*/
#include <stdio.h>

int main (void){
    int correto, contador=0;
    int a,b,c,d,e;
    
    scanf("%d",&correto);

    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);

    if (a == correto){
        contador ++;
    }
    if (b == correto){
        contador ++;
    }
    if (c == correto){
        contador ++;
    }
    if (d == correto){
        contador ++;
    }
    if (e == correto){
        contador ++;
    }

    printf("%d\n", contador);

    return 0;
}