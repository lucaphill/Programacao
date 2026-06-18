package prova2;

/*
Luca Borges 202510103587
Thiago Sales 20250103602
*/

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // parte da 3.4
        String[] historico = new String[5];

        while (true) {
            System.out.println("Coloque os numeros para a operação:");
            double valor1 = teclado.nextDouble();
            double valor2 = teclado.nextDouble();

            // EXTRA - BUSCA DE FILTRO DO HISTÓRICO -> opção 7
            System.out.println("Agora escolha a operação a ser feita:");
            System.out.println("1 para soma \n2 para subtração\n3 para multiplicação\n4 para divisão\n5 para sair \n6 para ver o histórico \n7 para buscar no histórico \nInsira sua escolha: ");
            int operacao = teclado.nextInt();
            teclado.nextLine();

            // dependendo da operação, passa os valores pra cada função e chama o histórico em cada;
            if(operacao == 1){
                double soma = soma(valor1, valor2);
                System.out.println(valor1 + "+" + valor2 + " = " + soma);
                historico = historico(valor1, valor2,'+', soma, historico);
            } else if(operacao == 2){
                double subtracao = subtacao(valor1, valor2);
                System.out.println(valor1 + "-" + valor2 + " = " + subtracao);
                historico = historico(valor1, valor2,'-', subtracao, historico);
            } else if(operacao == 3){
                double multiplicacao = multiplicacao(valor1, valor2);
                System.out.println(valor1 + "*" + valor2 + " = " + multiplicacao);
                historico = historico(valor1, valor2,'*', multiplicacao, historico);
            } else if(operacao == 4){
                double divisao = divisao(valor1, valor2);
                System.out.println(valor1 + "/" + valor2 + " = " + divisao);
                historico = historico(valor1, valor2,'/', divisao, historico);
            } else if(operacao == 5){
                break; // fecha o programa
            } else if (operacao == 6){
                for(int i = 0; i < historico.length; i++){
                    System.out.println(historico[i]);
                }
            } else if (operacao == 7){
                System.out.println("Escreva o simbolo da operação buscada: (+ - * /)");
                String busca = teclado.nextLine();
                buscaHistorico(busca, historico);
            }
        }
        teclado.close();
    }

    public static String[] historico(double valor1, double valor2, char operacao, double resultado, String[] historico){
        // se a string não tiver cheia, pega onde ela vazia e coloca a nova string
        if(historico[4] == null){
            for(int i = 0; i < 5; i++){
                if(historico[i] == null){
                    historico[i] = " " + valor1 + " "+ operacao +" " + valor2 + " = "+ resultado +" ";
                    break;
                }   
            }
        }
        /*
        Se já estiver cheio, move todas uma casa para tras (ignorando a primeira que sera deletada) e insere a nota string na ultima casa
        */
        else if (historico[4] != null){
            for(int i = 1; i < 5; i++){
                historico[i-1] = historico[i];
            }
            historico[4] = " " + valor1 + " "+ operacao +" " + valor2 + " = "+ resultado +"";
        }
        return historico;
    }

    // EXTRA - BUSCA DE FILTRO DO HISTÓRICO
    public static void buscaHistorico(String a, String[] historico){
        for(int i = 0; i < 5; i++){
            if(historico[i] != null && historico[i].contains(a)){
                System.out.println(historico[i]);
            }
        }
    }


    public static double soma(double... valor){
        double soma = 0;
        for(double n: valor){
            soma += n;
        }
        return soma;
    }

    public static double multiplicacao(double a, double b){
        return a*b;
    }

    public static double subtacao(double a, double b){
        return a-b;
    }

    public static double divisao(double a, double b){
        return a/b;
    }

}
