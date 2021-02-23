package br.com.gabriels.loja.orcamento.situacao;

import br.com.gabriels.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {
    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
