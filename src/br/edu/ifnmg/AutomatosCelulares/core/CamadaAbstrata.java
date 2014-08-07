/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.core;

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

    @Override
    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public int getComprimento() {
        return comprimento;
    }

    @Override
    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }


    @Override
    public Camada getCamadaSuperior() {
        return camadaSuperior;
    }

    @Override
    public void setCamadaSuperior(Camada camadaSuperior) {
        this.camadaSuperior = camadaSuperior;
    }

    @Override
    public Camada getCamadaInferior() {
        return camadaInferior;
    }

    @Override
    public void setCamadaInferior(Camada camadaInferior) {
        this.camadaInferior = camadaInferior;
    }
  
    @Override
    public void setCelula(int x, int y, Celula<E> c){
        celulas[x][y] = c;
        c.setX(x);
        c.setY(y);
    }
    
    @Override
    public Celula<E> getCelula(int x, int y) {
        if(x < 0 || y < 0 || x > largura || y > comprimento)
            return gerarCelulaBorda(x, y);
            
        return celulas[x][y];
    }
    
    @Override
    public Celula<E> gerarCelulaBorda(int x, int y){
        return null;
    }
    
    

    @Override
    public Celula<E>[] getVizinhos(Celula<E> celula) {
        Celula<E>[] tmp = new Celula[8];
        int x = celula.getX();
        int y = celula.getY();
        tmp[0] = getCelula(x-1,y-1);
        tmp[1] = getCelula(x,y-1);
        tmp[2] = getCelula(x+1,y-1);
        tmp[3] = getCelula(x-1,y);
        tmp[4] = getCelula(x+1,y);
        tmp[5] = getCelula(x-1,y+1);
        tmp[6] = getCelula(x,y+1);
        tmp[7] = getCelula(x+1,y+1);
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
    public void atualiza() {
        for(int x = 0; x < largura; x++)
            for(int y = 0; y < comprimento; y++){
                CelulaAbstrata<E> tmp = (CelulaAbstrata<E>)getCelula(x, y);
                tmp.setEstadoAnterior(tmp.getEstadoAtual());
                tmp.atualizarEstado();
            }            
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public void setZ(int z) {
        this.z = z;
    }
       
    
}
