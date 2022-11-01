package aulas.senai.exercicio.exercicio.desafio08;

public class Banco implements IBanco{
    private String nome;
    private String agenciaNumero;
    private String endereco;

    public Banco(String nome, String agenciaNumero, String endereco) {
        this.nome = nome;
        this.agenciaNumero = agenciaNumero;
        this.endereco = endereco;
    }

    @Override
    public void nome() {
        System.out.println("Nome: " + getNome());
    }

    @Override
    public void agenciaNumero() {

    }

    @Override
    public void endereco() {

    }

    public void informacoes(){
        System.out.printf("Nome do Banco: %S\n" +
                "Nº agência: %S\n" +
                "Endereço: %S\n",
                this.getNome(),
                this.getAgenciaNumero(),
                this.getEndereco());
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getAgenciaNumero() {
        return agenciaNumero;
    }

    private void setAgenciaNumero(String agenciaNumero) {
        this.agenciaNumero = agenciaNumero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
