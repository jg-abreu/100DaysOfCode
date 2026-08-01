package dez_praticando_encapsulamento.validacao_login;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario aluno = new Usuario("aluno2026", "escola@123");
        int tentativasRestantes = 3;

        while (tentativasRestantes > 0) {
            System.out.println("Digite o seu usuário: ");
            String usuario = sc.nextLine();

            System.out.println("Digite sua senha: ");
            String senha = sc.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes == 0) {
                    System.out.println("Acesso bloqueado. Contate um administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: " + tentativasRestantes);
                }
            }
        }
        sc.close();
    }
}
