/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.Celula;
import br.edu.ifnmg.AutomatosCelulares.core.CelulaAbstrata;

/**
 *
 * @author petronio
 */
public class CelulaSolo extends CelulaAbstrata<Long> {

    private TipoSolo tipo;
    
    private double altura;
    
    private double humidadeAtual;
    
    @Override
    public Long getEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}