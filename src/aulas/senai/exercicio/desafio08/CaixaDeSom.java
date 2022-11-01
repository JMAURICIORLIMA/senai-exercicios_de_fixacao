package aulas.senai.exercicio.desafio08;

import java.sql.SQLOutput;

public class CaixaDeSom implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;
    private String mensagemDisplay;

    public CaixaDeSom() {
        this.volume = 30;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("\n*PRESSIONOU LIGAR*\n");
        display();
    }

    @Override
    public void desligar() {
        setLigado(false);
        System.out.println("\n*PRESSIONOU DESLIGAR*\n");
        display();
    }

    @Override
    public void aumentarVolume() {
        System.out.println("\n*PRESSIONOU AUMENTAR VOLUME*\n");
        this.volume += 5;
    }

    @Override
    public void diminuirVolume() {
        System.out.println("\n*PRESSIONOU DIMINUIR VOLUME*\n");
        this.volume -= 5;
    }

    @Override
    public void abrirMenu() {
        System.out.println("\n*PRESSIONOU ABRIR MENU*\n");
        if (!isLigado()) {
            display();
        } else {
            String tocar = isTocando() ? "TOCANDO" : "......";
            System.out.printf("---------------\n" +
                            "Volume: [ %d ]\n" +
                            "... %S ...\n" +
                            "---------------\n",
                    getVolume(), tocar);
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\n*PRESSIONOU FECHAR MENÚ*\n");
        if (!isLigado()) {
        } else {
            System.out.println("---------------\n" +
                    "---------------");
        }
    }

    @Override
    public void ligarMudo() {
        System.out.println("\n*PRESSIONOU LIGAR MUDO*\n");
        if (!isLigado()) {
        } else {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        System.out.println("\n*PRESSIONOU DESLIGAR MUDO*\n");
        if (!isLigado()) {
        } else {
            setVolume(30);
        }
    }

    @Override
    public void play() {
        System.out.println("\n*PRESSIONOU PLAY*\n");
        if (!isLigado()) {
        } else {
            setTocando(true);
            display();
        }
    }

    @Override
    public void pause() {
        System.out.println("\n*PRESSIONOU PAUSE*\n");
        if (!isLigado()) {
        } else {
            setTocando(false);
            display();
        }
    }

    @Override
    public void avancarMusica() {
        System.out.println("\n*PRESSIONOU AVANÇAR MÚSICA*\n");
        if (!isLigado()) {
        } else {
            System.out.println(" Music >> ");
        }
    }

    @Override
    public void voltarMusica() {
        System.out.println("\n*PRESSIONOU VOLTAR MÚSICA*\n");
        if (!isLigado()) {
        } else {
            System.out.println(" << Music ");
        }
    }


    private void display() {
        if (!isLigado()) {
            System.out.print("\n---------------\n" +
                    "888888888888888\n" +
                    "888888888888888\n" +
                    "---------------\n");
        } else {
            System.out.printf("\n---------------\n" +
                            "... "+msgDisplay()+" ...\n" +
                            "Volume: [ %d ]\n" +
                            "---------------\n",
                    getVolume());
        }
    }

    private String msgDisplay(){
        if (!isTocando()){
            mensagemDisplay = "......";
            return mensagemDisplay;
        } else {
            mensagemDisplay = "TOCANDO";
            return mensagemDisplay;
        }
    }


    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
