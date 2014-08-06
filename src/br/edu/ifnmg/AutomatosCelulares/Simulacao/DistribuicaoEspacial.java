/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import java.util.HashMap;

/**
 * Uma distribuição espacial é uma função que varia dependendo da localização no espaço (latitude, longitude e altura)
 * Exemplos de distribuições espaciais: 
 * @author petronio
 */
public interface DistribuicaoEspacial<T> {
    public void setParametros(HashMap par);
    public T processar(Long x, Long y, Long z);
}
