package aulas.senai.exercicio.desafio10;

//31.10.22
public class Principal {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[4];
        lutadores[0] = new Lutador("Lutador0", "Brasileiro", "Brasil", 90.3, 1.70, 29, 10, 2, 1);
        lutadores[1] = new Lutador("Lutador1", "Português", "Portugal", 89.5, 1.64, 32, 13, 5, 3);
        lutadores[2] = new Lutador("Lutador2", "Inglês", "EUA", 100, 1.90, 32, 9, 1, 5);
        lutadores[3] = new Lutador("Lutador3", "Autriaco", "Autria", 103, 1.92, 35, 19, 5, 2);

        for (Lutador lutador : lutadores) {
            lutador.status();
            System.out.println("********************");
        }

        Luta luta = new Luta();
        luta.marcarLuta(lutadores[0], lutadores[2], 5, "UFC RIO");
        luta.lutar();


    }
}
