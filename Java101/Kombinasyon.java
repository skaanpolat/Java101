package Java101;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int C, n,r, nfaktoriyel=1,rfaktoriyel=1, nEksiRfaktoriyel=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eleman  Sayısını (n) Girin: ");
        n = scanner.nextInt();
        System.out.println("Kombinasyon sayısını (r) Girin: ");
        r = scanner.nextInt();

        for (int i = 1 ; i<= n ; i++) {

            nfaktoriyel = nfaktoriyel*i;

        }
        for (int i = 1 ; i<= r ; i++) {

            rfaktoriyel = rfaktoriyel*i;

        }
        for (int i = 1 ; i<= (n-r) ; i++) {

            nEksiRfaktoriyel = nEksiRfaktoriyel*i;

        }

        C= (nfaktoriyel/(rfaktoriyel*(nEksiRfaktoriyel)));
        System.out.println("Kombinasyon 'C(n,r) = n! / (r! * (n-r)!)'  = " + C);
    }
}
