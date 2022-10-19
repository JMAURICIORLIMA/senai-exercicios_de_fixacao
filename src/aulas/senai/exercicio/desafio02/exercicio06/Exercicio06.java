package aulas.senai.exercicio.desafio02.exercicio06;

import java.util.Scanner;

//Fazer um algoritmo para imprimir o conceito de um aluno, dada a sua nota. Supor notas inteiras momente
//O critério para conceitos:
//Nota inferior a 3 - conceito E
//Nota de 3 a 5 - conceito D
//Nota de 6 e 7 - conceito C
//Nota de 8 a 9 - conceito B
//Nota 10 - conceito A
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String conceito = "";

        System.out.println("Bem vindo(a) ao sistema de conceito de notas\n");

        System.out.print("\nNome do aluno(a): ");
        String nome = sc.nextLine();

        System.out.print("\nNota: ");
        String nota = sc.nextLine();

        switch (nota){
            case "1":
            case "2":
                conceito = "Conceito E";
                break;
            case "3":
            case "4":
            case "5":
                conceito = "Conceito D";
                break;
            case "6":
            case "7":
                conceito = "Conceito C";
                break;
            case "8":
            case "9":
                conceito = "Conceito B";
                break;
            case "10":
                conceito = "Conceito A";
                break;
            default:
                conceito = "Nota inválida";
                break;
        }

        System.out.printf("Aluno(a) %s obteve nota [%s - %s] ", nome, nota, conceito);
    }
}
