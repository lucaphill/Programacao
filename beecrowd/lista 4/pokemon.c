/*
Luca Borges
Programa: Ele te fala quantos pokemons ainda falta pra vc completar sua coleção
*/
#include <stdio.h>
#include <string.h>

int main(void){
    int pokedex = 151;
    int capturados;
    char pokemon[1005][100];
    int temporario = 0;

    scanf("%d", &capturados);

    for(int i = 0; i < capturados; i++){
        scanf("%s", pokemon[i]);
    }

    for(int j = 0; j < capturados; j++){
        for(int k = 0; k < j; k++){
            if(strcmp(pokemon[j], pokemon[k])==0){
                temporario++;
                break;
            }
        }
    }


    printf("Falta(m) %d pomekon(s).\n", pokedex-(capturados-temporario));

    return 0;
}