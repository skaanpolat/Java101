package Java101;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
    int num1, num2, divider = 0, ebob = 0, ekok = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı 1: ");
        num1 = scanner.nextInt();
        System.out.println("Sayı 2: ");
        num2 = scanner.nextInt();

        while (divider<=num1 && divider<=num2){
            divider++;
            if (num1%divider==0 && num2%divider==0){
                ebob =divider;
                ekok = ((num1*num2)/(ebob));
            }

        }
        System.out.println(num1 +" ve " +num2 +" için; \nE.B.O.B : " + ebob + "\nE.K.O.K : "+ ekok);

    }
}
