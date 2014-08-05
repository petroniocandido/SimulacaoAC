package br.edu.ifnmg.AutomatosCelulares.core;


import br.edu.ifnmg.AutomatosCelulares.core.Camada;
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
public class AutomatoCelular {

    private int largura;

    private int comprimento;

    private int numeroCamadas;

    private List<Camada> camadas;

    public void avançarIteracao() {
        for (Camada c : camadas) {
            c.atualiza();
        }
    }

    public void avançarIteracao(int i) {
        while (i > 0) {
            for (Camada c : camadas) {
                c.atualiza();
            }
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

    public int getNumeroCamadas() {
        return numeroCamadas;
    }

    public void setNumeroCamadas(int numeroCamadas) {
        this.numeroCamadas = numeroCamadas;
    }

    public List<Camada> getCamadas() {
        return camadas;
    }

    public void setCamadas(List<Camada> camadas) {
        this.camadas = camadas;
    }

}
