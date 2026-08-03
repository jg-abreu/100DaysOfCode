package doze_praticando_strings_regex.parte_string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();

        int posicaoPonto = arquivo.indexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = arquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensão: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo não possui extensão.");
        }
        sc.close();
    }
}
