package businessRules;

import objects.Bill;
import objects.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
 *
 * Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
 *
 * Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
 *
 * Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
 *
 * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
 *
 * Por ejemplo, el resultado podría ser algo así:
 *
 * La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
 *
 *
*/

public class InvoiceDetail {

    public static String createTicket(Bill bill){
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        sb.append("**").append(bill.getTitle()).append("**").append("\n");
        sb.append("--------------------------").append("\n");
        sb.append("Descripcion: ").append(bill.getDescription()).append("\n");
        sb.append("producto ....................... precio con Iva").append("\n");

        for (Product product : bill.getProducts()){
            if (flag)
                sb.append("\n").append(" ....................... ").append("\n");
            sb.append(product.getName()).append(" .............................. ");
            product.addIva();
            sb.append(product.getPriceIva());
            flag = true;
        }
        bill.addTotal();
        sb.append("\n").append("Total sin impuesto:              ").append(bill.getGross());
        sb.append("\n").append("Con un impuesto                  ").append(bill.getIvaTotal());
        sb.append("\n").append("Total con impuesto               ").append(bill.getTotal());


        return sb.toString();
    }

    public static Product insertProduct (Scanner sc){
        String name;
        double price;
        Product product = new Product();
        System.out.println("Ingrese el nombre del producto");
        name = sc.next();
        product.setName(name);
        System.out.println("Ingrese el precio del producto");
        price = sc.nextDouble();
        product.setPrice(price);
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo de la factura");
        String title = sc.nextLine();
        System.out.println("Ingrese la descripcion de la factura");
        String description = sc.nextLine();
        int choice= 0;
        List<Product> products = new ArrayList<>();
        do{
            products.add(insertProduct(sc));
            System.out.println("¿Quiere ingresar un producto? //escriba 1 si o 2 no");
            choice = sc.nextInt();
        }while (choice == 1);
        Bill bill = new Bill(title, description, products);
        System.out.println(createTicket(bill));
    }
}
