package onze_praticando_heranca_polimorfismo_interface.gerenciamento_biblioteca;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int anoDePublicacao, String autor) {
        super(titulo, anoDePublicacao);
        this.autor = autor;
    }

    public void exibirInfo() {
        System.out.printf("Código: %s | Livro: %s - Autor: %s\n",
                gerarCodigo(), getTitulo(), autor);
    }
}
