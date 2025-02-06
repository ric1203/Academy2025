package businessRules;

import java.util.ArrayList;
import java.util.List;

public class Names {

    public static String convertName(String name){
        int length = name.length();
        StringBuilder newNames = new StringBuilder();
        if (length <=2 )
            return "";
        List<String> letters = List.of(name.split(""));
        newNames.append(letters.get(1).toUpperCase()).append(".")
                .append(letters.get(length-2)).append(letters.get(length-1));
        return newNames.toString();
    }

    public static String unionOfWords(List<String> names){
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (String s: names){
            if (flag)
                sb.append("_");
            sb.append(convertName(s));
            flag = true;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       // System.out.println(convertName("Ricardo"));
        List<String> names = new ArrayList<>();
        names.add("Ricardo");
        names.add("Israel");
        names.add("Castellon");

        System.out.println(unionOfWords(names));
    }
}
