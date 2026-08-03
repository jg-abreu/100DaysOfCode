package onze_praticando_heranca_polimorfismo_interface.sistema_bancario;

public abstract class OperacaoBancaria implements AcaoBancaria{
    protected int valor;

    public OperacaoBancaria(int valor) {
        this.valor = valor;
    }
}
