package businessRules;

import objects.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Realiza una aplicación que nos pida un número de ventas a introducir,
 * después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado.
 * Al final mostrará la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

public class Sales {

    public static double getTotal(List<Product> products){
        double total= 0;
        for (Product p : products){
            total = total+ p.getPrice();
        }
        return total;
    }

    public static void menuProducts(){
        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int inicial;
        int sales;
        System.out.println("Quiere registrar una compra? //si 1, no cualquier otro numero");
        inicial = sc.nextInt();
        if (inicial == 1)
            do {
                System.out.println("Cuantas compras quiere registrar?");
                sales = sc.nextInt();

                for (int i = 0; i < sales; i++){
                    products.add(InvoiceDetail.insertProduct(sc));
                }

                System.out.println("Quiere registrar mas compras? //si 1, no cualquier otro numero");
                inicial = sc.nextInt();
            }while (inicial == 1);

        System.out.println("Su total es: "+getTotal(products));

    }

    public static void main(String[] args) {
        menuProducts();
    }

}
