package Java101;

import java.util.Scanner;

public class PalindromikKelimeler {
    public static void main(String[] args) {
        String userEntry, reversed = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Palindrom kontrolü için kelime veya cümleyi giriniz: ");
        userEntry = scanner.nextLine();

        for (int i = userEntry.length() - 1; i >= 0; i--) {
            reversed += userEntry.charAt(i);
        }
        if (userEntry.equals(reversed)) {
            System.out.println(userEntry + " palindromiktir.");
        } else {
            System.out.println(userEntry + " palindromik  DEĞİLDİR!");
        }

    }
}
