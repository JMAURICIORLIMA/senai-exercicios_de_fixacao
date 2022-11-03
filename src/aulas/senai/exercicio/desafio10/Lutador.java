package aulas.senai.exercicio.desafio10;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private String pais;
    private double peso;
    private double altura;
    private int idade;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    public Lutador() {
    }


    public Lutador(String nome, String nacionalidade, String pais, double peso, double altura,
                   int idade, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.pais = pais;
        this.peso = peso;
        setCategoria(peso);
        this.altura = altura;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }


    public void apresentarLutador() {
        System.out.printf("Peso: %.2f%n" +
                        "Lutador de categoria %S %n" +
                        "Seu país de origem: %S %n" +
                        "de nacionalidade: %S %n" +
                        "Possui o cartel de %d vitórias %n" +
                        "%d derrotas %n" +
                        "%d empates %n" +
                        "ele %S.%n%n", this.peso,
                this.categoria, this.pais, this.nacionalidade, this.vitorias,
                this.derrotas, this.empates, this.nome);
    }

    public void status() {
        System.out.printf("Nome: %S%n" +
                        "Nacionalidade: %S%n" +
                        "Idade: %d%n" +
                        "Peso: %.2f%n" +
                        "Categoria: %S%n" +
                        "Altura: %.2f%n" +
                        "Vitórias: %d%n" +
                        "Empates: %d%n" +
                        "Derrotas: %d%n",
                this.nome, this.nacionalidade, this.idade,
                this.peso, this.categoria, this.altura, this.vitorias,
                this.empates, this.derrotas);
    }

    public void ganharLuta() {
        this.vitorias++;
    }

    public void perderLuta() {
        this.derrotas++;
    }

    public void empataLuta() {
        this.empates++;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(double peso) {
        if (peso <= 70) {
            this.categoria = "Peso leve";
        } else if (peso <= 80) {
            this.categoria = "Peso meio-médio";
        } else if (peso <= 90) {
            this.categoria = "Peso médio";
        } else {
            this.categoria = "Pesado";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}