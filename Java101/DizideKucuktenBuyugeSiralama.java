package Java101;

import java.util.Arrays;
import java.util.Scanner;

public class DizideKucuktenBuyugeSiralama {

    public static void main(String[] args) {

        int diziBoyutu, diziEleman;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu girin : ");
        diziBoyutu = scanner.nextInt();
        int[] arr = new int[diziBoyutu];

        for (int i = 0; i < diziBoyutu; i++) {
            System.out.println("Diziye eklenecek " + (i + 1) + ". sayıyı giriniz");
            diziEleman = scanner.nextInt();
            arr[i] = diziEleman;
        }

        Arrays.sort(arr);

        System.out.println("Dizi küçükten büyüğe sıralandı: \n" + Arrays.toString(arr));

    }
}
