#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(void){
	int palpite, correto, vezes;
    
	srand(time(NULL));
	correto = rand() % 100;

	palpite = -1;
    vezes = 0;
	for (int quantidade = 5; quantidade >= 0; quantidade = quantidade -1) {
        if (palpite != correto){
            printf("Adivinhe o numero: ");
            scanf("%d", &palpite);

                if (palpite > correto){
                    puts("Palpite alto!");
                }else if (palpite < correto){
                    puts("Palpite foi baixo!");
                }
            vezes ++;
            
        }
        
        printf("Voce tem %d tentativas restantes\n", quantidade);
	};

    if (palpite == correto){
    puts("Voce acertou!");
    printf("Foram necessarias %d tentativas\n",vezes);
    } else {
        puts("Acabaram os seus palpites... Mais sorte na proxima");
    }


	return 0;
}
