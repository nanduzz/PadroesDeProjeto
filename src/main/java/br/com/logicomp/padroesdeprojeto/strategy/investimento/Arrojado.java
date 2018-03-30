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
public class Arrojado implements Investimento{
    
    private Random random;

    public Arrojado() {
        this.random = new Random();
    }

    @Override
    public double calcula(Conta conta) {
        int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1){
            return conta.getSaldo() * 0.05;
        }else if (chute >= 2 && chute <= 4){
            return conta.getSaldo() * 0.03;
        }
        return conta.getSaldo() * 0.006;
    }
    
    
    
}
