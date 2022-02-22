package Java101;

import java.util.Scanner;

public class UsluSayiFor {
    public static void main(String[] args) {
        int tamSayi, kuvvetSayısı, sonuc = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kuvveti Hesaplanacak Sayıyı Giriniz: ");
        tamSayi = scanner.nextInt();
        System.out.println("Kaçıncı kuvveti ? : ");
        kuvvetSayısı = scanner.nextInt();

        for (int i = 1; i <= kuvvetSayısı; i++) {
            sonuc *= (tamSayi);

        }
        System.out.println(sonuc);


    }
}
