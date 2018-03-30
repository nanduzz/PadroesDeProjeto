/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logicomp.padroesdeprojeto.strategy.investimento;

/**
 *
 * @author ferna
 */
public class RealizaInvestimento {
    
    public void realiza(Conta conta, Investimento investimento){
        double resultado = investimento.calcula(conta);
        
        conta.deposita(resultado * 0.75);
        
        System.out.println("Novo Saldo:" + conta.getSaldo());
    }
    
}
