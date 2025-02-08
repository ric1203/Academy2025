package businessRules;

import resources.Constants;

import javax.swing.*;
import java.util.Scanner;

/**
 * Escribe una aplicación con un String que contenga una contraseña cualquiera.
 * Después se te pedirá que introduzcas la contraseña, con 3 intentos.
 * Cuando aciertes ya no pedirá más la contraseña y mostrará un mensaje diciendo «Enhorabuena».
 * Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */

public class Login {

    public static boolean validatePassword(String pass){
        return Constants.Security.password.equals(pass);
    }

    static void menu(){
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        String pass;
        do {
            System.out.println("Inserta la contraseña:");
            pass = sc.next();
            attempts++;
        }while (!validatePassword(pass));
        if (attempts<3)
            JOptionPane.showMessageDialog(null,"Felicidades. Ingresaste!!!!!","Felicidades",JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        menu();
    }

}
