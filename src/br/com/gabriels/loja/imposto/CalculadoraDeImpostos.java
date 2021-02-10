package br.com.gabriels.loja.imposto;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public static BigDecimal calcula(Orcamento orcamento, Imposto imposto) {
        return imposto.calcula(orcamento);
    }
}
