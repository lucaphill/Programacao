/*
Luca Borges
Programa: fala a provavel reação do Sheldon pra uma disputa kkk
*/
#include <stdio.h>
#include <string.h>


int Vencedor(char *player1, char *player2){
    int vencedor = 0;

    if(strcmp(player1, player2) == 0){
        vencedor = 0;
    } else if (!strcmp(player1, "tesoura") && (!strcmp(player2, "papel") || !strcmp(player2, "lagarto") )){
        vencedor = 1;
    } else if (!strcmp(player1, "papel") && (!strcmp(player2, "pedra") || !strcmp(player2, "Spock") )){
        vencedor = 1;
    } else if (!strcmp(player1, "pedra") && (!strcmp(player2, "lagarto") || !strcmp(player2, "tesoura") )){
        vencedor = 1;
    } else if (!strcmp(player1, "lagarto") && (!strcmp(player2, "Spock") || !strcmp(player2, "papel") )){
        vencedor = 1;
    } else if (!strcmp(player1, "Spock") && (!strcmp(player2, "tesoura") || !strcmp(player2, "pedra") )){
        vencedor = 1;
    } else {
        vencedor = 2;
    }

    return vencedor;
}


int main(void){
    int entrada;
    char haj[10];
    char sheldon[10];
    int comparacao;

    scanf("%d", &entrada); 

    for(int i = 0; i < entrada; i++){
        scanf("%s", sheldon);
        scanf("%s", haj);

        switch (Vencedor(sheldon, haj)){
            case 0: printf("Caso #%d: De novo!\n", i+1); break;
            case 1: printf("Caso #%d: Bazinga!\n", i+1); break;
            case 2: printf("Caso #%d: Raj trapaceou!\n", i+1); break;

        }
    }

    return 0;
}