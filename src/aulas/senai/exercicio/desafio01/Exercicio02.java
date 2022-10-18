package aulas.senai.exercicio.desafio01;

import java.util.Scanner;

//Pedir para o usuário digitar dois números e imprimir a soma dos dois números.
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("---------------------------\n" +
                "       Vamos somar?" +
                "\n---------------------------\n");
        System.out.print("Primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Segundo número: ");
        int num2 = sc.nextInt();

        int soma = num1 + num2;

        System.out.printf("\n---------------------------\n" +
                        "A soma entre [%d] + [%d] = [%d]",
                num1, num2, soma);
    }
}
