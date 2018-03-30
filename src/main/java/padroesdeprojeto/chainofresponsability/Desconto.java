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
public interface Desconto {
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);
}
