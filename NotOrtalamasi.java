import java.util.Scanner;

public class NotOrtalamasi {
    public static double NotOrtalama (double a, double b){
        return (a+b)/2;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matV, fizV, kimV, trkV, trhV, mzkV, matF, fizF, kimF, trkF, trhF, mzkF;


        System.out.println("Matematik vize notunuz: ");
        matV = scanner.nextInt();

        System.out.println("Fizik vize notunuz: ");
        fizV = scanner.nextInt();

        System.out.println("Kimya vize notunuz: ");
        kimV = scanner.nextInt();

        System.out.println("Türkçe vize notunuz: ");
        trkV = scanner.nextInt();

        System.out.println("Tarih vize notunuz: ");
        trhV = scanner.nextInt();

        System.out.println("Müzik vize notunuz: ");
        mzkV = scanner.nextInt();

        System.out.println("Matematik final notunuz: ");
        matF = scanner.nextInt();

        System.out.println("Fizik final notunuz: ");
        fizF = scanner.nextInt();

        System.out.println("Kimya final notunuz: ");
        kimF = scanner.nextInt();

        System.out.println("Türkçe final notunuz: ");
        trkF = scanner.nextInt();

        System.out.println("Tarih final notunuz: ");
        trhF = scanner.nextInt();

        System.out.println("Müzik final notunuz: ");
        mzkF = scanner.nextInt();

        boolean matGectiMi = NotOrtalama(matV,matF) >=60;
        String matSonuc = matGectiMi? " Geçtiniz" : " Kaldınız";
        boolean fizGectiMi = NotOrtalama(fizV,fizF) >=60;
        String fizSonuc = fizGectiMi? " Geçtiniz" : " Kaldınız";
        boolean kimGectiMi = NotOrtalama(kimV,kimF) >=60;
        String kimSonuc = kimGectiMi? " Geçtiniz" : " Kaldınız";
        boolean trkGectiMi = NotOrtalama(trkV,trkF) >=60;
        String trkSonuc = trkGectiMi? " Geçtiniz" : " Kaldınız";
        boolean trhGectiMi = NotOrtalama(trhV,trhF) >=60;
        String trhSonuc = trhGectiMi? " Geçtiniz" : " Kaldınız";
        boolean mzkGectiMi = NotOrtalama(mzkV,mzkF) >=60;
        String mzkSonuc = mzkGectiMi? " Geçtiniz" : " Kaldınız";

        System.out.println("********* Ders ortalamaları ve Durum *********\n" +
                "Matematik: " + NotOrtalama(matV,matF) + matSonuc +
                "\nFizik: " + NotOrtalama(fizV,fizF) + fizSonuc +
                "\nKimya: " + NotOrtalama(kimV,kimF) + kimSonuc +
                "\nTürkçe: "+ NotOrtalama(trkV,trkF) + trkSonuc +
                "\nTarih: " + NotOrtalama(trhV,trhF) +trhSonuc +
                "\nMüzik: " + NotOrtalama(mzkV,mzkF) + mzkSonuc);
        System.out.println("**********************************************");







    }


}
