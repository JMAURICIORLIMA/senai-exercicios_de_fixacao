package aulas.senai.exercicio.desafio02.exercicio05;

public class OperacoesMatematicas {
    private double entrada1;
    private double entrada2;

    public void soma(double entrada1, double entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;

        double soma = this.entrada1 + this.entrada2;
        System.out.printf("\nSoma [ %.0f ] + [ %.0f ] = [ %.0f ]\n",this.entrada1, this.entrada2, soma);
    }

    public void subtracao(double entrada1, double entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;

        double subtracao = this.entrada1 - this.entrada2;
        System.out.printf("\nSubtração [ %.0f ] - [ %.0f ] = [ %.0f ]\n",this.entrada1, this.entrada2, subtracao);
    }

    public void divisao(double entrada1, double entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;

        if (entrada2 == 0) {
            System.out.println("\nErro. Não existe divisão por zero.\n");
        } else {
            double divisao = this.entrada1 / this.entrada2;
            System.out.printf("\nDivisão [ %.0f ] / [ %.0f ] = [ %.0f ]\n",this.entrada1, this.entrada2, divisao);
        }
    }

    public void multiplicacao(double entrada1, double entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;

        double multiplicacao = this.entrada1 * this.entrada2;
        System.out.printf("\nMultiplicação  [ %.0f ] * [ %.0f ] = [ %.0f ]\n",this.entrada1, this.entrada2, multiplicacao);
    }

}
