package br.com.gabriels.loja.imposto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {
    public BigDecimal calcula(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.6"));
    }
}
