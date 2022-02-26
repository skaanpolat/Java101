package Java101;

import java.util.Scanner;

public class GirilenlerinMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputAmount , number, maxInput = 0, minInput = 0;
        System.out.println("Kaç adet sayı gireceksiniz? ");
        inputAmount = scanner.nextInt();

        for (int i =1 ; i<=inputAmount; i++){
            System.out.println(i + ". sayıyı giriniz : ");
            number = scanner.nextInt();
            if (number>maxInput){
                maxInput=number;
            }
            if(number<minInput){
                minInput=number;
            }
        }
        System.out.print("En büyük sayı : " + maxInput);
        System.out.println("\nEn küçük sayı : " + minInput);

    }
}
