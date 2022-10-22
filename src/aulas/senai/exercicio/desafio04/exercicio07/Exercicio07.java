package aulas.senai.exercicio.desafio04.exercicio07;

//Desenvolver um algoritmo que efetue a soma de todos os números ímpares que
//são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
public class Exercicio07 {
    public static void main(String[] args) {

        short cont = 0;
        int somaImpar = 0;

        while (cont <= 500){
            if (cont % 3 == 0){
                somaImpar += cont;
            }
            cont++;
        }

        System.out.println(somaImpar);
    }
}
