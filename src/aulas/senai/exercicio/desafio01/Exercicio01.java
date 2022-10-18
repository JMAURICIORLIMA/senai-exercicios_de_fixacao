package aulas.senai.exercicio.desafio01;

import java.util.Scanner;

//17.10.22
//Pedir para o usuário digitar um número e imprimir este número na tela.
public class Exercicio01 {
    public static void main(String[] args) {
        int num1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número: ");
        num1 = sc.nextInt();

        System.out.printf("%n------------------%n" +
                "Número informado: [%d] %n", num1);
    }
}
