package br.com.gabriels.loja;

import br.com.gabriels.loja.pedido.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class TestaPedido {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        GeraPedido pedido = new GeraPedido(entrada.next(), new BigDecimal(entrada.next()), entrada.nextInt());
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler();

        geraPedidoHandler.execute(pedido);
    }
}
