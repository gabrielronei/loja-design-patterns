package br.com.gabriels.loja.desconto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public static BigDecimal calcula(Orcamento orcamento) {
        if (orcamento.getQuantidadeItems() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
