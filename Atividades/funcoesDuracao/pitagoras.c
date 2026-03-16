/*
Luca Borges
Programa: verifica triangulos retangulos
*/
#include <stdio.h>
#include <stdbool.h>
#include <math.h>


bool EhTrianguloRegantulo(float a, float b, float c){

    return pow(c, 2) == pow(a, 2) + pow(b, 2);
}


float FormaTrianguloRetangulo(float a, float b, float c){
    float elevados;

    if (a <= 0 && b <= 0 || b <= 0 && c <= 0 || a <= 0 && c <= 0){
        return -1;
    }

    if (a <= 0){
        elevados = pow(c, 2) - pow(b, 2);
        return sqrt(elevados);

    } else if (b <= 0){
        elevados = pow(c, 2) - pow(a, 2);
        return sqrt(elevados);

    } else if (c <= 0){
        elevados = pow(a, 2) + pow(b, 2);
        return sqrt(elevados);
    }

}


int main(void){
    float a,b,c;
    bool ehTrianguloRetangulo, valorLado;

    puts("Digite os valores de a, b e c do seu triangulo:");
    scanf("%f %f %f", &a, &b, &c);

    if(a > 0 && b > 0 && c > 0){
        
        if(EhTrianguloRegantulo(a, b, c)){
            printf("Os valores a: %.1f, b: %.1f e c: %.1f formam um triangulo retangulo", a, b, c);
        } else {
            printf("Os valores a: %.1f, b: %.1f e c: %.1f nao formam um triangulo retangulo", a, b, c);
        }



    }else if (a <= 0 || b <= 0 || c <= 0){
        valorLado = FormaTrianguloRetangulo(a, b, c);

        if(valorLado == -1){
            puts("Os valores de entrada sao invalidos");

        } else {
            printf ("Para que haja um triangulo retangulo, tem que ser %.1f", valorLado);
        }
    
    }


    return 0;
}