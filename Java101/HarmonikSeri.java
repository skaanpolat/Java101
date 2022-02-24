package Java101;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double sayi;
        double harmoni = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = scanner.nextInt();

        for (double i = 1; i <= sayi; i++) {
            harmoni += 1 / i;
        }
        System.out.println("Girilen sayının Harmoni serisi toplamı = " + harmoni);


    }

}
