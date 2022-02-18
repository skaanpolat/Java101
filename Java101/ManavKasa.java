package Java101;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armutFiyat, elmaFiyat, domatesFiyat, muzFiyat, patlicanFiyat;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        armutFiyat = 2.14;
        elmaFiyat = 3.67;
        domatesFiyat = 1.11;
        muzFiyat = 0.95;
        patlicanFiyat = 5;
        System.out.print("Armut Kaç Kilo? : ");
        armutKilo = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo? : ");
        elmaKilo = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo? : ");
        domatesKilo = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo? : ");
        muzKilo = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? : ");
        patlicanKilo = scanner.nextDouble();

        System.out.println("Toplam Tutar: "
                + ((armutFiyat * armutKilo)
                + (elmaFiyat * elmaKilo)
                + (domatesFiyat * domatesKilo)
                + (muzFiyat * muzKilo)
                + (patlicanFiyat * patlicanKilo))
                + " TL ");

    }
}
