package principal;

import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class ImprimeArray {
    
    public static <Z> void imprimeArray(Z[] array) {
        for (Z elemento : array) {
            System.out.print(elemento + " ");
            System.out.println();
        }
    }
    
    public <E> E primeiro(List<E> list) {
        return list.remove(0);
    }
    
    public <E> boolean comparar(E o1, E o2) {
        return o1.equals(o2);
    }
}
