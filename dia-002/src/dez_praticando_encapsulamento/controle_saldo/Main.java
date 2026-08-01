package dez_praticando_encapsulamento.controle_saldo;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Ana", 1000.00);
        conta.depositar(1000.00);
        conta.sacar(1200.00);
        conta.exibirSaldo();
    }
}
