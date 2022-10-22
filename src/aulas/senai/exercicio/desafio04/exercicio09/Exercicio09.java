package aulas.senai.exercicio.desafio04.exercicio09;

import java.util.Scanner;

//Fazer um algoritmo que retorne se ele é ou não um número primo.
public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Descubra se o número é primo ou não" +
                "\nPara finalizar informe 0 (zero).");
        int entrada;
        byte cont = 0;


        do {

            System.out.print("Digite -> ");
            entrada = sc.nextInt();

            cont = 0;

            for (int i = 1; i <= entrada; i++) {

                if (entrada % i == 0){
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println("PRIMO");
            } else if (cont > 2) {
                System.out.println("NÃO PRIMO");
            }

        } while (entrada != 0);
    }
}
