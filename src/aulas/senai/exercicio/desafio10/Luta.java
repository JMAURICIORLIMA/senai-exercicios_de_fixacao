package aulas.senai.exercicio.desafio10;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private boolean aprovarLuta;
    private int rounds;
    private String localLuta;


    public Luta() {
    }

    public Luta(Lutador desafiante, Lutador desafiado, int rounds, String localLuta) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.rounds = rounds;
        this.localLuta = localLuta;
    }


    public boolean marcarLuta(Lutador l1, Lutador l2, int rounds, String localLuta) {
        if (!l1.getCategoria().equals(l2.getCategoria())) {
            System.out.println("Lutadadores de categoria diferentes");
            System.out.printf("Dasafiante: %S, de categoria %S%n" +
                            "Desafiado: %S, de categoria %S%n",
                    l1.getNome(), l1.getCategoria(),
                    l2.getNome(), l2.getCategoria());
        } else if (l1.getNome().equals(l2.getNome())) {
            System.out.print("Luta não pode acontecer, lutadores iguais\n");
        } else {
            this.desafiante = l1;
            this.desafiado = l2;
            this.rounds = rounds;
            this.localLuta = localLuta;
            return true;
        }
        return false;
    }

    public void lutar() {
        if (!marcarLuta(this.desafiante, this.desafiado, this.rounds, this.localLuta)) {
            System.out.println("Luta não autorizada!");
        } else {
            System.out.printf("%n*********************%n" +
                            "IIIIIIIIIT'S TIIIIIME!!%n" +
                            "Sejam bem vindos ao %S%n" +
                            "Introduzindo nossos lutadores!%n" +
                            "Esta luta terá %d rounds%n" +
                            "*********************%n%n",
                    this.localLuta, this.rounds);
            this.desafiante.apresentarLutador();
            this.desafiado.apresentarLutador();

            Random random = new Random();
            int resultado = random.nextInt(3);

            switch (resultado) {
                case 0:
                    System.out.println("Luta empatou");
                    break;
                case 1:
                    System.out.printf("Dasafiante %S ganhou", this.desafiante.getNome());
                    break;
                case 2:
                    System.out.printf("Desafiado %S ganhou", this.desafiado.getNome());
                    break;

            }
        }

    }


    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public boolean isAprovarLuta() {
        return aprovarLuta;
    }

    public void setAprovarLuta(boolean aprovarLuta) {
        this.aprovarLuta = aprovarLuta;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public String getLocalLuta() {
        return localLuta;
    }

    public void setLocalLuta(String localLuta) {
        this.localLuta = localLuta;
    }
}