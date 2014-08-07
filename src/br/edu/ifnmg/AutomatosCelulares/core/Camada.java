package br.edu.ifnmg.AutomatosCelulares.core;


import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petronio
 */
public interface Camada<E> {
    public void setZ(int z);
    public int getZ();
    public void setCamadaSuperior(Camada c);
    public Camada getCamadaSuperior();
    public void setCamadaInferior(Camada c);
    public Camada getCamadaInferior();
    public void setLargura(int l);
    public int getLargura();
    public int getComprimento();
    public void setComprimento(int c);
    public void setCelula(int x, int y, Celula<E> c);
    public Celula<E> getCelula(int x, int y);
    public Celula<E>[] getVizinhos(Celula<E> celula);
    public Celula[] getVizinhosSuperiores(Celula<E> celula);
    public Celula[] getVizinhosInferiores(Celula<E> celula);
    public void atualiza();
    public Celula<E> gerarCelulaBorda(int x, int y);
}
