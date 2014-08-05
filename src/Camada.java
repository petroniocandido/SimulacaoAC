
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
public interface Camada<E> {
    public int getLargura();
    public int getComprimento();
    public Celula<E> getCelula(int x, int y);
    public List<Celula<E>> getVizinhos(Celula<E> celula);
    public void atualiza();
}
