package aulas.senai.exercicio.desafio02.exercicio04;

import java.util.Scanner;

//Faça um algoritmo que diga se a pessoa está ou não apta a tirar a carteira de motorista.
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte idade = 0;
        boolean alfabetizado = false;
        boolean docIdentificacaoFoto = false;
        boolean cpf = false;
        boolean comprovacaoResidencia = false;
        String resposta = "";

        System.out.println("Necessário possuir todos requisitos a seguir ");
        System.out.print("Idade do candidato(a) : ");
        idade = sc.nextByte();

        System.out.print("Candidato(a) é alfabetizado(a)? [1] sim, [2] não :");
        alfabetizado = (sc.nextByte() == 1) ? true : false;

        System.out.print("Candidato(a) apresentou documento de identificação com foto? [1] sim, [2] não :");
        docIdentificacaoFoto = (sc.nextByte() == 1) ? true : false;

        System.out.print("Candidato(a) possui cpf? [1] sim, [2] não :");
        cpf = (sc.nextByte() == 1) ? true : false;

        System.out.print("Candidato(a) possui comprovação de residencia? [1] sim, [2] não :");
        comprovacaoResidencia = (sc.nextByte() == 1) ? true : false;

        if ((idade < 18) || (alfabetizado == false) || (docIdentificacaoFoto == false) || (cpf == false) || (comprovacaoResidencia == false)){
            resposta = "Candidato(a) não possui um ou mais requisitos para carteira de habilitação";
        } else {
            resposta = "Candidato(a) possui todos requisitos.\n" +
                    "O mesmo deve pagar as taxas e realizar exames psicológicos.\n" +
                    "De Aptidão física e mental, conhecimentos em legislação de transito\n" +
                    "e prática de direção veicular.";
        }
        sc.close();

        System.out.printf("%s", resposta);
    }
}
