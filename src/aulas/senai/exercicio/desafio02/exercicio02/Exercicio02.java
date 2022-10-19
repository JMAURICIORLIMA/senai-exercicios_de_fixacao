package aulas.senai.exercicio.desafio02.exercicio02;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Spliterator;

//Faça um algoritmo que receba 4 notas de um aluno e calcule sua média. Se o aluno
//tirar media 6 ou mais, ele estará aprovado. Se tirar entre 4 e 6, está de recuperação. Se
//tirar menos de 4, estará reprovado.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[4];
        float media = 0f;
        String resposta = "";

        System.out.println("NOME DO ALUNO(A)");
        String nome = sc.nextLine();

        for (float nota : notas) {
            System.out.print("Informe a nota: ");
            nota += sc.nextFloat();
            media += nota;
        }
        media = media / notas.length;

        if (media < 0 || media > 10) {
            System.out.println("MÉDIA INVÁLIDA...");
        } else if (media >= 6) {
            resposta = "APROVADO";
        } else if (media >= 4) {
            resposta = "RECUPERAÇÃO";
        } else {
            resposta = "REPROVADO";
        }

        System.out.printf("A MÉDIA DO(A) ALUNO(A) %S, FOI [%.2f] \n" +
                "ESTÁ [%S]", nome, media, resposta);
    }
}
