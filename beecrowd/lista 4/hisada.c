/*
Luca Borges
Programa: verifica se uma risada é engraçada? kkkk
*/
#include <stdio.h>
#include <string.h>

int EhEngracada(char *str){
    int i=0, j = strlen(str)-1;


    while (i < j){
    
        for(i; i <= j; i++){
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u'){
                break;
            }

        }
        for(j; j >= i; j--){
            if (str[j] == 'a' || str[j] == 'e' || str[j] == 'i' || str[j] == 'o' || str[j] == 'u'){
                break;
            }
        }

        if (i >= j) break; 

        if (str[i] == str[j]){
            i++;
            j--;
            continue;

        } else {
            return 0;
        }

    }

    return 1;
}

int main(void){
    char risada[52];
    int ehEngracada;
    
    scanf("%s", risada);

    ehEngracada = EhEngracada(risada);
    if(ehEngracada){
        puts("S");
    } else {
        puts("N");
    }

    return 0;
}