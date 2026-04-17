/*
Luca Borges
Programa: Calculo de raizes
*/
#include <stdio.h>
#include <math.h>

int CalculoRaiz(float i, float j, float k, float *y1, float *y2, float *pDelta){
    

    if (i == 0){
        return -1;
    }

    *pDelta = pow(j, 2) -4 * i * k;
    
    if(*pDelta < 0){
        return -2;
    }

    *y1 = (-j + sqrt(*pDelta)) / 2*i;
    *y2 = (-j - sqrt(*pDelta)) / 2*i;

    return 0;
}

int main(void){
    float a,b,c, delta;
    float x1, x2;
    int raiz;

    puts("Insira os valores a, b e c da sua equacao do segundo grau:");
    scanf("%f %f %f", &a, &b, &c);

    raiz = CalculoRaiz(a, b, c, &x1, &x2, &delta);

    if(raiz == 0){
        printf("A equacao existe, delta eh: %.1f e as raizes sao: \nx1: %.1f \nx2: %.1f\n",delta, x1, x2);
    } else if (raiz == -1){
        puts("Insira os coeficientes de uma equacao do 2 grau");
    } else if (raiz == -2){
        printf("Essa equacao nao tem raizes reais pq delta eh: %.1f\n", delta);
    }

    return 0;
}