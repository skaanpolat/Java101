package Java101;

import java.util.Scanner;

public class UcakBiletFiyatHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerKm = 0.10, subtotal = 0;
        int distanceToDestination, passengerAge, oneTwo;

        System.out.print("Mesafeyi Km olarak giriniz: ");
        distanceToDestination = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        passengerAge = scanner.nextInt();

        System.out.println("Yolculuk tipini seçiniz:\n" +
                "1) Tek Yön\n" +
                "2) Gidiş-Dönüş");

        oneTwo = scanner.nextInt();

        if ((distanceToDestination <= 0 || passengerAge < 0)) {
            if ((oneTwo != 1) || (oneTwo != 2)) {

                System.out.println("Hatalı veri girdiniz!");
            }
        }

        if (oneTwo == 1) {
            subtotal = (distanceToDestination * pricePerKm);
        }
        if (oneTwo == 2) {
            subtotal = ((distanceToDestination * pricePerKm) * 2);
        }
        System.out.println("Normal Tutar = " + subtotal);
        if (passengerAge < 12) {
            System.out.println("Yaş indirimimiz: %50\nİndirimli Tutar = " + (subtotal * 0.5));

        } else if (passengerAge < 24 && passengerAge >= 12) {
            System.out.println("Yaş indirimimiz: %10\nİndirimli tutar = " + (subtotal * 0.9));
        } else if (passengerAge > 65) {
            System.out.println("Yaş indirimimiz: %30\nİndirimli tutar = " + (subtotal * 0.7));
        }

    }
}
