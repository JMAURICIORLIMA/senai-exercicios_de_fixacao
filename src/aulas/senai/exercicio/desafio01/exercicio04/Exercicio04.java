package aulas.senai.exercicio.desafio01.exercicio04;

import java.util.Scanner;

/*
 * Faça um algoritmo que lê uma temperatura em Fahrenheit e calcula a temperatura correspondente
 * em Celsius. Ao final o programa deve exibir as duas temperaturas. – Usar a fórmula: C = (5 * (F-32) / 9)
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fah = 0;

        System.out.println("\nCONVERSOR DE FAHRENHEIT PARA CELSIUS\n" +
                "----------------------------------");
        System.out.print("TEMPERATURA EM FAHRENHEIT: ");
        fah = sc.nextDouble();
        double celsius = (5 * (fah - 32) / 9);
        System.out.printf("[%.3f]ºF = [%.3f]ºC", fah, celsius);

    }
}
