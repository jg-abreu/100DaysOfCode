package dez_praticando_encapsulamento.nivel_bateria;

public class Bateria {
    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;

        if (nivelBateria <= 20) {
            System.out.println("Status: Bateria fraca");
        } else if (nivelBateria < 80) {
            System.out.println("Status: Bateria ok");
        } else {
            System.out.println("Status: Bateria cheia");
        }
    }
}
