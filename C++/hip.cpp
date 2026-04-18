/*
Luca Borges
Calculo de hipotenusa
*/
#include <iostream>
#include <cmath>

int main(void){
    double a, b, c;

    std::cout << "Insira o valor de b: ";
    std::cin >> b;

    std::cout << "Insira o valor de c: ";
    std::cin >> c;


    a = sqrt(b*b + c*c);

    std::cout << "A hipotenusa eh " << a << '\n';


    return 0;
}