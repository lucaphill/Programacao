/*
Luca Borges
Programa: um programa que le a entrada do usuario e faz uma progreção aritmetica/geometrica
*/
#include<stdio.h>
int main(void){
    // definindo variaveis  
    char c;
    int t, r, n;
    int progA, progG, soma;
    soma = 0;

    // pegando os valores
    puts("Voce quer fazer uma progressao aritmetica(a) ou geometrica (g)?");
    scanf("%c",&c);

    printf("Digite o termo orientador: ");
    scanf("%d",&t);

    printf("Digite a razao da progressao: ");
    scanf("%d",&r);

    printf("Digite quantos numeros devem aparecer: ");
    scanf("%d",&n);

    // pogrecao aritmetica
    if (c == 'a'){

        printf("[ ");
        for (int i = 1; i <= n; i++){
            progA = t + (i*r);
            
            printf("%d, ", progA);
            soma += progA;
        }

        printf("]\n");
        printf("Soma: %d\n",soma);

    } else if (c == 'g') { // progrecao geometrica

        printf("[ ");
        for (int j = 1; j <= n; j++){
            progG = t * (j*r);
            
            printf("%d, ", progG);
            soma += progG;
        }
        printf("]\n");
        printf("Soma: %d\n",soma);
    }

    return 0;
}