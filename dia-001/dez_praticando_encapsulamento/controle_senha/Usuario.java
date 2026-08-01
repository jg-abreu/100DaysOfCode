package dez_praticando_encapsulamento.controle_senha;

public class Usuario {
    private String senha;

    public Usuario(String senhaAtual) {
        this.senha = senhaAtual;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (senhaAtual.equals(this.senha)) {
            novaSenha = this.senha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        }
    }
}
