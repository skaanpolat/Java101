package Java101;

import java.util.Scanner;

public class TekGirCiftVe4Topla {

    public static void main(String[] args) {
        int num, total = 0;
        boolean isEven = true;

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.print("Sayı giriniz: ");
            num = scanner.nextInt();
            if ((num % 2 == 0 || num == 0) && (num % 4 == 0)) total += num;
            else if (num % 2 == 1) {
                System.out.println(total);
                isEven = false;
            }
        } while (isEven);

    }
}
