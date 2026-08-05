package treze_praticando_colecoes_streams.removendo_lista;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Joana");
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Antônio");

        System.out.println("Lista inicial: " + lista);

        lista.remove("Pedro");

        System.out.println("Lista após a exclusão: " + lista);
    }
}