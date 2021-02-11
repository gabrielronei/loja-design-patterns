package br.com.gabriels.loja.desconto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    abstract BigDecimal calcula(Orcamento orcamento);
}
