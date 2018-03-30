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
public class CalculadoraDeImposto {
    
    public void calcula(Orcamento orcamento, Imposto estrategiaDeImposto){
        double resultado = estrategiaDeImposto.calcula(orcamento);
        System.out.println(resultado);
    }
    
    
}
