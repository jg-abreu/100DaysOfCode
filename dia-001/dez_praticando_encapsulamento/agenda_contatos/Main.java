package dez_praticando_encapsulamento.agenda_contatos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contato> listaDeContatos = new ArrayList<>();

        listaDeContatos.add(new Contato("João Silva", "(11) 99999-0000"));
        listaDeContatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
        listaDeContatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));

        System.out.println("Lista de contatos:");
        int indice = 1;
        for (Contato c : listaDeContatos) {
            System.out.printf("%d. %s - %s\n",
                    indice++,
                    c.getNome(),
                    c.getTelefone());
        }
    }
}
