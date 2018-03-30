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
public class TesteICCC {
    
    public static void main(String[] args) {
        Orcamento reforma = new Orcamento(500);
        Imposto novoImposto = new ICCC();
        
        System.out.println(novoImposto.calcula(reforma));
    }
    
}
