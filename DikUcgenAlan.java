import java.util.Scanner;

public class DikUcgenAlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, u, alan;

        System.out.println("A kenarını giriniz: ");
        a = scanner.nextDouble();
        System.out.println("B kenarını giriniz: ");
        b = scanner.nextDouble();
        System.out.println("C kenarını giriniz: ");
        c = scanner.nextDouble();

        u = (a + b + c) / 2.0;
        
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);

    }
}
