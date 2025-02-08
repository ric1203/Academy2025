package businessRules;

import objects.ParamsQ;

import java.util.Scanner;

/**
 *  Realiza una aplicación que nos calcule una ecuación de segundo grado.
 *  Debes pedir las variables a, b y c por teclado y comprobar antes que el
 *  discriminante (operación en la raíz cuadrada).
 *  Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
 */

public class Quadratic {

    public static void processQuadratic(ParamsQ paramsQ, double d){
        double x1=((paramsQ.getB() * (-1)) + Math.sqrt(d)) / (2 * paramsQ.getA());
        double x2=((paramsQ.getB() * (-1)) - Math.sqrt(d)) / (2 * paramsQ.getA());
        System.out.println("La ecuación es: "+ paramsQ.getA()+"x^2+ "+
                paramsQ.getB() + "x + "+paramsQ.getC()+"= 0");
        System.out.println("El valor de x1: "+ x1+" \nEl valor de x2 es: "+x2);
    }

    public static double discriminating(ParamsQ paramsQ){
        return Math.pow(paramsQ.getB(),2)-4* paramsQ.getA()* paramsQ.getC();
    }

    public static void menu(){
        double a, b ,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la variable a");
        a = sc.nextDouble();
        System.out.println("Ingrese la variable b");
        b = sc.nextDouble();
        System.out.println("Ingrese la variable c");
        c = sc.nextDouble();
        ParamsQ paramsQ = new ParamsQ(a,b,c);
        double d = discriminating(paramsQ);
        if (d>0)
            processQuadratic(paramsQ,d);
        else
            System.out.println("no tiene solución");
    }

    public static void main(String[] args) {
        menu();
    }

}
