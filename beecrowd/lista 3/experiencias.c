/*
Luca Borges
Projeto: experimeitos malvados
*/
#include <stdio.h>

int main(void){
    int r=0,c=0,s=0,textes,total,valor;
    float p1,p2,p3;

    char animal = 'A';
    char rato = 'R';
    char sapo = 'S';
    char coelho = 'C';

    scanf("%d",&textes);
    for (int i = 0; i < textes; i++){
        scanf("%d %c",&valor, &animal);
        if (animal == 'R'){
            r += valor;

        } else if (animal == 'S'){
            s += valor;

        } else if (animal == 'C'){
            c += valor;

        }

    }
    total = r+s+c;

    printf("Total: %d cobaias\n", total);
    printf("Total de coelhos: %d\n", c);
    printf("Total de ratos: %d\n", r);
    printf("Total de sapos: %d\n", s);

    p1 = (c*1.0/total)*100;
    p2 = (r*1.0/total)*100;
    p3 = (s*1.0/total)*100;

    printf("Percentual de coelhos: %.2f %%\n", p1);
    printf("Percentual de ratos: %.2f %%\n", p2);
    printf("Percentual de sapos: %.2f %%\n", p3);

    return 0;
}