package Java101;

import java.util.Arrays;

public class DizideTekrarEdenCiftSayilar {
    public static void main(String[] args) {
        int counter = 0, temp;

        int[] numbers = {1, 3, 5, 4, 7, 1, 12, 4, 567, 89, 3, 23, 34, 0, 542, 6, 12, 12, 7, 2, 89, 542, 34, 23};
        int[] twinEven = new int[numbers.length - 1];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((i != j) && (numbers[i] == numbers[j] && (numbers[i] % 2 == 0))) {

                    twinEven[counter++] = numbers[i];

                }
            }
        }

        System.out.print("Tekrar eden çift sayılar : ");

        for (int i = 0; i < twinEven.length; i++) {
            temp = 0;
            for (int j = 0; j < i; j++) {
                if (twinEven[i] == twinEven[j]) {
                    temp = 1;
                    break;
                }
            }

            if (temp == 0 && twinEven[i] != 0) {

                System.out.print(twinEven[i] + ", ");
            }
        }


    }

}
