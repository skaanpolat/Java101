import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        float gidilenYol, tlPerKm, minTutar, toplamTutar, odenecekTutar, acilis;
        acilis = 10; tlPerKm = 2.2f; minTutar = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilen mesafe kaç km? ");
        gidilenYol = scanner.nextFloat();
        odenecekTutar = acilis + tlPerKm * gidilenYol;
        toplamTutar = (odenecekTutar < 20) ? (minTutar) : (odenecekTutar);
        System.out.println("Ödemeniz gereken tutar : " + toplamTutar + " TL.");

    }
}
