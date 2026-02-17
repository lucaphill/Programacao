#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
	int palpite, correto, vezes;
    
	srand(time(NULL));
	correto = rand() % 100;

	palpite = -1;
    vezes = 0;
	while (palpite != correto) {
        printf("Adivinhe o numero: ");
        scanf("%d", &palpite);

            if (palpite > correto){
                puts("Palpite alto!");
            }else if (palpite < correto){
                puts("Palpite foi baixo!");
            }
        vezes ++;
	};

    puts("Voce acertou!");
    printf("Foram necessarias %d tentativas\n",vezes);
	return 0;
}
