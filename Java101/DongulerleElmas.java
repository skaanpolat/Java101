package Java101;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;


public class DongulerleElmas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayisi, i;
        System.out.println("Sayı giriniz : ");
        basamakSayisi = scanner.nextInt();


        for (i = 1; i <= basamakSayisi; i++) {
            for (int k = 1; k <= (basamakSayisi - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (i = 1; i <= basamakSayisi; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= (2 * ((basamakSayisi) - (i + 1))); k++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}