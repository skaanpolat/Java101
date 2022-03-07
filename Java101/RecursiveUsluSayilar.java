package Java101;

import java.util.Scanner;

public class RecursiveUsluSayilar {

    static int power(int taban , int kuvvet){

        if (kuvvet !=0){
            int sonuc = 1;
            sonuc *= (taban * power(taban,kuvvet-1));
            return sonuc;
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int taban = scanner.nextInt();
        System.out.println("Kuvvet değerini giriniz : ");
        int kuvvet = scanner.nextInt();

        System.out.println(power(taban,kuvvet));
    }
}
