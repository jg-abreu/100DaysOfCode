package onze_praticando_heranca_polimorfismo_interface.sistema_pagamentos;

class Pix extends Pagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de R$%.2f confirmado\n",
                valor);
    }
}

