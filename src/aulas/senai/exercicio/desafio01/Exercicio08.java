package aulas.senai.exercicio.desafio01;

import java.sql.SQLOutput;
import java.util.Scanner;

//Um cliente de um banco tem um saldo positivo de R$500,00. Fazer um algoritmo que leia o
//cheque que entrou e calcule o saldo, mostrando (escrevendo) o saldo na tela.
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float saldoAtual = 500.00f;
        float deposito = 0f;
        float sacar = 0f;

        byte entrada = 0;

        System.out.println("BEM VINDO(A) AO BANCO TEC");

        do {

            System.out.println("\nESCOLHA UMA DAS OPÇÕES ABAIXO\n" +
                    "[1] - SALDO ATUAL\n" +
                    "[2] - DEPOSITAR\n" +
                    "[3] - SACAR\n" +
                    "[4] - SAIR");
            entrada = sc.nextByte();

            switch (entrada) {
                case 1:
                    System.out.printf("SALDO DISPONÍVEL R$ %.2f \n", saldoAtual);
                    break;
                case 2:
                    System.out.print("VALOR DO DEPÓSITO R$ ");
                    deposito = sc.nextFloat();
                    if (deposito < 0) {
                        System.out.println("VALOR INFORMADO NÃO PERMITIDO...");
                    } else {
                        System.out.printf("DEPÓSITO REALIZADO COM SUCESSO NO VALOR DE R$ %.2f \n", deposito);
                        saldoAtual += deposito;
                    }
                    break;
                case 3:
                    System.out.printf("SALDO DISPONÍVEL R$ %.2f \n", saldoAtual);
                    System.out.print("INFORME VALOR DE SAQUE: ");
                    sacar = sc.nextFloat();
                    if (sacar > saldoAtual) {
                        System.out.println("SALDO INSUFICIENTE. ");
                    } else {
                        sacar = saldoAtual - sacar;
                        System.out.printf("VALOR DO SAQUE R$ %.2f \n", sacar);
                    }
                    break;
                case 4:
                    System.out.println("OBRIGADO PELA PREFERENCIA, ATÉ LOGO...\n");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA... ");
                    break;
            }

        } while (entrada != 4);
        System.out.println("SAINDO ....");
    }
}
