package doze_praticando_strings_regex.maiuscula_minuscula;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Texto em maiúsculas: " + texto.toUpperCase());
        System.out.println("Texto em minúsculas: " + texto.toLowerCase());
    }
}
