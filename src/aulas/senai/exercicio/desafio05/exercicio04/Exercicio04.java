package aulas.senai.exercicio.desafio05.exercicio04;

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

        if (inicio > fim) {
            for (int i = inicio; i >= fim; i--) {
                System.out.printf("%d ", i);
            }
        } else if (inicio < fim) {
            for (int i = inicio; i <= fim; i++) {
                System.out.printf("%d ", i);
            }
        } else {
            System.out.println("Inicio e fim iguais.");
        }
    }
}
