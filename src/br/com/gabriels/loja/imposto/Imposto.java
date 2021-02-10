package br.com.gabriels.loja.imposto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    BigDecimal calcula(Orcamento orcamento);
}
