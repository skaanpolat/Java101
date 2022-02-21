package Java101;

import java.util.Scanner;

public class LimiteKadarTamBolenOrtalamasi {
    public static void main(String[] args) {
        int sayi = 0, i, j, sayac = 0, bolunenler = 0;
        double ortalama;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı girin: ");
        sayi = scanner.nextInt();

        for (i = 1; i <= sayi; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println("i = " + i);
                bolunenler += i;
                sayac++;
            }
        }
        ortalama = bolunenler / sayac;
        System.out.println("Girdiğiniz " + sayi + " sayısına kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması= " + ortalama);


    }
}
