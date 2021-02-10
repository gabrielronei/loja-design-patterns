package br.com.gabriels.loja;

import br.com.gabriels.loja.imposto.*;
import br.com.gabriels.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class LojaApplication {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(100));

        BigDecimal valorDoImposto = CalculadoraDeImpostos.calcula(orcamento, new ICMS());

        System.out.println(valorDoImposto);
    }
}
