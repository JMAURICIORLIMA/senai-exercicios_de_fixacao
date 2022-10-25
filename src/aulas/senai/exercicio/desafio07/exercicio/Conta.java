package aulas.senai.exercicio.desafio07.exercicio;

public class Conta {
    private String numeroConta;
    private TipoConta tipoConta;
    private String proprietarioDaConta;
    private double saldo;
    private boolean status;

    public Conta(String numeroConta, TipoConta tipoConta, String proprietarioDaConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.proprietarioDaConta = proprietarioDaConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getProprietarioDaConta() {
        return proprietarioDaConta;
    }

    public void setProprietarioDaConta(String proprietarioDaConta) {
        this.proprietarioDaConta = proprietarioDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
