/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.CamadaAbstrata;

/**
 *
 * @author petronio
 */
public class Solo extends CamadaAbstrata<CelulaSolo> {

    public Solo(int largura, int comprimento) {
        super(largura, comprimento);
    }

    @Override
    public void atualiza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
