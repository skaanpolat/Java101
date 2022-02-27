package Java101;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, bolenler = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz : ");
        sayi = scanner.nextInt();

        for(int i = 1 ; i<sayi ; i++){
            if(sayi%i ==0){
                bolenler+=i;
            }
        }
        if(sayi==bolenler){
            System.out.println(sayi + " sayısı mükemmel bir sayıdır.");
        }

    }
}
