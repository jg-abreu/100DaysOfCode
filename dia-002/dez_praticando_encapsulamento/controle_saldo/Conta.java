package dez_praticando_encapsulamento.controle_saldo;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valorDepositar) {
        saldo += valorDepositar;
    }

    public void sacar (double valorSacar) {
        if (saldo < valorSacar) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valorSacar;
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de Ana: %.2f", saldo);
    }
}
