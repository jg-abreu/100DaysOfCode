package treze_praticando_colecoes_streams.acessando_elementos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> funcionarios = new ArrayList<>();

        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("Total de funcionarios: " + funcionarios.size());

    }
}
