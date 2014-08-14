/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.AutomatosCelulares.Simulacao;

import br.edu.ifnmg.AutomatosCelulares.core.Camada;
import br.edu.ifnmg.AutomatosCelulares.core.Celula;
import br.edu.ifnmg.AutomatosCelulares.core.CelulaAbstrata;

/**
 * O estado desse tipo de célula representa a quantidade de umidade contida no solo
 * @author petronio
 */
public class CelulaSolo extends CelulaAbstrata<Long> {

    private TipoSolo tipo;
    
    private Direcao inclinacao;

    public CelulaSolo(TipoSolo tipo, Direcao inclinacao, int x, int y, int z, Long estadoAtual, Camada<Long> camada) {
        super(x, y, z, estadoAtual, camada);
        this.tipo = tipo;
        this.inclinacao = inclinacao;
    }
 
    
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
            
            // So haverá escorrimento horizontal de água se houver volume de água sobre a superfície
            // estado >= XXX mm/cm^2
            
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
                
                // 1º Calcular o ângulo de inclinação entre as duas superfícies
                    double tg_this = this.getZ() / this.getX();
                    double tg_tmp = tmp.getZ() / tmp.getX();
                    double angulo = Math.atan(tg_this) - Math.atan(tg_tmp);
                
                // 2º Calcular a velocidade de deslocamente a partir do ângulo e gravidade
                //      Considerando que não há atrito
                //      acel = g*sen(angulo)     vel = vel_in + acel*t
                
                // 3º Para a área (resolução espacial) e unidade de tempo (resolução temporal)
                //    calcular o volume de água deslocado
                //    area * (vel
                
            }
        }
    }
    
}
