/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padroesdeprojeto.strategy.orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ferna
 */
public class Orcamento {

    private double valor;
    private List<Item> itens = new ArrayList<Item>();

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(this.itens);
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

}
