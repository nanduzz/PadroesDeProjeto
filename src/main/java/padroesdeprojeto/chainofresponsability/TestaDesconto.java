/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto.chainofresponsability;

import padroesdeprojeto.strategy.orcamento.Item;
import padroesdeprojeto.strategy.orcamento.Orcamento;

/**
 *
 * @author ferna
 */
public class TestaDesconto {
    
    public static void main(String[] args) {
        CalculadorDeDesconto calculador = new CalculadorDeDesconto();
        Orcamento orcamento = new Orcamento(501.0); // Isso é estranho mas ta assim na aula né kk
        orcamento.adicionaItem(new Item("CANETA", 250.0));
        orcamento.adicionaItem(new Item("LAPIS", 250.0));
        
        double desconto = calculador.calcula(orcamento);
        System.out.println(desconto);
        
    }
    
}
