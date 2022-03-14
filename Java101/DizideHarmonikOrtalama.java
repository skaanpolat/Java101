package Java101;

public class DizideHarmonikOrtalama {
    public static void main(String[] args) {
        double sum = 0, result = 0, num = 0, harmoni = 0;
        int counter = 1;

        int[] numbers = {15, 6, 7, 12, 7, 9, 3};

        for (double member : numbers) {
            for (double i = 1; i <= member; i++) {

                harmoni += (1 / i);
                sum += harmoni;
                harmoni = 0;
            }

            result += sum;
            sum = 0;
            num += result;
            System.out.println("Dizideki " + counter + ". elemanın harmonik serisi toplamı = " + result);
            result = 0;
            counter++;
        }


        System.out.println("\nDizideki " + numbers.length + " adet sayının her birinin harmonik serilerinin toplamı = " + num
                + "\nDizinin harmonik ortalaması ise = " + num / numbers.length);

    }
}
