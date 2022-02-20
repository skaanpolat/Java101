package Java101;

import java.util.Scanner;

public class KucuktenBuyuge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, min, mid, max, minmin, maxmax;


        System.out.println("1. Sayı: ");
        a = scanner.nextInt();
        System.out.println("2. Sayı: ");
        b = scanner.nextInt();
        System.out.println("3. Sayı: ");
        c = scanner.nextInt();

        min = (a < b) ? a : b;
        minmin = min < c ? min : c;
        max = (a > b) ? a : b;
        maxmax = max > c ? max : c;
        mid = a + b + c - minmin - maxmax;

        System.out.println(minmin + " > " + mid + " > " + maxmax);


    }
}
