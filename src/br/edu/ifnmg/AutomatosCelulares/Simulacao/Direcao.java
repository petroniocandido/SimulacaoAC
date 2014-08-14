/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

/**
 *
 * @author petronio
 */
public enum Direcao {
    /**
     * Noroeste
     */
    NO(0,-1,1),
    /**
     * Norte
     */
    N(1,0,1),
    /**
     * Nordeste
     */
    NE(2,1,1),
    /**
     * Oeste
     */
    O(3,-1,0),
    /**
     * Leste
     */
    L(4,1,0),
    /**
     * Sudoeste
     */
    SO(5,-1,-1),
    /**
     * Sul
     */
    S(6,0,-1),
    /**
     * Sudeste
     */
    SE(7,1,-1);
    
    private int x; 
    private int y;
    private int indice;

    private Direcao(int indice, int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
    
}
