/*
Luca Borges
Programa: calculo da área e perimetro de um hexagono
*/
#include <stdio.h>
#include <math.h>

void CalculaHexagono(float l, float *pArea, float *pPerimetro){
    float n, area, perimetro;
    
    // calculando a area
    *pArea = (pow(3*l, 2) * sqrt(3)) / 2;
    
    // calculando o perimetro
    *pPerimetro = 6*l;

}


int main(void){
    float n, area, perimetro;

    puts("Insira um valor para o lado do seu hexagono:");
    scanf("%f", &n);

    CalculaHexagono(n, &area, &perimetro);

    printf("A area do seu hexagono eh: %.1f\nO perimetro do seu hexagono eh: %.1f\n", area, perimetro);




    return 0;
}