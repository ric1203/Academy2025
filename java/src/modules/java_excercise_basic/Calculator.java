public class Calculator {

    public static void main(String[] args) {
        int num, num2;
        num = 10;
        num2 = 5;

        int sum = num + num2;
        System.out.println("Resultado Suma: "+ sum);

        int multi = num * num2;
        System.out.println("Resultado Multiplicacion: "+ multi);

        int rest = num - num2;
        System.out.println("Resultado Resta: "+rest);

        double div = (double) num / num2;
        System.out.println("Resultado Div: "+ div);

        double module = num % num2;
        System.out.println("Resto: "+ module);
    }

}
