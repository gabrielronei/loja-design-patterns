package br.com.gabriels.loja.orcamento.situacao;

import br.com.gabriels.loja.DomainException;
import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SituacaoOrcamento {

    public BigDecimal calcularValorDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }


    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento no pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser finalizado!");
    }
}
