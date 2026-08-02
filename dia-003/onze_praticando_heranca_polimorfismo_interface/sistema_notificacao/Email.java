package onze_praticando_heranca_polimorfismo_interface.sistema_notificacao;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String assunto,String mensagem) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s\n", getDestinatario(), assunto, getMensagem());

    }
}
