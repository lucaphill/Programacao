/*
Luca Borges
Projeto: beecrowd lista 2-sequencia de somas
*/
#include <stdio.h>
int main(void){

    int n = 1, m = 1, soma = 0, inicio = 0, fim = 0;

    while (1){
        scanf("%d %d", &n, &m);
        if (n <= 0 || m <= 0){
            break;

        }

        if (n < m){
            inicio = n;
            fim = m;
            
        } else if (n > m){
            inicio = m;
            fim = n;
            
        }
        for (inicio; inicio <= fim; inicio++){
            printf ("%d ", inicio);
            soma += inicio;

        }
        
        printf ("Sum=%d\n",soma);
        soma = 0;

    }
    
    return 0;
}