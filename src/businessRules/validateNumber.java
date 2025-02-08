package businessRules;

import java.util.Scanner;

/**
 * Lee un número por teclado y comprueba que este número es mayor o igual que cero,
 * si no lo es lo volverá a pedir (do while),
 * después muestra ese número por consola.
 */

public class validateNumber {

    public static boolean validateNum(int num){
        return num >= 0;
    }

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        int num = 0;
        do {
            if (!flag)
                System.out.println("ingrese un numero");
            else{
                System.out.println("numero invalido: "+num+ "\n Ingrese un nuevo numero");
            }
            num = sc.nextInt();
            flag = true;
        }while (!validateNum(num));
        System.out.println("numero valido: "+num);

    }

    public static void main(String[] args) {
        menu();
    }

}
