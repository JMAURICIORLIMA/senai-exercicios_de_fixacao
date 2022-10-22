package aulas.senai.exercicio.desafio04.exercicio04;

import java.util.Scanner;

//Faça um contador que conte de onde o usuário quiser até onde ele quiser.
public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o intervalo que deseja contar. " +
                "Ponto inicial -> ");
        int inicio = sc.nextInt();
        System.out.print("Ponto final -> ");
        int fim = sc.nextInt();
        int cont = inicio;

        do {
            if (inicio > fim) {
                System.out.println(cont);
                cont--;
            }else {
                System.out.println(cont);
                cont++;
            }

        }while (cont != fim);
        System.out.println(cont);
    }
}
