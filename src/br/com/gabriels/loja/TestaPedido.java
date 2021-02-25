package br.com.gabriels.loja;

import br.com.gabriels.loja.orcamento.Orcamento;
import br.com.gabriels.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestaPedido {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);

        Pedido pedido = new Pedido("Gabriel Ronei", LocalDateTime.now(), orcamento);

        //SIMULANDO CHAMADAS PARA SALVAR E ENVIAR EMAIL DO PEDIDO
        System.out.println("SALVAR PEDIDO");
        System.out.println("ENVIAR EMAIL");
    }
}
