package aulas.senai.exercicio.desafio02.exercicio03;

import java.util.Scanner;

//Faça um algoritmo que calcule o IMC de uma pessoa. IMC = massa/ (altura ^2). Se o
//IMC estiver entre 18.5 e 25 a pessoa estará no peso ideal, se for menos que isso está
//abaixo do peso e se for maior que isso estará acima do peso.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- CALCULADOR DE IMC -----");
        System.out.print("INFORME O PESO: ");
        float peso = sc.nextFloat();
        System.out.print("INFORME ALTURA: ");
        float altura = sc.nextFloat();

        String resultado = "";

        float imc = peso / (altura*altura);

        if (imc >= 18.5 && imc <= 25){
            resultado = "PESO IDEAL";
        } else if (imc < 18.5) {
            resultado = "ABAIXO DO PESO";
        } else {
            resultado = "ACIMA DO PESO";
        }

        System.out.printf("O IMC [%.2f] [%S]", imc, resultado);
    }
}
