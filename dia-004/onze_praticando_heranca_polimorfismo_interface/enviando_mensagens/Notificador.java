package onze_praticando_heranca_polimorfismo_interface.enviando_mensagens;

public class Notificador {

    public void enviarMensagem(String mensagem) {
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem) {
        System.out.printf("Mensagem para %s: %s \n", destinatario, mensagem);
    }

    public void enviarMensagem(String destinatario, String mensagem, int vezes) {
        for (int i = 0; i < vezes; i++) {
            System.out.printf("Mensagem para %s: %s\n", destinatario, mensagem);
        }
    }

}
