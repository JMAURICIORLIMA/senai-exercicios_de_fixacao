package aulas.senai.exercicio.desafio04.exercicio05;

import java.util.Scanner;

//Fazer um Algoritmo que mostre o fatorial de um número.
public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cont = num;

        while (cont > 1) {
            num = num * (cont - 1);
            cont--;
        }

        System.out.println(num);
    }
}
