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
public class SemDesconto implements Desconto{

    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        // Não tem
    }
    
}
