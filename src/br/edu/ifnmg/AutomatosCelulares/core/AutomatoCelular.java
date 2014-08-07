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
public class AutomatoCelular {

    private int largura;

    private int comprimento;

    private int quantidadeCamadas;

    private Camada[] camadas;

    public AutomatoCelular(int largura, int comprimento, int numeroCamadas) {
        this.largura = largura;
        this.comprimento = comprimento;
        this.quantidadeCamadas = numeroCamadas;
        this.camadas = new Camada[numeroCamadas];
    }
        

    public void setCamada(int indice, Camada c){
        camadas[indice] = c;
        c.setZ(indice);
    }
    
    public void avancarIteracao() {
        for (Camada c : camadas) {
            c.atualiza();
        }
    }
    
    public void avancarIteracao(int i) {
        while (i > 0) {
            avancarIteracao();
            i--;
        }
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getQuantidadeCamadas() {
        return quantidadeCamadas;
    }

    public void setQuantidadeCamadas(int quantidadeCamadas) {
        this.quantidadeCamadas = quantidadeCamadas;
    }

   

}
