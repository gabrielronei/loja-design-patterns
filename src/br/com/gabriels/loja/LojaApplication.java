package br.com.gabriels.loja;

import br.com.gabriels.loja.desconto.CalculadoraDeDescontos;
import br.com.gabriels.loja.imposto.*;
import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class LojaApplication {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100), 1);

        BigDecimal valorDoImposto = CalculadoraDeImpostos.calcula(orcamento, new ICMS());

        System.out.println(valorDoImposto);

        System.out.println("-------------------------- DESCONTO --------------------------");

        Orcamento outroOrcamento = new Orcamento(new BigDecimal(100), 5);
        Orcamento outroOrcamentoComDesconto = new Orcamento(new BigDecimal(1000), 5);

        BigDecimal valorDoDesconto = CalculadoraDeDescontos.calcula(outroOrcamento);
        BigDecimal valorDoDescontoDois = CalculadoraDeDescontos.calcula(outroOrcamentoComDesconto);

        System.out.println(valorDoDesconto);
        System.out.println(valorDoDescontoDois);
    }
}
