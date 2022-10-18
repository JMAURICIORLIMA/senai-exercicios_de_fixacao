package aulas.senai.exercicio.desafio01;

import java.util.Scanner;

//ler o nome de uma pessoa, a sua idade e o seu salário e mostrar as informações.
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INFORME NOME: ");
        String nome = sc.nextLine();

        System.out.print("INFORME IDADE: ");
        short idade = sc.nextShort();

        System.out.print("INFORME SALÁRIO R$ ");
        float salario = sc.nextFloat();

        sc.close();

        System.out.printf("\nNOME: %s \n" +
                        "IDADE: %d \n" +
                        "SALARIO R$ %.2f \n",
                nome, idade, salario);
    }
}
