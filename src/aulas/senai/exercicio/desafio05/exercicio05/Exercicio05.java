package aulas.senai.exercicio.desafio05.exercicio05;

import java.util.Scanner;

//Faça um algoritmo que tenha 3 opções:
// 1 – Para contar de 1 ate 10
// 2 – Para contar de 10 ate 1
// 3 – sair
public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\n**********MENU**********\n" +
                "1 - CONTA DE 1 ATÉ 10\n" +
                "2 - CONTA DE 10 ATÉ 1\n" +
                "3 - SAIR\n" +
                "-> ");
        byte entrada = sc.nextByte();

        if (entrada == 1) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d ",i);
            }
        } else if (entrada == 2) {
            for (int i = 10; i >= 1; i--) {
                System.out.printf("%d ",i);
            }
        } else if (entrada == 3){
            System.out.println("Finalizando...");
        } else {
            System.out.println("Opção inválida... Finalizando...");
        }

    }
}
