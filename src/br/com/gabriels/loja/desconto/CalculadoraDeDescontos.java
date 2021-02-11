package br.com.gabriels.loja.desconto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public static BigDecimal calcula(Orcamento orcamento) {

        Desconto desconto = new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new DescontoParaOrcamentoComMaisDeCincoItens(new SemDesconto()));

        return desconto.calcula(orcamento);
    }
}
