/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto.strategy.orcamento;

/**
 *
 * @author ferna
 */
public class ICCC implements Imposto {

    @Override
    public double calcula(Orcamento orcamento) {
        if (orcamento.getValor() < 1000) {
            return orcamento.getValor() * 0.05;
        } else if (orcamento.getValor() <= 3000) {
            return orcamento.getValor() * 0.07;
        } else {
            return orcamento.getValor() * 0.08 + 30;
        }

    }

}
