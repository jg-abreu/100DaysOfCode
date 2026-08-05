package treze_praticando_colecoes_streams.adicionando_listas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add("João");
        listaFuncionarios.add("Maria");
        listaFuncionarios.add("Vitor");
        listaFuncionarios.add("Ana");

        System.out.printf("Lista de funcionarios: %s", listaFuncionarios);
    }
}
