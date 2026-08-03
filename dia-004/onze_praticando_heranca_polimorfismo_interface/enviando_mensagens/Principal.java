package onze_praticando_heranca_polimorfismo_interface.enviando_mensagens;

public class Principal {
    public static void main(String[] args) {
        Notificador notificacao = new Notificador();

        notificacao.enviarMensagem("Olá!");
        notificacao.enviarMensagem("João", "Bom dia!");
        notificacao.enviarMensagem("Maria", "Atenção!", 2);
    }
}
