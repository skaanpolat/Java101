import java.util.Scanner;

public class KdvTutarHesabi {
    public static void main(String[] args) {
        double urunFiyati, kdv1,kdv2, kdv, kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        kdv1 = 0.18;
        kdv2 = 0.08;

        System.out.print("Ürün fiyatını belirtiniz: ");
        urunFiyati= scanner.nextDouble();
        kdv = (urunFiyati>=1000) ? kdv1: kdv2;


        kdvliTutar = urunFiyati + urunFiyati*kdv;

        System.out.println("Ürün Fiyatı: " +urunFiyati + "\nKDV oranı: " + kdv  + "\nKDV'li toplam tutar: " + kdvliTutar );

    }
}
