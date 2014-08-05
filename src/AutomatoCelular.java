
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
   
    private List<Camada> camadas;
    
    private int iteracoes;
    
    public void avançarIteracao() {
        for(Camada c : camadas)
            c.atualiza();
    }
}
