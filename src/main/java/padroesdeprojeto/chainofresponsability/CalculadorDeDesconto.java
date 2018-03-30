/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto.chainofresponsability;

import padroesdeprojeto.strategy.orcamento.Orcamento;

/**
 *
 * @author ferna
 */
public class CalculadorDeDesconto {

    public double calcula(Orcamento orcamento) {
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);

        return d1.desconta(orcamento);
    }

}
