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
public class Conservador implements Investimento{

    @Override
    public double calcula(Conta conta) {
        return conta.getSaldo() * 0.008;
    }
    
}
