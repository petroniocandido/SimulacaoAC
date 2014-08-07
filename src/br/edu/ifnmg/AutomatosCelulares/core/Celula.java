package br.edu.ifnmg.AutomatosCelulares.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petronio
 */
public interface Celula<E> {
    
    public void setX(int x);
    public int getX();
    public void setY(int y);
    public int getY();
    public void setZ(int z);
    public int getZ();
    public E getEstadoAnterior();
    public E getEstadoAtual();
    public void atualizarEstado();    
}
