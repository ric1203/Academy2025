package businessRules;

import java.util.ArrayList;
import java.util.List;

/**
 * Haz el mismo ejercicio anterior con un bucle for.
 */

public class CountFor {

    public static List<Integer> createVectorFor(int limit){
        List<Integer> vector = new ArrayList<>();

        for (int i=1; i<=limit; i++){
            vector.add(i);
        }

        return vector;
    }

    public static void main(String[] args) {
        System.out.println(createVectorFor(100));
    }

}
