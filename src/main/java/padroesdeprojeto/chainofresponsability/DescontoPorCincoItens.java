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
public class DescontoPorCincoItens implements Desconto{

    private Desconto proximo;
    @Override
    public double desconta(Orcamento orcamento) {
        if(orcamento.getItens().size() > 5){
            return orcamento.getValor() * 0.1;
        }
        return proximo.desconta(orcamento);
        
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
    
}
