package Java101;

import java.util.Scanner;

public class PalindromikSayilar {
    public static void main(String[] args) {
        int num, temp, digit, digitCounter = 0, numToBeCompared = 0, transformer = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrom mu? Değil mi ? Sayı giriniz : ");
        num = scanner.nextInt();
        temp = num;


        while (temp > 0) {
            digit = temp % 10;
            temp /= 10;
            digitCounter++;
        }
        temp = num;

        while (digitCounter > 0) {
            digit = temp % 10;
            temp /= 10;
            numToBeCompared += ((digit) * (Math.pow(10, digitCounter - 1)));
            digitCounter--;
        }

//        System.out.println("Karşılaştırılacak sayı : " + numToBeCompared);

        String answer = (num == numToBeCompared) ? "Girilen sayı bir palindrom sayıdır." : "Girilen sayı bir palindrom sayı değildir.";
        System.out.println(answer);

    }
}
