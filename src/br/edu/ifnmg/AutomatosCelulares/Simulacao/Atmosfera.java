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
public class Atmosfera extends CamadaAbstrata<CelulaAtmosfera> {

    /**
     * Representa a temperatura média por época do ano
     */
    private DistribuicaoSazonal<Integer> temperatura;
    
    /**
     * Representa a umidade média por época do ano
     */
    private DistribuicaoEspacial<Integer> umidade;
    
    /**
     * Direção atual do vento
     */
    private Direcao direcaoVento;
    
    /**
     * Velocidade do vento
     */
    private int velocidadeVento;

    public Atmosfera(int largura, int comprimento) {
        super(largura, comprimento);
    }
}
