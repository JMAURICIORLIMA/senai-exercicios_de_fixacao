package aulas.senai.exercicio.desafio04.exercicio12;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

//Faça um algoritmo que tenha 3 opções:
// 1 – Para contar de 1 ate 10
// 2 – Para contar de 10 ate 1
// 3 – sair
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short entrada;

        do {

            System.out.print("\n*********MENU*********\n" +
                    "1 - CONTA DE 1 ATÉ 10\n" +
                    "2 - CONTA DE 10 ATÉ 1\n" +
                    "3 - SAIR\n" +
                    "-> ");
            entrada = sc.nextShort();

            if (entrada == 1) {
                for (int i = 1; i < 11; i++) {
                    System.out.println(i);
                }
            } else if (entrada == 2) {
                for (int i = 10; i > 0; i--) {
                    System.out.println(i);
                }
            } else if (entrada == 3){
                System.out.println("\nFinalizando...\n");
            } else {
                System.out.println("\nOpção inválida...\n");
            }

        } while (entrada != 3);
    }
}
