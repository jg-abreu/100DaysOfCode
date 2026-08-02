package onze_praticando_heranca_polimorfismo_interface.identificar_estudante;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernada", "regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }



}
