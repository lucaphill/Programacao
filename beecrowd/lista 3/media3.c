/*
Luca Borges
Programa: Calcula a media de notas baseado em pesos
*/
#include <stdio.h>

float media_ponderada(float a, float b, float c, float d){
    float media;
    
    media = ((a*2)+(b*3)+(c*4)+d)/10;

    return media;
}


int situacao(int i){
    if (i>=7){
        return 1;
    } else if (i>=5){
        return 2;
    } else if (i<5){
        return 3;
    }

}


int main(void){
    float n1, n2, n3, n4;
    float media;
    int status;

    scanf("%f %f %f %f",&n1, &n2, &n3, &n4);

    // calcula a media
    media = media_ponderada(n1, n2, n3, n4);
    printf("Media: %.1f\n", media);

    // verifica qual a situacao do discente
    status = situacao(media);
    switch (status){
    case 1:
        puts("Aluno aprovado.");
        break;
    case 2:
        puts("Aluno em exame.");
        break;
    case 3:
        puts("Aluno reprovado.");
        break;
    }

    if (status == 2){
        float exame;
        scanf("%f",&exame);
        printf("Nota do exame: %.1f\n", exame);

        // calculando a nova media
        media = (media + exame)/2;
        status = situacao(media);
        switch(status){
        case 2:
            puts("Aluno aprovado.");
            break;
        case 3:
            puts("Aluno reprovado.");
            break;
        }

        printf("Media final: %.1f\n", media);
    }

    return 0;
}