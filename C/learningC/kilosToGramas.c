/*
Luca Borges
Programa: Pega um valor em gramas e transforma em quilos e vice versa
*/
#include <stdio.h>
#include <stdbool.h>


int main(void){
    float quilo, grama;
    bool unidade;

    printf("Voce quer comecar com quilos ou gramas? (0 = quilos 1 = gramas): ");
    scanf("%d",&unidade);

    if (unidade){
        printf("Insira o valor em gramas:\n");
        scanf("%f",&grama);

        quilo = grama / 1000;
        printf("%.2f gramas sao %.2f quilos\n", grama, quilo);

    } else if (!unidade){
        printf("Insira o valor em quilos:\n");
        scanf("%f",&quilo);

        grama = quilo * 1000;
        printf("%.2f quilos sao %.2f gramas\n", quilo, grama);

    } else {
        printf("VALOR INVALIDO");
        
    }


    return 0;
}