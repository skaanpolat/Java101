package Java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber, userGuess, right = 5;
        targetNumber = random.nextInt(100);
        int[] wrongGuesses = new int[5];
        System.out.println("Sayı tahmin oyununa hoş geldiniz." +
                "\nTahmin hakkınız 5!\n0 ile 100 arasında bir sayı giriniz : ");

        while (right > 0) {
            userGuess = scanner.nextInt();
            if (userGuess > 100 || userGuess < 0) {
                System.out.println("Lütfen belirtilen aralıkta bir tahmin değeri giriniz!");
            }
            if (userGuess > targetNumber) {
                System.out.println("Tahmininiz hedef sayıdan büyük!");
                wrongGuesses[5 - right] = userGuess;
                right--;
                System.out.println("Kalan tahmin hakkınız :" + right);
            }
            if (userGuess < targetNumber) {
                System.out.println("Tahmininiz hedef sayıdan küçük!");
                wrongGuesses[5 - right] = userGuess;
                right--;
                System.out.println("Kalan tahmin hakkınız :" + right);
            }
            if (userGuess == targetNumber) {
                System.out.println("Tebrikler !");
            }
            if (right == 0) {
                System.out.println("Tüm tahmin haklarınız tükendi!!\n\nTahminleriniz = " + Arrays.toString(wrongGuesses) + "\nHedef sayı " + targetNumber + " idi.");
            }

        }
    }
}