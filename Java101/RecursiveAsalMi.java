package Java101;

import java.util.Scanner;

public class RecursiveAsalMi {
    public static void main(String[] args) {
        int num, x;
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        num = s.nextInt();


        RecursiveAsalMi obj = new RecursiveAsalMi();


        x = obj.prime(num, 2);


        if (x == 1) {
            System.out.println(num + " asal sayıdır.");
        } else {
            System.out.println(num + " asal sayı değildir.");
        }

    }

    int prime(int y, int i) {
        if (i < y) {
            if (y % i != 0) {
                return (prime(y, ++i));
            } else {
                return 0;
            }
        }
        return 1;
    }


}
