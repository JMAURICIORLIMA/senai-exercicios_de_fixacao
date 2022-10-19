package aulas.senai.exercicio.desafio01.exercicio03;

import java.util.Scanner;

//Pedir para o usuário digitar quatro notas e imprimir na tela sua média aritmética.
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota = 0, soma = 0, media = 0;

        System.out.print("-----------------------------\n" +
                "Informe as notas a seguir \n");

        for (int i = 1; i <= 4; i++) {
            System.out.printf("NOTA [%d]: ", i);
            nota = sc.nextDouble();
            soma += nota;
            media = soma / 4;
        }

        System.out.printf("\n-----------------------------\n" +
                "MÉDIA: [%.2f]\n", media);
    }
}
