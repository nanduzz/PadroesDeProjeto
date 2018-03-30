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
public class DescontoPorMaisDeQuinhentosReais implements Desconto {

    private Desconto proximo;


    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.07;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
