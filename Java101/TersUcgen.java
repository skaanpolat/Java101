package Java101;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamakSayisi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ters üçgen için basamak sayısı girin : ");
        basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = i; j <= basamakSayisi - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
