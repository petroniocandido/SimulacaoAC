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
    private List<Celula<E>> celulas;
    
    private Camada camadaSuperior;
    private Camada camadaInferior;
    
    private int z;

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

    public List<Celula<E>> getCelulas() {
        return celulas;
    }

    public void setCelulas(List<Celula<E>> celulas) {
        this.celulas = celulas;
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
        return celulas.get(y * largura + x);
    }

    @Override
    public List<Celula<E>> getVizinhos(Celula<E> celula) {
        List<Celula<E>> tmp = new ArrayList<>();
        tmp.add(getCelula(celula.getX()-1, celula.getY()-1));
        tmp.add(getCelula(celula.getX()-1, celula.getY()-1));
        return tmp;
    }
    
    @Override
    public List<Celula> getVizinhosSuperiores(Celula<E> celula){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Celula> getVizinhosInferiores(Celula<E> celula){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
    
}
