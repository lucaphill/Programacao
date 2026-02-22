/*
Luca Boges
Projeto: taxa de alimentação - beecrowd 2
*/
#include <stdio.h>

int main(void){
    // definindo variaveis
    int teste, dias = 0;
    float comida;
    // pegando os numeros
    scanf("%d", &teste);

    for (int i = 1; i <= teste; i ++){

        scanf("%f", &comida);
        while (comida > 1.00){
            comida = comida / 2;
            dias ++;
        }
        printf("%d dias\n", dias);
        dias = 0;
    }

    return 0;
}