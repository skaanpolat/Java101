package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class DizideEnYakinMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, closestMin = 0, closestMax = 0, temp = 0;
        System.out.println("Sayı giriniz : ");
        num = scanner.nextInt();

        int[] numbers = {2, 134, 4, 6, 34, 5678, 12, 56, 0, -12, -56, -3457890, 4589};


        System.out.println("Girilen Dizi : " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("\nSıralanmış Dizi : " + Arrays.toString(numbers));

        System.out.println("\nGirilen Sayı : "+ num);

        for (int numInArr : numbers) {

            if (numInArr < num) {
                closestMin = numInArr;

            }
            if ((numInArr > num)) {
                closestMax = numInArr;
                break;
            }

        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestMin);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestMax);


    }
}
