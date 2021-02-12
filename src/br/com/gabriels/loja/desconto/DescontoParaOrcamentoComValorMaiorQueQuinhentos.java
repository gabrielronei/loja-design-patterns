package br.com.gabriels.loja.desconto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    BigDecimal calcula(Orcamento orcamento) {
        BigDecimal valorDoOrcamento = orcamento.getValor();
        if (valorDoOrcamento.compareTo(new BigDecimal("500")) > 0) return valorDoOrcamento.multiply(new BigDecimal("0.1"));

        return proximo.calcula(orcamento);
    }
}
