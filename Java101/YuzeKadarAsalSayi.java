package Java101;

public class YuzeKadarAsalSayi {
    public static void main(String[] args) {

        int sayi, asal, temp;
        for (
                int i = 2;
                i < 101; i++) {
            temp = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp == 0) {
                System.out.print(i + ", ");
            }

        }


    }

}






