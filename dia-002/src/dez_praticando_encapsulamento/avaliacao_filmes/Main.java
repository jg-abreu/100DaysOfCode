package dez_praticando_encapsulamento.avaliacao_filmes;

public class Main {
    public static void main(String[] args) {
        Filme matrix = new Filme("Matrix");
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        System.out.printf("Média das avalições para %s: %.2f\n",
                matrix.getTitulo(), matrix.calcularMedia());
    }
}
