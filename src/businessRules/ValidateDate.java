package businessRules;

import enums.Days;
import utilities.Utils;

import java.util.Scanner;

/**
 * Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no.
 * Usa un switch para ello.
 */

public class ValidateDate {

    public static void validate(Days day){
        switch (day){
            case lunes: case martes: case miercoles: case jueves: case viernes:
                System.out.println("Día laboral");
                break;

            case sabado: case domingo:
                System.out.println("Día no laboral");
                break;
            default:
                System.out.println("Dato no valido");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un día de la semana");
            validate(Days.getEnum(Utils.deleteDiacritics(sc.next()).toLowerCase().trim()));
    }

}
