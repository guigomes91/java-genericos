package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Guilherme Gomes
 * @param <E>
 */
public class Cesta<E> {
    
    private List<E> lista = new ArrayList<>();
    
    public void adiciona(E elemento){
        lista.add(elemento);
    }
    
    public E retira() {
        Random r = new Random(System.currentTimeMillis());
        return lista.remove(r.nextInt(lista.size()));
    }
    
    public boolean temItens() {
        return !lista.isEmpty();
    }
    
    public void adicionaTodos(Collection<? extends E> elementos) {
        elementos.forEach((e) -> {
            adiciona(e);
        });
    }
}    

