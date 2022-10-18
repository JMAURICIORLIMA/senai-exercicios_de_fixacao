package aulas.senai.exercicio.desafio01;

import java.util.Scanner;

/*
 * Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e
 * escrever a área do triângulo. Sabendo que para calcular a área devemos usar a fórmula:
 * A=(base x altura)/2
 */
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = 1;
        double altura = 1;

        System.out.print("VAMOS CALCULAR A ÁREA DE UM TRIÂNGULO?" +
                "\nVAMOS COMEÇAR PELA BASE" +
                "\n -> ");
        base = sc.nextDouble();

        System.out.print("INFORME A ALTURA" +
                "\n -> ");
        altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("\n------------------------------\n" +
                        "BASE INFORMADA [ %.2f ]\n" +
                        "ALTURA INFORMADA [ %.2f ]\n" +
                        "AREA EQUIVALENTE [ %.2fm² ]\n",
                base, altura, area);
    }
}
