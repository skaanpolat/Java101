package Java101;

import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2; int choice;

        System.out.println("**************************\nBasit Hesap Makinesi\n**************************" +
                "\nYapılacak işlemi seçiniz.\n1-) Toplama\n2-) Çıkartma\n3-) Çarpma\n4-) Bölme");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                System.out.println("İşlem yapılacak 1. sayıyı giriniz");
                n1 =scanner.nextInt();
                System.out.println("İşlem yapılacak 2. sayıyı giriniz");
                n2 =scanner.nextInt();
                System.out.println("Sonuc:" + (n1+n2));
                break;
            case 2:
                System.out.println("İşlem yapılacak 1. sayıyı giriniz");
                n1 =scanner.nextInt();
                System.out.println("İşlem yapılacak 2. sayıyı giriniz");
                n2 =scanner.nextInt();
                System.out.println("Sonuc:" + (n1-n2));
                break;
            case 3:
                System.out.println("İşlem yapılacak 1. sayıyı giriniz");
                n1 =scanner.nextInt();
                System.out.println("İşlem yapılacak 2. sayıyı giriniz");
                n2 =scanner.nextInt();
                System.out.println("Sonuc:" + (n1*n2));
                break;
            case 4:
                System.out.println("İşlem yapılacak 1. sayıyı giriniz");
                n1 =scanner.nextInt();
                System.out.println("İşlem yapılacak 2. sayıyı giriniz");
                n2 =scanner.nextInt();
                System.out.println("Sonuc:" + (n1/n2));
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz!");
        }
    }
}
