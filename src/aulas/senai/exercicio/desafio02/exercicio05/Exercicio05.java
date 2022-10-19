package aulas.senai.exercicio.desafio02.exercicio05;

import java.util.Scanner;

//Faça um algoritmo que receba dois números e a operação que se deseja fazer com
//esses números (soma, subtração, multiplicação e divisão)
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperacoesMatematicas soma = new OperacoesMatematicas();
        OperacoesMatematicas subtracao = new OperacoesMatematicas();
        OperacoesMatematicas divisao = new OperacoesMatematicas();
        OperacoesMatematicas multiplicacao = new OperacoesMatematicas();

        byte entrada = 0;
        double num1 = 0;
        double num2 = 0;

        System.out.println("--------- BEM VINDO(a) ---------");


        do {
            System.out.print("\nEscolha uma das opções abaixo\n" +
                    "[1] - Somar\n" +
                    "[2] - Subtrair\n" +
                    "[3] - Dividir\n" +
                    "[4] - Multiplicar\n" +
                    "[5] - Finalizar\n" +
                    "-> ");

            entrada = sc.nextByte();
            switch (entrada) {
                case 1:
                    System.out.print("Informe o 1º valor: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o 2º valor: ");
                    num2 = sc.nextDouble();

                    soma.soma(num1, num2);
                    break;
                case 2:
                    System.out.print("Informe o 1º valor: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o 2º valor: ");
                    num2 = sc.nextDouble();

                    subtracao.subtracao(num1, num2);
                    break;
                case 3:
                    System.out.print("Informe o 1º valor: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o 2º valor: ");
                    num2 = sc.nextDouble();

                    divisao.divisao(num1, num2);
                    break;
                case 4:
                    System.out.print("Informe o 1º valor: ");
                    num1 = sc.nextDouble();
                    System.out.print("Informe o 2º valor: ");
                    num2 = sc.nextDouble();

                    multiplicacao.multiplicacao(num1, num2);
                    break;
                case 5:
                    System.out.println("FINALIZANDO....");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA...");
                    break;
            }

        } while (entrada != 5);
    }
}
