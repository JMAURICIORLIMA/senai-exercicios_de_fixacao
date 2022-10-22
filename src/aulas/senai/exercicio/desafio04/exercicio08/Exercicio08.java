package aulas.senai.exercicio.desafio04.exercicio08;

import java.util.Scanner;

//Escrever um algoritmo que leia uma quantidade desconhecida de números e conte
//quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A
//entrada de dados deve terminar quando for lido um número negativo.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada = 0;
        short intervalo1 = 0;
        short intervalo2 = 0;
        short intervalo3 = 0;
        short intervalo4 = 0;

        System.out.println("Digite valores diferentes de negativos\n" +
                "se deseja ENCERRAR, digite qualquer número NEGATIVO.");

        do {


            System.out.print("Digite -> ");
            entrada = sc.nextInt();

            if (entrada > 0 && entrada <= 25) {
                intervalo1++;
            } else if (entrada > 25 && entrada <= 50) {
                intervalo2++;
            } else if (entrada > 50 && entrada <= 75) {
                intervalo3++;
            } else if (entrada > 75 && entrada <= 100) {
                intervalo4++;
            } else if (entrada < 0){
                System.out.println("--------- RELATÓRIO ---------");
            } else {
                System.out.println("Valor está fora do invervalo de 0 a 100");
            }

        } while (entrada > 0);
        System.out.printf("Intervalo de 0 a 25: %d %n", intervalo1);
        System.out.printf("Intervalo de 26 a 50: %d %n", intervalo2);
        System.out.printf("Intervalo de 51 a 75: %d %n", intervalo3);
        System.out.printf("Intervalo de 76 a 100: %d %n", intervalo4);
    }
}
