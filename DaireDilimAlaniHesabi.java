import java.util.Scanner;

public class DaireDilimAlaniHesabi {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
//        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        System.out.println("Dairenin yarı çapını giriniz: ");
        double r = scanner.nextDouble();
        System.out.println("Merkez açı ölçüsünü giriniz: ");
        double a = scanner.nextDouble();
        double sonuc= (pi * (r*r) * a) / 360;
        System.out.println("Dilimin alanı: " + sonuc);

    }
}
