package onze_praticando_heranca_polimorfismo_interface.gerenciamento_biblioteca;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int anoDePublicacao, int edicao) {
        super(titulo, anoDePublicacao);
        this.edicao = edicao;
    }

    public void exibirInfo() {
        System.out.printf("Código: %s | Revista: %s - Edição: %s\n",
                gerarCodigo(), getTitulo(), edicao);
    }
}
