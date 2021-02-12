package br.com.gabriels.loja.desconto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComMaisDeCincoItens extends Desconto {

    public DescontoParaOrcamentoComMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    BigDecimal calcula(Orcamento orcamento) {
        if (orcamento.getQuantidadeItems() > 5) return orcamento.getValor().multiply(new BigDecimal("0.05"));

        return proximo.calcula(orcamento);
    }
}
