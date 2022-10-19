package aulas.senai.exercicio.desafio03.aulaassincrona07;

import java.util.Calendar;

public class Exercicio07 {
    public static void main(String[] args) {
        String dia = "";
        Calendar calendar = Calendar.getInstance();
        int diaDaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        switch (diaDaSemana) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
                break;
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
                break;
            case 7:
                dia = "Sábado";
                break;
        }
        System.out.println(dia);
    }
}
