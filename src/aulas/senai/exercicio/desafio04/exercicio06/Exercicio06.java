package aulas.senai.exercicio.desafio04.exercicio06;

import java.util.Scanner;

//Faça um algoritmo estruturado que leia uma quantidade não determinada de
//números positivos. Calcule a quantidade de números pares e ímpares, a média de
//valores pares e a média geral dos números lidos. O número que encerrará a leitura
//será zero.
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada;
        short contaPar = 0;
        short contaImpar = 0;
        short contadorGeral = 0;
        short somaPar = 0;
        float media = 1f;
        float mediaPar = 1f;
        int somaGeral = 0;

        System.out.println("Entre com valores aleatórios");

        do {
            System.out.print("DIGITE -> ");
            entrada = sc.nextInt();

            somaGeral += entrada;
            contadorGeral++;

            if (entrada == 0) {
                System.out.println("----------- Relatório -----------");
            } else if (entrada % 2 == 0) {
                somaPar += entrada;
                contaPar++;
            } else if (entrada < 0) {
                System.out.println("Valor não permitido.");
            } else {
                contaImpar++;
            }

        } while (entrada != 0);

        if (media == 0 || mediaPar == 0){
            media = 0.00f;
            mediaPar = 0.00f;
        }

        System.out.printf("Quantidade de números Pares: %d %n", contaPar);
        System.out.printf("Quantidade de números Impares: %d %n", contaImpar);
        media = somaGeral / contadorGeral;
        mediaPar = somaPar / contaPar;
        System.out.printf("Média da soma dos números Pares: %.2f %n", mediaPar);
        System.out.printf("Média global: %.2f %n", media);
    }
}
