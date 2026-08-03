package onze_praticando_heranca_polimorfismo_interface.implementando_interface;

public class Main {
    public static void main(String[] args) {
        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado."
        );

        rel.imprimir();
    }
}
