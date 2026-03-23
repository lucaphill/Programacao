// Soma de binarios
#include <stdio.h>

int main(void){
    int n1 = -1, n2 = -1, temp = 0;
    puts("Insira os numeros (binarios) a serem somados");
    scanf("%d %d", &n1, &n2);

    printf("Leia ao contrario: \n");
    while (n1 > 0){

        if (n1%2 == 1 && n2%2 == 0 || n1%2 == 0 && n2%2 == 1) {
            printf(" 1");
            n1 = n1/10;
            n2 = n2/10;

        } else if (n1 %2 == 0 && n2 %2 == 0){
            printf(" 0");
            n1 = n1/10;
            n2 = n2/10;

        } else if (n1 %2 == 1 && n2 %2 == 1 && temp == 0){
            printf(" 0");
            n1 = n1/10;
            n2 = n2/10;
            if ( n1 %2 == 0){
                n1 += 1;
            } else if ( n2 %2 == 0){
                n2 += 1;
            } else {
                temp += 1;
            } 

        } else if (n1 %2 == 1 && n2 %2 == 1 && temp == 1){
            temp = 0;
            printf(" 1");
            n1 = n1/10;
            n2 = n2/10;
            if ( n1 %2 == 0){
                n1 += 1;
            } else if ( n2 %2 == 0){
                n2 += 1;
            } else {
                temp += 1;
            } 
        }
        
    }
    printf("\n");


    return 0;
}