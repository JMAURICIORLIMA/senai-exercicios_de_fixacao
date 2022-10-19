package aulas.senai.exercicio.desafio01.exercicio05;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

//Pedir para o usuário informar o ano em que nasceu e o programa deve retornar a idade do usuário.
public class Exercicio05 {
    public static void main(String[] args) {

        int anoAtual = YearMonth.now().getYear();

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano do seu nascimento. ");
        int anoNascimento = sc.nextInt();
        int idade = anoAtual - anoNascimento;

        if ((idade < 0) && (idade > 122)) {
            System.out.println("Idade inválida, maior que a permitida");
        } else {
            System.out.printf("Idade de %d anos.", idade);
        }
    }
}
