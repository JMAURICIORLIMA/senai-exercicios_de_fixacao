package aulas.senai.exercicio.desafio03.aulaassincrona06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String situacao;

        System.out.print("Nome do aulo(a): ");
        String nome = sc.nextLine();

        System.out.print("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7) {
            situacao = "Aprovado";
        } else if (media >= 5) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Aula: " + nome);
        System.out.println("Media: " + media);
        System.out.println("Situação: " + situacao);
    }
}
