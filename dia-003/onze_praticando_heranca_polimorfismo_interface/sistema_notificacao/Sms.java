package onze_praticando_heranca_polimorfismo_interface.sistema_notificacao;

public class Sms extends Notificacao{

    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s\n", getDestinatario(), getMensagem());
    }
}
