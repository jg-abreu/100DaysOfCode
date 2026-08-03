package onze_praticando_heranca_polimorfismo_interface.controle_reservas;

public class Reserva {
    public void reservar() {
        System.out.printf("Reserva realizada!\n");
    }

    public void reservar(String data) {
        System.out.printf("Reserva realizada para o dia %s!\n", data);
    }

    public void reservar(String data, int quantidadePessoas) {
        System.out.printf("Reserva feita para para o dia %s para %d pessoas!\n", data, quantidadePessoas);
    }
}
