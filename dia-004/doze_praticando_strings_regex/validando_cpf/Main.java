package doze_praticando_strings_regex.validando_cpf;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o CPf: ");
        String cpf = sc.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if(cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }
        sc.close();
    }
}
