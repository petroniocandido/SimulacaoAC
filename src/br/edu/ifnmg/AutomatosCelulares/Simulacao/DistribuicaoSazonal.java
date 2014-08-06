/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import java.util.Date;
import java.util.HashMap;

/**
 * Uma distribuição sazonal é uma função que varia dependendo do tempo (hora,  período, estação, época, etc.)
 * Exemplos de funções sazonais: Temperatura média, humidade média
 * @author petronio
 */
public interface DistribuicaoSazonal<T> {
    public void setParametros(HashMap par);
    public T processar(Date d);
}
