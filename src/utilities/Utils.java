package utilities;

import java.text.Normalizer;

public class Utils {

    public static String deleteDiacritics(String word){
        return Normalizer.normalize(word, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

}
