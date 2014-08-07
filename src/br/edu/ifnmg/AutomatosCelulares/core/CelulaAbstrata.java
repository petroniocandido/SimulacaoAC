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
public abstract class CelulaAbstrata<E> implements Celula<E> {

    private int x, y, z;
    
    private E estadoAnterior;
    
    protected E estadoAtual;
    
    private Camada<E> camada;

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public E getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstado(E status) {
        this.estadoAtual = status;
    }

    @Override
    public E getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(E estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public Camada<E> getCamada() {
        return camada;
    }

    public void setCamada(Camada<E> camada) {
        this.camada = camada;
    }
    
}
