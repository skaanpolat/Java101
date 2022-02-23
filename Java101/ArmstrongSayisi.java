package Java101;

import java.util.Scanner;

public class ArmstrongSayisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number, temp, digitCount = 0, digitPower, digit, digitPowerSum = 0, singleDigitPower = 1;

        System.out.print("Armstrong Sayı Nedir ?\n" +
                "N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.\n" +
                "Sayıyı Giriniz: ");
        number = scanner.nextInt();

        System.out.println("\n\nGirilen sayı = " + number);


        temp = number; /* Girilen sayının üstünde aşağıdaki değişiklikler yapılacağı için,
        aynı değeri tutacak başka bir değişken daha kullan */


        while (number > 0) {
            //Basamak sayısını bul.
            number /= 10;
            digitCount++;
        }
        digitPower = digitCount; // Basamak sayısını kuvvet sayısı olarak ata.


        System.out.println("\nBasamak sayısı = " + digitCount);

        number = temp;


        while (number > 0) {
            digit = (int) (number % 10); // Her basamak için sayı%10 alıp, o basamaktaki rakamı ayır.
            number /= 10; // Ayırdığın rakamı sayıdan çıkar ve yeni değeri sayıya tekrar ata.

            System.out.println("Sondaki rakam : " + digit);
            System.out.println("Sondaki basamak eksliltilince kalan sayi : " + number + "\n");

            for (int i = 1; i <= digitPower; i++) {
                singleDigitPower *= digit; //Her rakamın, basamak sayısı kadar kuvvetini al.

            }

            System.out.println("Sondaki " + digit + " rakamının, girilen sayının basamak sayısı olan " + digitCount + ". kuvveti = " + singleDigitPower);
            digitPowerSum += singleDigitPower; //Kuvveti alınan her basamağın değerini bir değişkende topla.
            singleDigitPower = 1; //Yukarıdaki for döngüsüyle değeri değişen basamak kuvvetini başlangıç değerine çevir.
        }


        System.out.println("--------------------------------\nHesap Sonu;\nElde edilen toplam: " + digitPowerSum + "\n--------------------------------");
        number = temp; // Girilen sayının üstünde yukarıdaki değişiklikler yapıldıktan sonra asıl değeri geri çağır.


        String isArmstrong = ((number == digitPowerSum) ? (number + " bir armstrong sayıdır") : (number + " bir armstrong sayı DEĞİLDİR!"));
        System.out.println(isArmstrong);

    }
}
