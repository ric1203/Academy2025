package businessRules;

import java.util.Scanner;

public class NumToCharacter {

    public static Character toCharacter(int num){
        return (char) num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ASCII para conocer el caracter");
        int num = sc.nextInt();
        System.out.println(toCharacter(num));
    }
}
