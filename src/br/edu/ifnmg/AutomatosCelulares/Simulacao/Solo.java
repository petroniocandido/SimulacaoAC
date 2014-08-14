/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.CamadaAbstrata;
import br.edu.ifnmg.AutomatosCelulares.core.Celula;

/**
 *
 * @author petronio
 */
public class Solo extends CamadaAbstrata<CelulaSolo> {

    public Solo(int largura, int comprimento) {
        super(largura, comprimento);
    }
    
    @Override
    public Celula<CelulaSolo>[] getVizinhos(Celula<CelulaSolo> celula) {
        Celula<CelulaSolo>[] tmp = new Celula[8];
        int x = celula.getX();
        int y = celula.getY();
        tmp[Direcao.NO.getIndice()] = getCelula(x+Direcao.NO.getX(),y+Direcao.NO.getY());
        tmp[Direcao.N.getIndice()] = getCelula(x+Direcao.N.getX(),y+Direcao.N.getY());
        tmp[Direcao.NE.getIndice()] = getCelula(x+Direcao.NE.getX(),y+Direcao.NE.getY());
        tmp[Direcao.O.getIndice()] = getCelula(x+Direcao.O.getX(),y+Direcao.O.getY());
        tmp[Direcao.L.getIndice()] = getCelula(x+Direcao.L.getX(),y+Direcao.L.getY());
        tmp[Direcao.SO.getIndice()] = getCelula(x+Direcao.SO.getX(),y+Direcao.SO.getY());
        tmp[Direcao.S.getIndice()] = getCelula(x+Direcao.S.getX(),y+Direcao.S.getY());
        tmp[Direcao.SE.getIndice()] = getCelula(x+Direcao.SE.getX(),y+Direcao.SE.getY());
        return tmp;
    }


    @Override
    public void atualiza() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
