package br.com.gabriels.loja.pedido;

import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedidoHandler {

    public void execute(GeraPedido dadosCliente) {
        Orcamento orcamento = new Orcamento(dadosCliente.getValorOrcamento(), dadosCliente.getQuantidadeItens());
        Pedido pedido = new Pedido("Gabriel Ronei", LocalDateTime.now(), orcamento);

        //SIMULANDO CHAMADAS PARA SALVAR E ENVIAR EMAIL DO PEDIDO
        System.out.println("SALVAR PEDIDO");
        System.out.println("ENVIAR EMAIL");
    }
}
