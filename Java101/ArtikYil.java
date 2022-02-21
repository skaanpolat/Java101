package Java101;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl giriniz: ");
        year = scanner.nextInt();

        if ((year % 100 == 0)) {

            if (year % 400 == 0) {
                System.out.println(year + " artık yıldır.");

            }

            System.out.println(year + " artık bir yıl değildir.");

        }
        else if (year % 4 == 0) {
            System.out.println(year + " artık yıldır.");
        }
        else {
            System.out.println(year + " artık bir yıl değildir.");
        }


    }
}
