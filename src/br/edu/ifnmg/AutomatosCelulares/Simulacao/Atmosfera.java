/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.Camada;
import br.edu.ifnmg.AutomatosCelulares.core.Celula;
import java.util.List;

/**
 *
 * @author petronio
 */
public class Atmosfera implements Camada<CelulaAtmosfera> {

    @Override
    public int getLargura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getComprimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Celula<CelulaAtmosfera> getCelula(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Celula<CelulaAtmosfera>> getVizinhos(Celula<CelulaAtmosfera> celula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualiza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
