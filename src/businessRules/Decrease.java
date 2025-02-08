package businessRules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
 *
 * Podría ser utilizando operador ternario.
 */

public class Decrease {

    public static List<Integer> accommodated(int num1, int num2){
        List<Integer> numbers = new ArrayList<>();
        if (num1 <= num2){
            numbers.add(num2);
            numbers.add(num1);
        } else {
            numbers.add(num1);
            numbers.add(num2);
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = sc.nextInt();
        System.out.println(accommodated(num1, num2));
        System.out.println((num1 >= num2) ? num1+", "+num2 : num2+", "+num1);
    }

}
