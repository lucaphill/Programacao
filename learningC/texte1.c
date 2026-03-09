/*
Luca Borges
Programa: é uma boa pergunta
*/
#include <stdio.h>
#include <math.h>

int main(){
    double principal, rate;
    int years, time;
    double total;

    puts("Enter the principal");
    scanf("%lf",&principal);

    puts("Enter the interrest rate %%");
    scanf("%lf", &rate);
    rate = rate /100;

    puts("Enter the # of years %%");
    scanf("%d",&years);

    puts("Enter the # of compounded per year");
    scanf("%d",&time);

    total = principal * pow(1 + rate/time, time*years);

    printf("After %d years, the total will be R$ %.2lf",years, total);


    return 0;
}