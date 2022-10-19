package aulas.senai.exercicio.desafio03.aulaassincrona04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe outro número: ");
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma entre "+numero1+" e "+numero2+" é: "+soma);
    }
}
