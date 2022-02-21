package Java101;

import java.util.Scanner;

public class BurcProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day, month;
        System.out.print("Doğduğunuz gün: ");
        day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Doğduğunuz ay: ");
        month = scanner.nextInt();
        scanner.nextLine();
        if ((day >= 21 && month == 3) || (day <= 20 && month == 4))
            System.out.println("Burcunuz : Koç");
        if ((day >= 24 && month == 9) || (day <= 23 && month == 10))
            System.out.println("Burcunuz : Terazi");
        if ((day >= 21 && month == 4) || (day <= 21 && month == 5))
            System.out.println("Burcunuz : Boğa");
        if ((day >= 24 && month == 10) || (day <= 22 && month == 11))
            System.out.println("Burcunuz : Akrep");
        if ((day >= 22 && month == 5) || (day <= 21 && month == 6))
            System.out.println("Burcunuz : İkizler");
        if ((day >= 23 && month == 11) || (day <= 21 && month == 12))
            System.out.println("Burcunuz : Yay");
        if ((day >= 21 && month == 6) || (day <= 23 && month == 7))
            System.out.println("Burcunuz : Yengeç");
        if ((day >= 22 && month == 12) || (day <= 20 && month == 1))
            System.out.println("Burcunuz : Oğlak");
        if ((day >= 24 && month == 7) || (day <= 23 && month == 8))
            System.out.println("Burcunuz : Aslan");
        if ((day >= 21 && month == 1) || (day <= 19 && month == 2))
            System.out.println("Burcunuz : Kova");
        if ((day >= 24 && month == 8) || (day <= 23 && month == 9))
            System.out.println("Burcunuz : Başak");
        if ((day >= 20 && month == 2) || (day <= 20 && month == 3))
            System.out.println("Burcunuz : Balık");
    }
}

