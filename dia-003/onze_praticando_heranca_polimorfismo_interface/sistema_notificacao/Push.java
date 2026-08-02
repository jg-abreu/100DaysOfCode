package onze_praticando_heranca_polimorfismo_interface.sistema_notificacao;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String titulo,String mensagem) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    void enviar() {
        System.out.printf("\nEnviando Push para: %s\nTítulo: %s\nConteúdo: %s\n", getDestinatario(), titulo, getMensagem());

    }
}
