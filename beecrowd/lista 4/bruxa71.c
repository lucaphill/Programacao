/*
Luca Borges
Programa: zera operações com o numero 7;
*/
#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main(void){
    char num1[15], num2[15], final[100], operador;
    int a, b, resultado, tam1, tam2;

    scanf("%s", num1);
    scanf(" %c", &operador);
    scanf("%s", &num2);

    tam1 = strlen(num1);
    tam2 = strlen(num2);

    for(int i = 0; i < tam1; i++){
        if(num1[i] == '7'){
            num1[i] = '0';
        }
    }
    for(int i = 0; i < tam2; i++){
        if(num2[i] == '7'){
            num2[i] = '0';
        }
    }


    a = atoi(num1);
    b = atoi(num2);

    switch(operador){
        case '+': resultado = a + b; break;
        case '-': resultado = a - b; break;
        case 'x': resultado = a * b; break;
        case '/': resultado = a / b; break;
    }

    sprintf(final, "%d", resultado);

    for(int i = 0; i < strlen(final); i++){
        if(final[i] == '7'){
            final[i] = '0';
        }
    }

    printf("%d\n", atoi(final));
    

    return 0;
}