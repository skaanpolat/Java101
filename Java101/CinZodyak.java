package Java101;

import java.util.Scanner;

public class CinZodyak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth;

        System.out.print("Doğum Yılınızı Giriniz : ");
        yearOfBirth = scanner.nextInt();

        if (yearOfBirth % 12 == 0) {
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if (yearOfBirth % 12 == 1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz ");

        } else if (yearOfBirth % 12 == 2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek ");

        } else if (yearOfBirth % 12 == 3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz ");

        } else if (yearOfBirth % 12 == 4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare ");

        } else if (yearOfBirth % 12 == 5) {
            System.out.print("Çin Zodyağı Burcunuz : Öküz ");

        } else if (yearOfBirth % 12 == 6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan ");

        } else if (yearOfBirth % 12 == 7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavşan ");

        } else if (yearOfBirth % 12 == 8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha ");

        } else if (yearOfBirth % 12 == 9) {
            System.out.print("Çin Zodyağı Burcunuz : Yılan ");

        } else if (yearOfBirth % 12 == 10) {
            System.out.print("Çin Zodyağı Burcunuz : At ");

        } else if (yearOfBirth % 12 == 11) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun ");
        }

    }
}
