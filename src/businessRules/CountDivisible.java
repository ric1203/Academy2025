package businessRules;

import java.util.ArrayList;
import java.util.List;

/**
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */

public class CountDivisible {

    public static List<Integer> divisibleVector(int limit){
        List<Integer> vector = new ArrayList<>();
        int i = 1;
        do {
            if (i%2 == 0 && i%3==0)
                vector.add(i);
            i++;
        }while (i <=limit);

        return vector;
    }

    public static void main(String[] args) {
        System.out.println(divisibleVector(100));
    }

}
