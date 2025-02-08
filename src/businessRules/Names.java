package businessRules;

import java.util.ArrayList;
import java.util.List;

/**
 * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
 *
 * Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
 *
 * Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
 *
 * Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
 *
 * Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
 *
 * N.es_A.ia_E.pe
 */

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
