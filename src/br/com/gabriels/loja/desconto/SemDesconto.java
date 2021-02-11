package br.com.gabriels.loja.desconto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    @Override
    BigDecimal calcula(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }
}
