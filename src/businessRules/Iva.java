package businessRules;

import java.util.Scanner;

public class Iva {

    public static final double iva = 21D;

    public static Double increase(double price){
        return increaseIvaVariable(price,iva);
    }

    public static Double increaseIvaVariable(double price, double newIva){
        return price + ((newIva / 100) * price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double price = sc.nextDouble();
        System.out.println(increase(price));
    }
}
