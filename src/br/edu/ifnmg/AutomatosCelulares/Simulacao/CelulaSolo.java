/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.Celula;
import br.edu.ifnmg.AutomatosCelulares.core.CelulaAbstrata;

/**
 *
 * @author petronio
 */
public class CelulaSolo extends CelulaAbstrata<Long> {

    private TipoSolo tipo;
    
    @Override
    public void atualizarEstado() {
        
        // Calcula a qtd de água recebida por precipitação chuvosa (por unidade de área/tempo)
        
        Long precipitacao = (Long)getCamada().getVizinhosInferiores(this)[0].getEstadoAnterior();
        estadoAtual += precipitacao;
        
        // Calcula a qtd de água perdida por evaporação (por unidade de área/tempo)
        
        Long evapotranspiracao = 0L;
        
        estadoAtual -= evapotranspiracao;
        
        // Calcula a qtd de água recebida por escorrimento dos terrenos vizinhos  (por unidade de área/tempo)
        
        for(Celula c : getCamada().getVizinhos(this)){
            CelulaSolo tmp = (CelulaSolo)c;
            if(tmp.getZ() > this.getZ()){
                // O terreno vizinho é mais alto do que o atual
                // O atual receberá enxurrada
            }
            if(tmp.getZ() == this.getZ()){
                // O terreno vizinho é tem a mesma altura do que o atual
                // O nível de umidade vai ser equalizaod
            }
            if(tmp.getZ() < this.getZ()){
                // O terreno vizinho é mais baixo do que o atual
                // O vizinho receberá enxurrada
            }
        }
    }
    
}
