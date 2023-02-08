package homeWork.converter;

import java.util.Scanner;

public class ConvertorDemo {
    public static void main(String[] args) {
        ConvertorOperation convertorOperation = new ConvertorOperation();

        Scanner scan = new Scanner(System.in);

        System.out.print("EUR: ");
        int x = scan.nextInt();

        double result = convertorOperation.converter(x);
        result = Math.round(result * 100);
        result = result /100;

        System.out.println("USD: " + result);





    }
}
