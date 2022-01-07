package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class ExemploGenerics {

    public static void print(Collection<? extends Number> list) {
        for (Number n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Number> li = Arrays.asList(3, 4, 6, 8, 11, 15, 28, 32);
        ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(3, 4, 6, 8, 10, 11, 15, 28, 32));
        Collection<Integer> al2 = al1;
        
        print(li);
        print(al1);
        print(al2);
    }
}
