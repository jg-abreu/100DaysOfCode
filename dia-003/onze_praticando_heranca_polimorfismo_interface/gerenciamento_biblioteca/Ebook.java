package onze_praticando_heranca_polimorfismo_interface.gerenciamento_biblioteca;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int anoDePublicacao, String formato) {
        super(titulo, anoDePublicacao);
        this.formato = formato;
    }

    public void exibirInfo() {
        System.out.printf("Código: %s | Ebook: %s - Formato: %s\n",
                gerarCodigo(), getTitulo(), formato);
    }
}
