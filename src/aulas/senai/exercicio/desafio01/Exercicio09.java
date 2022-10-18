package aulas.senai.exercicio.desafio01;

import java.util.Scanner;

//Uma empresa de desenvolvimento de softwares paga a seu vendedor um fixo de R$500
//por mês, mais um bônus de R$50 por sistema vendido. Faça um algoritmo que leia quantos
//softwares o funcionário vendeu e determine o salário total do funcionário. Mostre as
//informações que você achar necessário.
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float salarioFixo = 500.00f;
        float bonus = 50.00f;
        short quantidadeVenda = 0;

        String nome = "";

        System.out.print("---------- SOFTEC ----------\n" +
                "GERADOR DE RELATÓRIO\n" +
                "COLABORADOR NOME: -> ");
        nome = sc.nextLine();
        System.out.print("\nQUANTIDADE SOFTWARES VENDIDOS\n" +
                "PELO COLABORADOR " + nome + " -> ");
        quantidadeVenda = sc.nextShort();

        float salarioFinal = salarioFixo + (bonus * quantidadeVenda);

        System.out.printf("\n---- GERANDO RELATÓRIO ----\n" +
                        "COLABORADOR: %S \n" +
                        "Nº DE VENDAS: [ %d ] \n" +
                        "VALOR DO BÔNUS R$ [ %.2f ] \n" +
                        "SALÁRIO FINAL R$ [ %.2f ] \n",
                nome, quantidadeVenda, (bonus * quantidadeVenda), salarioFinal);
    }
}
