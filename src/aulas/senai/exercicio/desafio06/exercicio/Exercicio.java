package aulas.senai.exercicio.desafio06.exercicio;

import java.util.Scanner;

//Crie uma classe e instancie essa classe criando um objeto. É muito importante que você tente fazer isso pois
// só assim você compreenderá o conceito de orientação a objeto. Resista a aula se for preciso, mas não saia daqui
// hoje com duvidas. O curso a partir desse momento vai ser completamente sequencial, você tem que ter compreendido
// o assunto do dia para entender o próximo . Não vacile! Qualquer coisa estarei a disposição a medida do possível
// e também tem o grupo do WhatsApp para tirar sua duvida.
public class Exercicio {
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
