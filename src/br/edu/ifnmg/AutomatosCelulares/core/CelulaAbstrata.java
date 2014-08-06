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
    
    private E estado;

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public E getEstado() {
        return estado;
    }

    public void setEstado(E status) {
        this.estado = status;
    }
    
    
    
}
