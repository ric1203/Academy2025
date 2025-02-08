package businessRules;

import java.util.ArrayList;
import java.util.List;

/**
 * Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */

public class CountWhile {

    public static List<Integer> createVector(int limit){
        List<Integer> vector = new ArrayList<>();
        int i = 1;
        do {
            vector.add(i);
            i++;
        }while (i <=limit);

        return vector;
    }

    public static void main(String[] args) {
        System.out.println(createVector(100));
    }

}
