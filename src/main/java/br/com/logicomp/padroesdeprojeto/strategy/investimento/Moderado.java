/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.logicomp.padroesdeprojeto.strategy.investimento;

import java.util.Random;

/**
 *
 * @author ferna
 */
public class Moderado implements Investimento{
    private Random random;

    public Moderado() {
        this.random = new Random();
    }
    
    @Override
    public double calcula(Conta conta) {
        if(random.nextInt(2) == 0){
            return conta.getSaldo() * 0.025;
        }
        return conta.getSaldo() * 0.007;
    }
}
