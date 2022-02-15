package Java101;

import java.util.Scanner;

public class VucutKitle {

    public static void main(String[] args) {
        double kilo, boy, indeks;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Boyunuzu metre olarak girin: ");
        boy = scanner.nextDouble();
        System.out.print("Kilonuzu girin: ");
        kilo = scanner.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz : " + indeks);


    }


}