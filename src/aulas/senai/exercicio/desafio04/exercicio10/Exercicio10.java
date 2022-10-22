package aulas.senai.exercicio.desafio04.exercicio10;

import java.util.Scanner;

//Faça um algoritmo que leia vários números e informe quantos desses números
//entre 100 e 200 foram digitados. Quando o valor 0 (zero) for lido o algoritmo
//deverá cessar sua execução.
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO(A) AO CONTADOR");
        System.out.print("O contador de valores irá\n" +
                "Lhe informar quantos números\n" +
                "Foram digitados num intervalo\n" +
                "Entre 100 e 200, vamos começar?\n");
        int leitura;
        short foraDoRenge = 0;
        short dentroDoRenge = 0;

        do {
            System.out.print("-> ");
            leitura = sc.nextInt();

            if (leitura < 100 || leitura > 200) {
                foraDoRenge++;
            } else if (leitura == 0) {
                System.out.println("Gerando relatório!");
            } else {
                dentroDoRenge++;
            }

        } while (leitura != 0);

        System.out.printf("Números lidos no intervalo de 100 a 200 = [ %d ] %n" +
                        "Números lidos fora do intervalo definido = [ %d ] %n",
                dentroDoRenge, foraDoRenge);
    }
}
