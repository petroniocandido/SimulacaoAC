/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.CelulaAbstrata;

/**
 * O estado desse tipo de célula representa a quantidade de água precipitada ao solo
 * @author petronio
 */
public class CelulaAtmosfera  extends CelulaAbstrata<Long> {

    private double umidadeAtual;
    
    @Override
    public void atualizarEstado() {
        // Formula que dê a qtde de água precipitada a partir da umidade relativa do ar, temperatura, etc...
        
    }
    
}
