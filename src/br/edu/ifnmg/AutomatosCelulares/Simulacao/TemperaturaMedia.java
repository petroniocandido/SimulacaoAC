/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author petronio
 */
public class TemperaturaMedia implements DistribuicaoSazonal<Double> {

    private static final double TEMPERATURA_MAXIMA = 40.0;
    private static final double RADIANO = 0.0174532925;
    
    private static final Calendar cal = GregorianCalendar.getInstance();
    
    @Override
    public void setParametros(HashMap par) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Double processar(Date d) {
        Random rnd = new Random(d.getTime());
        Double tmp = TEMPERATURA_MAXIMA;
        cal.setTime(d);
        //cal.set(2014, 6, 1);
        Double rad = cal.get(Calendar.DAY_OF_YEAR) * RADIANO;
        tmp = (tmp * (Math.cos(rad) + 3)/4) + rnd.nextInt(5);
        return tmp;
    }
    
}
