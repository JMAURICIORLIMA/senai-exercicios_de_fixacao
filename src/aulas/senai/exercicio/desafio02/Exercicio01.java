package aulas.senai.exercicio.desafio02;

import java.util.Scanner;

//Faça um algoritmo que receba um número e informe se esse número digitado é par ou ímpar
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INFORME UM NÚMERO QUALQUER: ");
        int entrada = sc.nextInt();
        String resposta = "";

        if (entrada % 2 == 0){
            resposta = "PAR";
        } else {
            resposta = "IMPAR";
        }

        System.out.printf("O NÚMERO [%d] É %S", entrada, resposta);
    }
}
