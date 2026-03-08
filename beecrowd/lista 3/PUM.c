/*
Luca Borges
Programa: conta quando vai explodir?
*/
#include <stdio.h>

int main(void){
    int n, m=1;
    scanf("%d",&n);

    for(int i=1; i <=n; i++){
        for(int j = 1; j <= 3; j++){
            printf("%d ",m);
            m++;

        }
        m+=1;
        puts("PUM");
    }

    return 0;
}