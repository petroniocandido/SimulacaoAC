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
    NO(-1,1),
    /**
     * Norte
     */
    N(0,1),
    /**
     * Nordeste
     */
    NE(1,1),
    /**
     * Oeste
     */
    O(-1,0),
    /**
     * Leste
     */
    L(1,0),
    /**
     * Sudoeste
     */
    SO(-1,-1),
    /**
     * Sul
     */
    S(0,-1),
    /**
     * Sudeste
     */
    SL(1,-1);
    
    private int x; 
    private int y;

    private Direcao(int x, int y) {
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
    
    
}
