/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Apresentacao.console;

import br.edu.ifnmg.AutomatosCelulares.Simulacao.TemperaturaMedia;
import java.util.Date;

/**
 *
 * @author petronio
 */
public class Console {
    public static void main(String[] args){
        TemperaturaMedia tm = new TemperaturaMedia();
        System.out.println(tm.processar(new Date()));
    }
}
