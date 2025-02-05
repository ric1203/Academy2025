import java.util.Scanner;

public class CalculatorCircle {

    public static double calculateRatio(double ratio){
        return Math.PI* Math.pow(ratio, 2);
    }

    public static void main(String[] args) {
        System.out.println("Ingrese el ratio");
        Scanner sc = new Scanner(System.in);
        double ratio = sc.nextDouble();

        System.out.println(calculateRatio(ratio));
    }

}
