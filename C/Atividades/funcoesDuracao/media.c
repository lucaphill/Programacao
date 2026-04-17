/*
Luca Borges
Programa: um programa para calcular a media
*/
#include <stdio.h>

double AdicioneNaMedia(double valor){
    static float soma = 0;
    static int contador  = 1;
    double total;

    soma += valor;

    total = soma / contador;
    contador ++;
    return total;
}


int main(void){
    double valor, total;
    int duracao;

    puts("Insira a quantidade de rodadas:");
        scanf("%d", &duracao);

    for (int i = 0; i < duracao; i++){
        puts("Insira um valor novo a media:");
        scanf("%lf", &valor);
        
        total = AdicioneNaMedia(valor);
        printf("A media atual eh: %.2lf\n", total);

        
    }
    
    return 0;
}