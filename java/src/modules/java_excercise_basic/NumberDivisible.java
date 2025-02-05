import java.util.Scanner;

public class NumberDivisible {

    public static boolean divisible(int number){
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        if (divisible(num))
            System.out.println("Este numero es divisible");
        else
            System.out.println("Este numero no es divisible");
    }
}
