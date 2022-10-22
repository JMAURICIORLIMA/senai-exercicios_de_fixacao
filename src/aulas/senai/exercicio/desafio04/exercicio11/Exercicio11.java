package aulas.senai.exercicio.desafio04.exercicio11;

import javax.swing.*;
import java.util.Scanner;

//Desenvolver um algoritmo que leia um número não determinado de valores e
//calcule e escreva a média aritmética dos valores lidos, a quantidade de valores
//positivos, a quantidade de valores negativos e o percentual de valores negativos e
//positivos. A execução se encarra quando o usuário insere 0.
public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int leitura;
        int contador = 0;
        double mediaGeral = 0;
        double contaPositivos = 0;
        int quantidadePositivos = 0;
        double contaNegativos = 0;
        int quantidadeNegativos = 0;
        double percentoPositivos = 0;
        double percentoNegativos = 0;

        System.out.println("CALCULADOR DE VALORES ALEATÓRIOS");

        do {
            System.out.print("Digite -> ");
            leitura = sc.nextInt();

            contador++;
            mediaGeral += leitura / contador;

            if (leitura > 0) {
                contaPositivos += leitura;
                quantidadePositivos++;
            } else if (leitura < 0){
                contaNegativos += leitura;
                quantidadeNegativos++;
            } else {
                System.out.println("Gerando relatório");
            }

        } while (leitura != 0);

        percentoPositivos = contaPositivos/100;
        percentoNegativos = contaNegativos/100;

        System.out.printf("Média geral %.2f %n",mediaGeral);
        System.out.printf("Quantidade de positivos %d %n",quantidadePositivos);
        System.out.printf("Quantidade de negativos %d %n",quantidadeNegativos);
        System.out.printf("Porcentagem de positivos %.2f %n",percentoPositivos);
        System.out.printf("Porcentagem de positivos %.2f %n",percentoNegativos);
    }
}
