package Java101.BoksMaci;

public class Main {

    public static void main(String[] args) {

        Fighter marc = new Fighter("Marc" , 45 , 100, 90, 50);
        Fighter alex = new Fighter("Alex" , 45 , 100, 100, 50);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();

    }
}
