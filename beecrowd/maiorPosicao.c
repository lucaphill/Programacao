/*
Luca Borges
Projeto: maior posição - beecrowd
*/
#include <stdio.h>
int main(void){
    int valor = 1, posicao = 1, maior = 0, posicaoMaior = 1;

    for (int i = 1; i <= 100; i++){
        scanf("%d",&valor);

        if (valor > maior){
            maior = valor;
            posicaoMaior = posicao;
        }
        posicao ++;
    }

    printf("%d\n%d\n", maior, posicaoMaior);

    return 0;
}