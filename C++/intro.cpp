#include <iostream>

int main(void){
    // declarando variáveis

    int inteiro;
    double flutuante; // use eles ao invez de float
    char letra; // ainda é um unico caractere
    bool binario; // tem na biblioteca padrão (:
    std::string nome = "Luca Borges"; // NÃO ACREDITO, TEMOS STRINGS

    inteiro = 1000;

    // print (muito estranho)
    std::cout << "Olá " << nome << '\n';

    // CONSTANTES
    const double PI = 3.14; // mesma coisa de c SEMPRE USE ELAS
    double raio = 10;
    double circunferencia;

    circunferencia = 2*PI*raio;

    std::cout << circunferencia << '\n';

    return 0;
}