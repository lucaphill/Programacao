/*
Luca Borges
Programa: Dada uma senha, ele verifica se ela é forte ou fraca baseando se em criterios
*/
#include <stdio.h>
#include <string.h>

void TiraBarraN(char *str){
    if (str[strlen(str)-1] == '\n'){
        str[strlen(str)-1] = '\0';
    }
}


int main(void){
    char senha[51];
    int contador;
    int letra_Max, letra_min, num, especiais;



    while (fgets(senha, 51, stdin) != NULL){
        TiraBarraN(senha);
        letra_Max = letra_min = num = especiais = 0;
    
        for (int i = 0; senha[i] != '\0'; i++){
            if (senha[i] >= 'a' && senha[i] <= 'z'){
                letra_min ++;
            } else if (senha[i] >= 'A' && senha[i] <= 'Z'){
                letra_Max ++;
            } else if (senha[i] >= '0' && senha[i] <= '9'){
                num ++;
            } else {
                especiais++;
            }

        }
        if (letra_Max > 0 && letra_min > 0 && num > 0 && especiais == 0 && strlen(senha) >= 6 && strlen(senha) <= 32){
        puts("Senha valida.");
        } else {
        puts("Senha invalida.");
        }
    }
        
}