package onze_praticando_heranca_polimorfismo_interface.sistema_bancario;

public class Main {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(200);
        OperacaoBancaria saque = new Saque(50);

        deposito.executar();
        saque.executar();
    }
}
