package doze_praticando_strings_regex.substituindo_parte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String palavraAntiga = sc.nextLine();
        if (!texto.contains(palavraAntiga)) {
            System.out.println("Palavra não encontrada");
            sc.close();
            return;
        }

        System.out.println("Digite a nova palavra: ");
        String palavraNova = sc.nextLine();

        String textoModificado = texto.replace(palavraAntiga, palavraNova);
        System.out.println("Texto modificado: " + textoModificado);
        sc.close();
    }
}
