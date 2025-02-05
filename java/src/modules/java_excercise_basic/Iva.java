import java.util.Scanner;

public class Iva {

    public static final double iva = 0.21D;

    public static Double increase(double price){
        return price + ((iva / 100)*iva);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto");
        double price = sc.nextDouble();
        System.out.println(increase(price));
    }
}
