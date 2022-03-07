package Java101;

import java.util.Scanner;

public class RecursiveDesen {

    static int a = 0;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı girin:");
        int num = scan.nextInt();
        ayna(num, num);
    }

    static void ayna(int num, int i) {
        System.out.print(num + " ");

        if (num > 0 && a == 0) {
            ayna(num - 5, i);
        } else if (num <= 0 || a == 1) {
            a = 1;
            if (num < i)
                ayna(num + 5, i);
        }

    }
}