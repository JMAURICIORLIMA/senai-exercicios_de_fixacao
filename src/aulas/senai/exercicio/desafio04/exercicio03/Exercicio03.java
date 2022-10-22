package aulas.senai.exercicio.desafio04.exercicio03;

import java.util.Scanner;

//Faça um contador que vai de 1 até o número que o usuário informar
public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Contador... Digite um número: ");
        int num = sc.nextInt();
        int cont = 1;

        do {
            if (num > 0){
                System.out.println(cont);
                cont++;
            } else {
                System.out.println(cont);
                cont--;
            }


        }while (cont != num);

        System.out.println(cont);
    }
}
