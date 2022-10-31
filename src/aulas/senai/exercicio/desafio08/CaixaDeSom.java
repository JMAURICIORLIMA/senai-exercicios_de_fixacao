package aulas.senai.exercicio.desafio08;

public class CaixaDeSom implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public CaixaDeSom() {
        this.volume = 30;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void aumentarVolume() {
        if (!this.ligado) {
        } else {
            this.volume += 5;
        }
    }

    @Override
    public void diminuirVolume() {
        if (!this.ligado) {
        } else {
            this.volume -= 5;
        }
    }

    @Override
    public void abrirMenu() {
        if (!ligado) {
            displayDesligado();
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
    public void ficharMenu() {
        System.out.println("---------------\n" +
                "---------------");
    }

    @Override
    public void ligarMudo() {
        setVolume(0);
    }

    @Override
    public void desligarMudo() {
        setVolume(30);
    }

    @Override
    public void play() {
        setTocando(true);
    }

    @Override
    public void pause() {
        setTocando(false);
    }

    @Override
    public void avancarMusica() {
        System.out.println(" Music >> ");
    }

    @Override
    public void voltarMusica() {
        System.out.println(" << Music ");
    }


    private void displayDesligado() {
        System.out.print("---------------\n" +
                "888888888888888\n" +
                "888888888888888\n" +
                "---------------\n");
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
