package dez_praticando_encapsulamento.sistema_pontos;

public class Aluno {
    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void ganharPontos(int valorGanho) {
        pontos += valorGanho;
    }

    public void exibirStatus() {
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Pontos: %d\n", pontos);
        if (pontos < 100) {
            System.out.println("Nível: 1");
        } else if (pontos < 200) {
            System.out.println("Nível: 2");
        } else if (pontos < 300) {
            System.out.println("Nível: 3");
        } else {
            System.out.println("error");
        }
    }
}
