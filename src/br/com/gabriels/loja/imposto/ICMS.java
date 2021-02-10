package br.com.gabriels.loja.imposto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
