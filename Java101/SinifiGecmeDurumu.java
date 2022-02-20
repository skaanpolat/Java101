package Java101;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int mat, fiz, trk, kim, mzk;
        int dersSayisi = 0;
        int notToplami = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = scanner.nextInt();
        if (mat < 0 || mat > 100){
            System.out.println("Hatalı not girişi.\n" +
                    "Ders notu değeri 0 ve 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        else {
        notToplami += mat;
        dersSayisi++;}

        System.out.print("Fizik notunuz: ");
        fiz = scanner.nextInt();
        if (fiz < 0 || fiz > 100){
            System.out.println("Hatalı not girişi.\n" +
                    "Ders notu değeri 0 ve 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        else {
            notToplami += fiz;
            dersSayisi++;}


        System.out.print("Türkçe notunuz: ");
        trk = scanner.nextInt();
        if (trk < 0 || trk > 100){
            System.out.println("Hatalı not girişi.\n" +
                    "Ders notu değeri 0 ve 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        else {
            notToplami += trk;
            dersSayisi++;}

        System.out.print("Kimya notunuz: ");
        kim =scanner.nextInt();
        if (kim < 0 || kim > 100){
            System.out.println("Hatalı not girişi.\n" +
                    "Ders notu değeri 0 ve 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        else {
            notToplami += kim;
            dersSayisi++;}

        System.out.print("Müzik notunuz: ");
        mzk = scanner.nextInt();
        if (mzk < 0 || mzk > 100){
            System.out.println("Hatalı not girişi.\n" +
                    "Ders notu değeri 0 ve 100 arasında olmadığı için ortalamaya dahil edilmeyecektir.");
        }
        else {
            notToplami += mzk;
            dersSayisi++;}

        double average = notToplami / dersSayisi ;

        if (average < 55) {
            System.out.println("\nSınıfta kaldınız. Seneye tekrar görüşmek üzere.\n" +
                    "Ortalamanız : " + average);
        }
            else {
                System.out.println("\nTebrikler sınıfı geçtiniz\n" +
                        "Ortalamanız : " + average);
            }






    }
}
