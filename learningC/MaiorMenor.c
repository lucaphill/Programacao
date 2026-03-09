/*
Revisão para a prova
*/
#include <stdio.h>

int main (void){
    int a,b;
    int temp=0;
    float media=0, soma=0, contador=0;

    printf("Insira dois valores, para calcular a media entre suas somas:\n");
    scanf("%d %d",&a,&b);

    if(a < 0 || b < 0){
        printf("Numero invalido, use apenas positivos");
        return 1;
    }

    if (a>b){
        temp = a;
        a = b;
        b = temp;
    }

    for (float i = a; i <= b; i++){
        soma += i;
        contador ++;
    }

    media = soma / contador;
    printf("A media dos valores entre [%d,%d] eh %.2f\n",a,b, media);


    return 0;
}