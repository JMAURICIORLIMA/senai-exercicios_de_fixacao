package aulas.senai.exercicio.desafio05.exercicio03;

import java.util.Scanner;

//Faça um contador que vai de 1 até o número que o usuário informar
public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número qualquer para ser contado\n" +
                "-> ");
        int entrada = sc.nextInt();

        if (entrada > 0){
            for (int i = 1; i <= entrada; i++) {
                System.out.printf("%d ",i);
            }
        } else if (entrada < 0) {
            for (int i = -1; i >= entrada; i--) {
                System.out.printf("%d ",i);
            }
        } else {
            System.out.print("Valor não aceito.");
        }
    }
}
