package Java101;

import java.util.Scanner;

public class LimiteKadar4Ve5inKuvvetleri {
    public static void main(String[] args) {
        int num, kuvvet4Sayac = 0, kuvvet5Sayac = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i *= 4) {

            System.out.println("4'ün " + kuvvet4Sayac + ". kuvveti: " + i);
            kuvvet4Sayac++;
        }

        for (int i = 1; i <= num; i *= 5) {

            System.out.println("5'in " + kuvvet5Sayac + ". kuvveti: " + i);
            kuvvet5Sayac++;
        }
    }
}

