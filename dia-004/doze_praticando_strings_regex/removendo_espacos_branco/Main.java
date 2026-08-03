package doze_praticando_strings_regex.removendo_espacos_branco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();

        String nomeFormatado = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormatado);
        sc.close();
    }
}
