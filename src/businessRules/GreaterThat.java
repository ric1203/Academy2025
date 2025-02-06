package businessRules;

public class GreaterThat {

    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 10;

        if (n1 == n2)
            System.out.println("Los numeros son iguales");

        else if (n1 > n2)
            System.out.println("el numero 1 es mayor que el numero 2");
        else if (n1< n2) {
            System.out.println("el numero 2 es mayor que el numerto 1");

        }
    }
}
