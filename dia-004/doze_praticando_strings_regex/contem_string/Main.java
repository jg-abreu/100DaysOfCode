package doze_praticando_strings_regex.contem_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Digite a palavra: ");
        String palavraDesejada = sc.nextLine();

        if(texto.contains(palavraDesejada)) {
            System.out.println("A palavra " + palavraDesejada + " está presente no texto");
        } else {
            System.out.println("A palavra " + palavraDesejada + " não está presente no texto");
        }
        sc.close();
    }
}
