/*
Luca Borges
Programa: Um programa que usa funcoes para fazer equações do 2 grau
*/
#include <math.h>
#include <stdio.h>


float delta (float a, float b, float c){
    double delta;

    delta = b*b -4 * a * c;

    if (delta >= 0){
        return delta;
    } else {
        return 3;
    }
}

float raizX1 (float a, float b, double d){
    float x1;

    x1 = (-b + sqrt(d)) / (2 * a);
    return x1;

}

float raizX2(float a, float b, float c){
    float x2;
    double d;

    d = delta(a, b, c);

    x2 = (-b - sqrt(d)) / (2 * a);
    return x2;

}

int main(void){
    double d;
    float x1, x2;
    float a,b,c;
    puts("Insira os valores de 'a', 'b' e 'c' da sua equacao do 2 grau:");
    scanf("%f %f %f", &a, &b, &c);

    if (a == 0){
        return 1;
    }

    //chama delta
    d = delta(a,b,c);
    // calcula as raizes
    x1 = raizX1(a, b, d);
    x2 = raizX2(a, b, c);
    // mostra os resultados
    printf("Determinante: %.2f\n x1: %.2f \n x2: %.2f\n", d, x1, x2);


    return 0;
}