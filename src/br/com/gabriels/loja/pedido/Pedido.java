package br.com.gabriels.loja.pedido;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String nomeCliente;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String nomeCliente, LocalDateTime data, Orcamento orcamento) {
        this.nomeCliente = nomeCliente;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
