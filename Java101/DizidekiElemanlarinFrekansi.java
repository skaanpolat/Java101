package Java101;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int counter, val = -1;
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " +Arrays.toString(arr) + "\nTekrar Sayıları ");

        for (int i = 0; i < arr.length; i++) {
            counter = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                    arr[j]=val;
                }
            }
            if(arr[i]!=val){
                System.out.println(arr[i] + " sayısı " + counter + " kere tekrar edildi.");

            }

        }
    }
}
