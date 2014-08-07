/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.AutomatoCelular;
import java.util.Date;

/**
 *
 * @author petronio
 */
public class Simulacao extends AutomatoCelular {
    
    private Date dataInicial;
    
    private Date resolucaoTemporal;
    
    private int resolucaoEspacial;

    public Simulacao(int largura, int comprimento, int numeroCamadas) {
        super(largura, comprimento, numeroCamadas);
    }
    
    
}
