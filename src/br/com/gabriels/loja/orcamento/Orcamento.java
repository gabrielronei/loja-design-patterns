package br.com.gabriels.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItems;

    public Orcamento(BigDecimal valor, Integer quantidadeItems) {
        this.valor = valor;
        this.quantidadeItems = quantidadeItems;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItems() {
        return quantidadeItems;
    }
}
