package br.com.gabriels.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private Integer quantidadeItens;
    private String situacao;

    public Orcamento(BigDecimal valor, Integer quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontro = BigDecimal.ZERO;
        if (situacao.equals("EM_ANALISE")) {
            valorDoDescontro = new BigDecimal("0.05");
        } else if (situacao.equals("APROVADO")) {
            valorDoDescontro = new BigDecimal("0.02");
        }

        this.valor.subtract(valorDoDescontro);
    }


    public void aprovar() {
        this.situacao = "APROVADO";
    }
}
