/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.core;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author petronio
 */
public abstract class CamadaAbstrata<E> implements Camada<E> {

    private int largura, comprimento;
    private Celula<E>[][] celulas;
    
    private Camada camadaSuperior;
    private Camada camadaInferior;
    
    private int z;

    public CamadaAbstrata(int largura, int comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.celulas = new Celula[largura][comprimento];
    }
        

    @Override
    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }


    @Override
    public Camada getCamadaSuperior() {
        return camadaSuperior;
    }

    public void setCamadaSuperior(Camada camadaSuperior) {
        this.camadaSuperior = camadaSuperior;
    }

    @Override
    public Camada getCamadaInferior() {
        return camadaInferior;
    }

    public void setCamadaInferior(Camada camadaInferior) {
        this.camadaInferior = camadaInferior;
    }
  
    
    @Override
    public Celula<E> getCelula(int x, int y) {
        return celulas[x][y];
    }

    @Override
    public Celula<E>[] getVizinhos(Celula<E> celula) {
        Celula<E>[] tmp = new Celula[8];
        int x = celula.getX();
        int y = celula.getY();
        tmp[0] = celulas[x-1][y-1];
        tmp[1] = celulas[x][y-1];
        tmp[2] = celulas[x+1][y-1];
        tmp[3] = celulas[x-1][y];
        tmp[4] = celulas[x+1][y];
        tmp[5] = celulas[x-1][y+1];
        tmp[6] = celulas[x][y+1];
        tmp[7] = celulas[x+1][y+1];
        return tmp;
    }
    
    @Override
    public Celula[] getVizinhosSuperiores(Celula<E> celula){
        Celula<E>[] tmp = new Celula[1];
        tmp[0] = getCamadaSuperior().getCelula(celula.getX(), celula.getY());
        return tmp;
    }
    
    @Override
    public Celula[] getVizinhosInferiores(Celula<E> celula){
        Celula<E>[] tmp = new Celula[1];
        tmp[0] = getCamadaInferior().getCelula(celula.getX(), celula.getY());
        return tmp;
    }

    @Override
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
       
    
}
