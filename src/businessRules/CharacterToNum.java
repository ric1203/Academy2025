package businessRules;

import java.util.Scanner;

public class CharacterToNum {

    public static int toNum(char c){
        return (int) c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un caracter");
        String l = sc.next();
        char c = l.charAt(0);
        System.out.println(toNum(c));
    }
}
