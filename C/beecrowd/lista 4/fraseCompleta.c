/*
Luca Borges
Programa: verifica se uma frase está completa
*/
#include <stdio.h>
#include <string.h>


void TiraBarraN(char *str){
    if (str[strlen(str)-1] == '\n'){
        str[strlen(str)-1] = '\0';
    }
}


int EhCompleta(char *str){
    int letras[26] = {0};
    int contaLetras = 0;


    for(int i = 0; str[i] != '\0'; i++){
        if(str[i] >= 'a' && str[i] <= 'z'){
            letras[str[i] - 'a'] = 1;
        }
    }
    for(int j = 0; j < 26; j++){
        if(letras[j] == 1){
            contaLetras ++;
        }
    }
    if(contaLetras == 26){
        return 1;
    } else if (contaLetras >= 13){
        return 0;
    } else {
        return -1;
    }
}


int main(void){
    char frase[1002];
    int completa, testes;

    scanf("%d", &testes);
    getchar(); 

    for(int i = 0; i < testes; i++){
        fgets(frase, 1002, stdin);
        TiraBarraN(frase);

        completa = EhCompleta(frase);

        if(completa == 1){
            puts("frase completa");
        } else if (completa == 0){
            puts("frase quase completa");
        } else if (completa == -1){
            puts("frase mal elaborada");
        }

    return 0; 
    
}