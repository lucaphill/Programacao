// Um programa que conta quantos leds são necessários para fazer um contador de numeros
#include<stdio.h>
#include<string.h>

int main(void){
    char numeros[102];
    int contador;
    int leds = 0;


    scanf("%d", &contador);
    for(int i = 0; i < contador; i++){
        scanf("%s", numeros);

        for(int j = 0; numeros[j] != '\0'; j++){
            switch (numeros[j]){
                case '1':
                    leds += 2;
                    break;
                case '2':
                case '3':
                case '5':
                    leds += 5;
                    break;
                case '4':
                    leds += 4;
                    break;
                case '6':
                case '9':
                case '0':
                    leds += 6;
                    break;
                case '7':
                    leds += 3;
                    break;
                case '8':
                    leds += 7;
                    break;
            }
        }
        printf("%d leds\n", leds);
        leds = 0;

    }
}