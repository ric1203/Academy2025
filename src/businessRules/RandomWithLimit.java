package businessRules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomWithLimit {

    public static List<Integer> randomizer(int start, int end){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i<10; i++){
            numbers.add(ThreadLocalRandom.current().nextInt(start, end + 1));
        }
        return numbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.println("Escriba un numero");
        n1 = sc.nextInt();
        System.out.println("Escriba otro numero");
        n2 = sc.nextInt();
        List<Integer> numbers = Decrease.accommodated(n1,n2);
        System.out.println(randomizer(numbers.get(1),numbers.get(0)));
    }

}
