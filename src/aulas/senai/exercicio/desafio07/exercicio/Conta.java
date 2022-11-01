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

    public void depositar(double deposito) {
        this.saldo += deposito;
        if (deposito < 1.00 && !status) {
            System.out.printf("Valor do depósito não permitido ou conta não inexistente.\n" +
                    "valor abaixo de R$ 1,00 - [%.2f]", deposito);
        } else {
            System.out.printf("Depósito realizado com sucesso.\n" +
                    "Valor do depósito R$ [%.2f]", deposito);
        }
    }

    public void sacar(double saque) {
        this.saldo -= saque;
        if (saque > this.saldo && !status) {
            System.out.printf("Valor de saque maior que valor atual.\n" +
                            "Saldo R$ %.2f\n" +
                            "Saque R$ %.2f\n",
                    this.saldo, saque);
        } else {
            System.out.printf("Saque realizado com sucesso.\n" +
                            "Valor do saque R$ [%.2f]\n" +
                            "Saldo atual R$ [%.2f]",
                    saque, this.saldo);
        }
    }

    public void saldo() {
        if (!status) {
            System.out.println("Conta inexistente.");
        } else {
            System.out.printf("Saldo R$ [%.2f]", this.saldo);
        }
    }

    public void detalheDaConta() {
        System.out.printf("\n**********RELATÓRIO**********\n" +
                        "Proprietário - %s\n" +
                        "Tipo conta - %s\n" +
                        "Numero da conta - %s\n" +
                        "Status - %b\n" +
                        "Saldo - %.2f\n" +
                        "*****************************\n",
                this.proprietarioDaConta,
                this.tipoConta,
                this.numeroConta,
                this.status,
                this.saldo);
    }


    public String getNumeroConta() {
        return numeroConta;
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
