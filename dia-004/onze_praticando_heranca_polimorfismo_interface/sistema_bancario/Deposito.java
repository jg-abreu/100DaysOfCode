package onze_praticando_heranca_polimorfismo_interface.sistema_bancario;

public class Deposito extends OperacaoBancaria{

    public Deposito(int valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Depósito de R$%d realizado!\n", valor);
    }
}
