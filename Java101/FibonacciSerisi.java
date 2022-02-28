package Java101;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter, num1 = 0, num2 = 1, num3 = 0, sum = 0;
        System.out.println("Kaç elemanlı bir fibonacci serisi yazılsın ? : ");
        counter = scanner.nextInt();

        for (int i = 0; i < counter; i++) {
            sum = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + sum);
            num2 = num1;
            num1 = sum;
        }

    }
}
