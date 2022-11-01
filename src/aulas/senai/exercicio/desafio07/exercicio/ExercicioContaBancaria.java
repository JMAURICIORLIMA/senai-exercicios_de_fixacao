package aulas.senai.exercicio.desafio07.exercicio;

import java.util.Scanner;

public class ExercicioContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        Conta c1 = new Conta(sc.nextLine(), TipoConta.POUPANCA, sc.nextLine());
        c1.setStatus(true);
        c1.depositar(50);
        String numeroConta = c1.getNumeroConta();
        System.out.println(numeroConta);
        c1.detalheDaConta();
    }
}
